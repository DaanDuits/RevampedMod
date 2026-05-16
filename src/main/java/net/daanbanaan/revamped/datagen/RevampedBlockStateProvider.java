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
		blockWithItem(RevampedBlocks.CHISELED_OAK_WOOD);
		blockSet(RevampedBlocks.OAK_MOSAIC, RevampedBlocks.OAK_MOSAIC_STAIRS, RevampedBlocks.OAK_MOSAIC_SLAB);
		blockSet(RevampedBlocks.OAK_TILES, RevampedBlocks.OAK_TILE_STAIRS, RevampedBlocks.OAK_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_BIRCH_WOOD);
		blockSet(RevampedBlocks.BIRCH_MOSAIC, RevampedBlocks.BIRCH_MOSAIC_STAIRS, RevampedBlocks.BIRCH_MOSAIC_SLAB);
		blockSet(RevampedBlocks.BIRCH_TILES, RevampedBlocks.BIRCH_TILE_STAIRS, RevampedBlocks.BIRCH_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_SPRUCE_WOOD);
		blockSet(RevampedBlocks.SPRUCE_MOSAIC, RevampedBlocks.SPRUCE_MOSAIC_STAIRS, RevampedBlocks.SPRUCE_MOSAIC_SLAB);
		blockSet(RevampedBlocks.SPRUCE_TILES, RevampedBlocks.SPRUCE_TILE_STAIRS, RevampedBlocks.SPRUCE_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_JUNGLE_WOOD);
		blockSet(RevampedBlocks.JUNGLE_MOSAIC, RevampedBlocks.JUNGLE_MOSAIC_STAIRS, RevampedBlocks.JUNGLE_MOSAIC_SLAB);
		blockSet(RevampedBlocks.JUNGLE_TILES, RevampedBlocks.JUNGLE_TILE_STAIRS, RevampedBlocks.JUNGLE_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_ACACIA_WOOD);
		blockSet(RevampedBlocks.ACACIA_MOSAIC, RevampedBlocks.ACACIA_MOSAIC_STAIRS, RevampedBlocks.ACACIA_MOSAIC_SLAB);
		blockSet(RevampedBlocks.ACACIA_TILES, RevampedBlocks.ACACIA_TILE_STAIRS, RevampedBlocks.ACACIA_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_DARK_OAK_WOOD);
		blockSet(RevampedBlocks.DARK_OAK_MOSAIC, RevampedBlocks.DARK_OAK_MOSAIC_STAIRS, RevampedBlocks.DARK_OAK_MOSAIC_SLAB);
		blockSet(RevampedBlocks.DARK_OAK_TILES, RevampedBlocks.DARK_OAK_TILE_STAIRS, RevampedBlocks.DARK_OAK_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_MANGROVE_WOOD);
		blockSet(RevampedBlocks.MANGROVE_MOSAIC, RevampedBlocks.MANGROVE_MOSAIC_STAIRS, RevampedBlocks.MANGROVE_MOSAIC_SLAB);
		blockSet(RevampedBlocks.MANGROVE_TILES, RevampedBlocks.MANGROVE_TILE_STAIRS, RevampedBlocks.MANGROVE_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_CHERRY_WOOD);
		blockSet(RevampedBlocks.CHERRY_MOSAIC, RevampedBlocks.CHERRY_MOSAIC_STAIRS, RevampedBlocks.CHERRY_MOSAIC_SLAB);
		blockSet(RevampedBlocks.CHERRY_TILES, RevampedBlocks.CHERRY_TILE_STAIRS, RevampedBlocks.CHERRY_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_BAMBOO_BLOCK);
		blockSet(RevampedBlocks.BAMBOO_TILES, RevampedBlocks.BAMBOO_TILE_STAIRS, RevampedBlocks.BAMBOO_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_CRIMSON_HYPHAE);
		blockSet(RevampedBlocks.CRIMSON_MOSAIC, RevampedBlocks.CRIMSON_MOSAIC_STAIRS, RevampedBlocks.CRIMSON_MOSAIC_SLAB);
		blockSet(RevampedBlocks.CRIMSON_TILES, RevampedBlocks.CRIMSON_TILE_STAIRS, RevampedBlocks.CRIMSON_TILE_SLAB);
		
		blockWithItem(RevampedBlocks.CHISELED_WARPED_HYPHAE);
		blockSet(RevampedBlocks.WARPED_MOSAIC, RevampedBlocks.WARPED_MOSAIC_STAIRS, RevampedBlocks.WARPED_MOSAIC_SLAB);
		blockSet(RevampedBlocks.WARPED_TILES, RevampedBlocks.WARPED_TILE_STAIRS, RevampedBlocks.WARPED_TILE_SLAB);
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
