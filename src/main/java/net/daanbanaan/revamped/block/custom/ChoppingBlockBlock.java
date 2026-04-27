package net.daanbanaan.revamped.block.custom;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

import net.daanbanaan.revamped.world.inventory.ChoppingBlockMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ChoppingBlockBlock extends Block{
	public static final MapCodec<Block> CODEC = simpleCodec(ChoppingBlockBlock::new);
	private static final Component CONTAINER_TITLE = Component.translatable("container.revamped.chopping_block");
	private static final VoxelShape SHAPE = Block.box(1, 0, 1, 15, 12, 15);
	
	
	public ChoppingBlockBlock(Properties properties)
	{
		super(properties);
	}
	
	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
	    if (level.isClientSide) {
	        return InteractionResult.SUCCESS;
	    } else {
	        player.openMenu(state.getMenuProvider(level, pos));
	        player.awardStat(Stats.INTERACT_WITH_STONECUTTER);
	        return InteractionResult.CONSUME;
	    }
	}

	@Nullable
	@Override
	protected MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
	    return new SimpleMenuProvider(
	        (p_57074_, p_57075_, p_57076_) -> new ChoppingBlockMenu(p_57074_, p_57075_, ContainerLevelAccess.create(level, pos)), CONTAINER_TITLE
	    );
	}
	
	@Override
	protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
	{
		return SHAPE;
	}
	
	@Override
	protected MapCodec<? extends Block> codec()
	{
		return CODEC;
	}
	
	@Override
    protected boolean isPathfindable(BlockState state, PathComputationType pathComputationType) {
        return false;
    }
}
