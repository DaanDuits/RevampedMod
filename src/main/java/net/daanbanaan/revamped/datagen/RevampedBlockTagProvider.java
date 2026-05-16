package net.daanbanaan.revamped.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.daanbanaan.revamped.tags.RevampedBlockTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class RevampedBlockTagProvider extends BlockTagsProvider {

	public RevampedBlockTagProvider(PackOutput output, CompletableFuture<Provider> lookupProvider,
			@Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, Revamped.MOD_ID, existingFileHelper);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void addTags(Provider provider) {
		tag(RevampedBlockTags.WOODEN_MOSAIC)
		.add(RevampedBlocks.OAK_MOSAIC.get(), 
			RevampedBlocks.BIRCH_MOSAIC.get(),
			RevampedBlocks.SPRUCE_MOSAIC.get(),
			RevampedBlocks.JUNGLE_MOSAIC.get(),
			RevampedBlocks.ACACIA_MOSAIC.get(),
			RevampedBlocks.DARK_OAK_MOSAIC.get(),
			RevampedBlocks.MANGROVE_MOSAIC.get(),
			RevampedBlocks.CHERRY_MOSAIC.get(),
			RevampedBlocks.CRIMSON_MOSAIC.get(),
			RevampedBlocks.WARPED_MOSAIC.get());
		
		tag(RevampedBlockTags.WOODEN_MOSAIC_STAIRS)
		.add(RevampedBlocks.OAK_MOSAIC_STAIRS.get(), 
			RevampedBlocks.BIRCH_MOSAIC_STAIRS.get(),
			RevampedBlocks.SPRUCE_MOSAIC_STAIRS.get(),
			RevampedBlocks.JUNGLE_MOSAIC_STAIRS.get(),
			RevampedBlocks.ACACIA_MOSAIC_STAIRS.get(),
			RevampedBlocks.DARK_OAK_MOSAIC_STAIRS.get(),
			RevampedBlocks.MANGROVE_MOSAIC_STAIRS.get(),
			RevampedBlocks.CHERRY_MOSAIC_STAIRS.get(),
			RevampedBlocks.CRIMSON_MOSAIC_STAIRS.get(),
			RevampedBlocks.WARPED_MOSAIC_STAIRS.get());
		
		tag(RevampedBlockTags.WOODEN_MOSAIC_SLABS)
		.add(RevampedBlocks.OAK_MOSAIC_SLAB.get(), 
			RevampedBlocks.BIRCH_MOSAIC_SLAB.get(),
			RevampedBlocks.SPRUCE_MOSAIC_SLAB.get(),
			RevampedBlocks.JUNGLE_MOSAIC_SLAB.get(),
			RevampedBlocks.ACACIA_MOSAIC_SLAB.get(),
			RevampedBlocks.DARK_OAK_MOSAIC_SLAB.get(),
			RevampedBlocks.MANGROVE_MOSAIC_SLAB.get(),
			RevampedBlocks.CHERRY_MOSAIC_SLAB.get(),
			RevampedBlocks.CRIMSON_MOSAIC_SLAB.get(),
			RevampedBlocks.WARPED_MOSAIC_SLAB.get());
		
		tag(RevampedBlockTags.TRADEABLE_LOGS)
		.add(Blocks.OAK_LOG,
			Blocks.BIRCH_LOG,
			Blocks.SPRUCE_LOG,
			Blocks.JUNGLE_LOG,
			Blocks.ACACIA_LOG,
			Blocks.DARK_OAK_LOG,
			Blocks.MANGROVE_LOG,
			Blocks.CHERRY_LOG,
			Blocks.BAMBOO_BLOCK);
		
		tag(BlockTags.MINEABLE_WITH_AXE).add(RevampedBlocks.CHOPPING_BLOCK.get())
		.addTags(RevampedBlockTags.WOODEN_MOSAIC, RevampedBlockTags.WOODEN_MOSAIC_STAIRS, RevampedBlockTags.WOODEN_MOSAIC_SLABS);
	}

}
