package net.daanbanaan.revamped.datagen;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class RevampedBlockStateProvider extends BlockStateProvider {

	public RevampedBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, Revamped.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		blockSet(RevampedBlocks.OAK_MOSAIC, RevampedBlocks.OAK_MOSAIC_STAIRS, RevampedBlocks.OAK_MOSAIC_SLAB);
		
		blockSet(RevampedBlocks.BIRCH_MOSAIC, RevampedBlocks.BIRCH_MOSAIC_STAIRS, RevampedBlocks.BIRCH_MOSAIC_SLAB);
		
		blockSet(RevampedBlocks.SPRUCE_MOSAIC, RevampedBlocks.SPRUCE_MOSAIC_STAIRS, RevampedBlocks.SPRUCE_MOSAIC_SLAB);
		
		blockSet(RevampedBlocks.JUNGLE_MOSAIC, RevampedBlocks.JUNGLE_MOSAIC_STAIRS, RevampedBlocks.JUNGLE_MOSAIC_SLAB);
		
		blockSet(RevampedBlocks.ACACIA_MOSAIC, RevampedBlocks.ACACIA_MOSAIC_STAIRS, RevampedBlocks.ACACIA_MOSAIC_SLAB);
		
		blockSet(RevampedBlocks.DARK_OAK_MOSAIC, RevampedBlocks.DARK_OAK_MOSAIC_STAIRS, RevampedBlocks.DARK_OAK_MOSAIC_SLAB);
		
		blockSet(RevampedBlocks.MANGROVE_MOSAIC, RevampedBlocks.MANGROVE_MOSAIC_STAIRS, RevampedBlocks.MANGROVE_MOSAIC_SLAB);
		
		blockSet(RevampedBlocks.CHERRY_MOSAIC, RevampedBlocks.CHERRY_MOSAIC_STAIRS, RevampedBlocks.CHERRY_MOSAIC_SLAB);
		
		blockSet(RevampedBlocks.CRIMSON_MOSAIC, RevampedBlocks.CRIMSON_MOSAIC_STAIRS, RevampedBlocks.CRIMSON_MOSAIC_SLAB);
		
		blockSet(RevampedBlocks.WARPED_MOSAIC, RevampedBlocks.WARPED_MOSAIC_STAIRS, RevampedBlocks.WARPED_MOSAIC_SLAB);
	}
	
	private void blockSet(DeferredBlock<?> block, DeferredBlock<StairBlock> stairBlock, DeferredBlock<SlabBlock> slabBlock) {
		blockWithItem(block);
		stairsBlock(stairBlock.get(), blockTexture(block.get()));
		blockItem(stairBlock);
		slabBlock(slabBlock.get(), blockTexture(block.get()), blockTexture(block.get()));
		blockItem(slabBlock);
	}

	private void blockWithItem(DeferredBlock<?> block) {
		simpleBlockWithItem(block.get(), cubeAll(block.get()));
	}
	
	private void blockItem(DeferredBlock<?> block) {
		simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile("revamped:block/" + block.getId().getPath()));
	}
}
