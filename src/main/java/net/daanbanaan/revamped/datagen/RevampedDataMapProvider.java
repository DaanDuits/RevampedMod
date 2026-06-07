package net.daanbanaan.revamped.datagen;

import net.daanbanaan.revamped.block.RevampedBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

import java.util.concurrent.CompletableFuture;

public class RevampedDataMapProvider extends DataMapProvider {
    protected RevampedDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider)
    {
        builder(NeoForgeDataMaps.STRIPPABLES)
            .add(RevampedBlocks.HOLLOW_OAK_LOG, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_OAK_LOG.get()), false)
            .add(RevampedBlocks.HOLLOW_BIRCH_LOG, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_BIRCH_LOG.get()), false)
            .add(RevampedBlocks.HOLLOW_SPRUCE_LOG, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_SPRUCE_LOG.get()), false)
            .add(RevampedBlocks.HOLLOW_JUNGLE_LOG, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_JUNGLE_LOG.get()), false)
            .add(RevampedBlocks.HOLLOW_ACACIA_LOG, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_ACACIA_LOG.get()), false)
            .add(RevampedBlocks.HOLLOW_DARK_OAK_LOG, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG.get()), false)
            .add(RevampedBlocks.HOLLOW_MANGROVE_LOG, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_MANGROVE_LOG.get()), false)
            .add(RevampedBlocks.HOLLOW_CHERRY_LOG, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_CHERRY_LOG.get()), false)
            .add(RevampedBlocks.HOLLOW_CRIMSON_STEM, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_CRIMSON_STEM.get()), false)
            .add(RevampedBlocks.HOLLOW_WARPED_STEM, new Strippable(RevampedBlocks.STRIPPED_HOLLOW_WARPED_STEM.get()), false);

    }
}
