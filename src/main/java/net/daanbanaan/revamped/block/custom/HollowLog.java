package net.daanbanaan.revamped.block.custom;

import java.util.stream.Stream;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

import javax.annotation.Nullable;

public class HollowLog extends Block {
	public static final MapCodec<Block> CODEC = simpleCodec(HollowLog::new);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty CONNECTED_NORTH = BlockStateProperties.NORTH;
	public static final BooleanProperty CONNECTED_EAST = BlockStateProperties.EAST;
	public static final BooleanProperty CONNECTED_SOUTH = BlockStateProperties.SOUTH;
	public static final BooleanProperty CONNECTED_WEST = BlockStateProperties.WEST;
	private static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16, 16);
	private static final VoxelShape COLLISION_SHAPE_Z = Stream.of(
	        Block.box(0, 0, 0, 14, 2, 16),
	        Block.box(14, 0, 0, 16, 16, 16),
	        Block.box(2, 14, 0, 14, 16, 16),
	        Block.box(0, 2, 0, 2, 16, 16)
	).reduce(Shapes::or).get();
	private static final VoxelShape COLLISION_SHAPE_X = Stream.of(
			Block.box(0, 0, 0, 16, 14, 2),
			Block.box(0, 14, 0, 16, 16, 14),
			Block.box(0, 2, 14, 16, 16, 16),
			Block.box(0, 0, 2, 16, 2, 16)
	).reduce(Shapes::or).get();
	
	public HollowLog(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
				.setValue(CONNECTED_NORTH, false)
				.setValue(CONNECTED_EAST, false)
				.setValue(CONNECTED_SOUTH, false)
				.setValue(CONNECTED_WEST, false));

	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
		Direction clickedFace = hitResult.getDirection();
		if (getConnectionState(clickedFace, state))
			return InteractionResult.FAIL;

		if (clickedFace.getAxis() != state.getValue(FACING).getAxis()) {
			if (!level.isClientSide)
				player.displayClientMessage(Component.translatable("message.revamped.must_hit_hollow_log_end"), true);
			return InteractionResult.FAIL;
		}

	    if (!level.isClientSide) {
	        double x = pos.getX() + 0.5;
	        double y = pos.getY() + 0.125;
	        double z = pos.getZ() + 0.5;
	        
	        player.teleportTo(x, y, z);
	        
	        player.setPose(Pose.SWIMMING);
	    } 
	    return InteractionResult.SUCCESS;
	}
	private boolean getConnectionState(Direction direction, BlockState state) {
		return switch (direction) {
			case Direction.NORTH -> state.getValue(CONNECTED_NORTH);
			case Direction.SOUTH -> state.getValue(CONNECTED_SOUTH);
			case Direction.EAST -> state.getValue(CONNECTED_EAST);
			case Direction.WEST -> state.getValue(CONNECTED_WEST);
			default -> false;
		};
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}
	
	@Override 
	public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING).getAxis()) {
			case Direction.Axis.X -> COLLISION_SHAPE_X;
			case Direction.Axis.Z -> COLLISION_SHAPE_Z;
			default -> SHAPE;
		};
	}

	@Override
	protected BlockState rotate(BlockState state, Rotation rotation) {
		return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
	}
	@Override
	protected BlockState mirror(BlockState state, Mirror mirror) {
		return state.rotate(mirror.getRotation(state.getValue(FACING)));
	}
	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
		builder.add(CONNECTED_NORTH);
		builder.add(CONNECTED_EAST);
		builder.add(CONNECTED_SOUTH);
		builder.add(CONNECTED_WEST);
	}

	@Override
	public boolean isPathfindable(BlockState state, PathComputationType pathComputationType) {
		return false;
	}

	@Override
	protected BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
		if (!facing.getAxis().isHorizontal())
			return super.updateShape(state, facing, facingState, level, currentPos, facingPos);

		Direction.Axis myAxis = state.getValue(FACING).getAxis();

		if (facingState.getBlock() instanceof HollowLog && facingState.getValue(FACING).getAxis() == myAxis) {
			if (facing.getAxis() == myAxis)
				return changeConnection(state, facing, true);
			return changeConnection(state, facing, false);
		}
		else if (!(facingState.getBlock() instanceof HollowLog))
			return changeConnection(state, facing, false);

		return super.updateShape(state, facing, facingState, level, currentPos, facingPos);
	}

	private BlockState changeConnection(BlockState state, Direction direction, boolean value) {
		return switch (direction) {
			case NORTH -> state.setValue(CONNECTED_NORTH, value);
			case SOUTH -> state.setValue(CONNECTED_SOUTH, value);
			case EAST  -> state.setValue(CONNECTED_EAST, value);
			case WEST  -> state.setValue(CONNECTED_WEST, value);
			default    -> state;
		};
	}
	
	@Override
	protected MapCodec<? extends Block> codec() {
		return CODEC;
	}
}
