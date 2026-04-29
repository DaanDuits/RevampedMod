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
		
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return RevampedBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
	}

}
