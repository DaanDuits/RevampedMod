package net.daanbanaan.revamped.datagen;

import java.util.Set;

import net.daanbanaan.revamped.block.RevampedBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

public class RevampedBlockLootTableProvider extends BlockLootSubProvider {

	protected RevampedBlockLootTableProvider(Provider registries) {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
	}

	@Override
	protected void generate() {
		dropSelf(RevampedBlocks.CHOPPING_BLOCK.get());

		dropSelf(RevampedBlocks.CHISELED_OAK_WOOD.get());
		dropSelf(RevampedBlocks.OAK_MOSAIC.get());
		dropSelf(RevampedBlocks.OAK_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.OAK_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.OAK_TILES.get());
		dropSelf(RevampedBlocks.OAK_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.OAK_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_OAK_LOG.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_OAK_LOG.get());
		
		dropSelf(RevampedBlocks.CHISELED_BIRCH_WOOD.get());
		dropSelf(RevampedBlocks.BIRCH_MOSAIC.get());
		dropSelf(RevampedBlocks.BIRCH_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.BIRCH_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.BIRCH_TILES.get());
		dropSelf(RevampedBlocks.BIRCH_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.BIRCH_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_BIRCH_LOG.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_BIRCH_LOG.get());

		dropSelf(RevampedBlocks.CHISELED_SPRUCE_WOOD.get());
		dropSelf(RevampedBlocks.SPRUCE_MOSAIC.get());
		dropSelf(RevampedBlocks.SPRUCE_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.SPRUCE_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.SPRUCE_TILES.get());
		dropSelf(RevampedBlocks.SPRUCE_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.SPRUCE_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_SPRUCE_LOG.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_SPRUCE_LOG.get());

		dropSelf(RevampedBlocks.CHISELED_JUNGLE_WOOD.get());
		dropSelf(RevampedBlocks.JUNGLE_MOSAIC.get());
		dropSelf(RevampedBlocks.JUNGLE_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.JUNGLE_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.JUNGLE_TILES.get());
		dropSelf(RevampedBlocks.JUNGLE_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.JUNGLE_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_JUNGLE_LOG.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_JUNGLE_LOG.get());

		dropSelf(RevampedBlocks.CHISELED_ACACIA_WOOD.get());
		dropSelf(RevampedBlocks.ACACIA_MOSAIC.get());
		dropSelf(RevampedBlocks.ACACIA_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.ACACIA_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.ACACIA_TILES.get());
		dropSelf(RevampedBlocks.ACACIA_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.ACACIA_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_ACACIA_LOG.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_ACACIA_LOG.get());

		dropSelf(RevampedBlocks.CHISELED_DARK_OAK_WOOD.get());
		dropSelf(RevampedBlocks.DARK_OAK_MOSAIC.get());
		dropSelf(RevampedBlocks.DARK_OAK_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.DARK_OAK_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.DARK_OAK_TILES.get());
		dropSelf(RevampedBlocks.DARK_OAK_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.DARK_OAK_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_DARK_OAK_LOG.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG.get());

		dropSelf(RevampedBlocks.CHISELED_MANGROVE_WOOD.get());
		dropSelf(RevampedBlocks.MANGROVE_MOSAIC.get());
		dropSelf(RevampedBlocks.MANGROVE_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.MANGROVE_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.MANGROVE_TILES.get());
		dropSelf(RevampedBlocks.MANGROVE_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.MANGROVE_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_MANGROVE_LOG.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_MANGROVE_LOG.get());

		dropSelf(RevampedBlocks.CHISELED_CHERRY_WOOD.get());
		dropSelf(RevampedBlocks.CHERRY_MOSAIC.get());
		dropSelf(RevampedBlocks.CHERRY_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.CHERRY_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.CHERRY_TILES.get());
		dropSelf(RevampedBlocks.CHERRY_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.CHERRY_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_CHERRY_LOG.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_CHERRY_LOG.get());

		dropSelf(RevampedBlocks.CHISELED_BAMBOO_BLOCK.get());
		dropSelf(RevampedBlocks.BAMBOO_TILES.get());
		dropSelf(RevampedBlocks.BAMBOO_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.BAMBOO_TILE_SLAB.get());
		
		dropSelf(RevampedBlocks.CHISELED_CRIMSON_HYPHAE.get());
		dropSelf(RevampedBlocks.CRIMSON_MOSAIC.get());
		dropSelf(RevampedBlocks.CRIMSON_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.CRIMSON_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.CRIMSON_TILES.get());
		dropSelf(RevampedBlocks.CRIMSON_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.CRIMSON_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_CRIMSON_STEM.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_CRIMSON_STEM.get());

		dropSelf(RevampedBlocks.CHISELED_WARPED_HYPHAE.get());
		dropSelf(RevampedBlocks.WARPED_MOSAIC.get());
		dropSelf(RevampedBlocks.WARPED_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.WARPED_MOSAIC_SLAB.get());
		dropSelf(RevampedBlocks.WARPED_TILES.get());
		dropSelf(RevampedBlocks.WARPED_TILE_STAIRS.get());
		dropSelf(RevampedBlocks.WARPED_TILE_SLAB.get());
		dropSelf(RevampedBlocks.HOLLOW_WARPED_STEM.get());
		dropSelf(RevampedBlocks.STRIPPED_HOLLOW_WARPED_STEM.get());
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return RevampedBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
	}

}
