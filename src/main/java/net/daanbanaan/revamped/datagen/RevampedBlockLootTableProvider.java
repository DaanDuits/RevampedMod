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
		
		dropSelf(RevampedBlocks.OAK_MOSAIC.get());
		dropSelf(RevampedBlocks.OAK_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.OAK_MOSAIC_SLAB.get());
		
		dropSelf(RevampedBlocks.BIRCH_MOSAIC.get());
		dropSelf(RevampedBlocks.BIRCH_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.BIRCH_MOSAIC_SLAB.get());
		
		dropSelf(RevampedBlocks.SPRUCE_MOSAIC.get());
		dropSelf(RevampedBlocks.SPRUCE_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.SPRUCE_MOSAIC_SLAB.get());
		
		dropSelf(RevampedBlocks.JUNGLE_MOSAIC.get());
		dropSelf(RevampedBlocks.JUNGLE_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.JUNGLE_MOSAIC_SLAB.get());
		
		dropSelf(RevampedBlocks.ACACIA_MOSAIC.get());
		dropSelf(RevampedBlocks.ACACIA_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.ACACIA_MOSAIC_SLAB.get());
		
		dropSelf(RevampedBlocks.DARK_OAK_MOSAIC.get());
		dropSelf(RevampedBlocks.DARK_OAK_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.DARK_OAK_MOSAIC_SLAB.get());
		
		dropSelf(RevampedBlocks.MANGROVE_MOSAIC.get());
		dropSelf(RevampedBlocks.MANGROVE_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.MANGROVE_MOSAIC_SLAB.get());
		
		dropSelf(RevampedBlocks.CHERRY_MOSAIC.get());
		dropSelf(RevampedBlocks.CHERRY_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.CHERRY_MOSAIC_SLAB.get());
		
		dropSelf(RevampedBlocks.CRIMSON_MOSAIC.get());
		dropSelf(RevampedBlocks.CRIMSON_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.CRIMSON_MOSAIC_SLAB.get());
		
		dropSelf(RevampedBlocks.WARPED_MOSAIC.get());
		dropSelf(RevampedBlocks.WARPED_MOSAIC_STAIRS.get());
		dropSelf(RevampedBlocks.WARPED_MOSAIC_SLAB.get());
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return RevampedBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
	}

}
