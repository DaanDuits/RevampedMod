package net.daanbanaan.revamped.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.tags.RevampedItemTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class RevampedItemTagProvider extends ItemTagsProvider {

	public RevampedItemTagProvider(PackOutput output, CompletableFuture<Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, blockTags, Revamped.MOD_ID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {
		tag(RevampedItemTags.IRON_TIER_AXES)
        .add(Items.IRON_AXE,
	        Items.DIAMOND_AXE,
	        Items.NETHERITE_AXE);
		
		/* NATURAL LOGS */
		tag(RevampedItemTags.NATURAL_OAK_LOGS)
		.add(Items.OAK_LOG,
			Items.OAK_WOOD);
		tag(RevampedItemTags.NATURAL_BIRCH_LOGS)
		.add(Items.BIRCH_LOG,
			Items.BIRCH_WOOD);
		tag(RevampedItemTags.NATURAL_SPRUCE_LOGS)
		.add(Items.SPRUCE_LOG,
			Items.SPRUCE_WOOD);
		tag(RevampedItemTags.NATURAL_JUNGLE_LOGS)
		.add(Items.JUNGLE_LOG,
			Items.JUNGLE_WOOD);
		tag(RevampedItemTags.NATURAL_ACACIA_LOGS)
		.add(Items.ACACIA_LOG,
			Items.ACACIA_WOOD);
		tag(RevampedItemTags.NATURAL_DARK_OAK_LOGS)
		.add(Items.DARK_OAK_LOG,
			Items.DARK_OAK_WOOD);
		tag(RevampedItemTags.NATURAL_MANGROVE_LOGS)
		.add(Items.MANGROVE_LOG,
			Items.MANGROVE_WOOD);
		tag(RevampedItemTags.NATURAL_CHERRY_LOGS)
		.add(Items.CHERRY_LOG,
			Items.CHERRY_WOOD);

		tag(RevampedItemTags.NATURAL_CRIMSON_STEMS)
		.add(Items.CRIMSON_STEM,
				Items.CRIMSON_HYPHAE);
		tag(RevampedItemTags.NATURAL_WARPED_STEMS)
		.add(Items.WARPED_STEM,
			Items.WARPED_HYPHAE);
		
		/* STRIPPED LOGS */
		tag(RevampedItemTags.STRIPPED_OAK_LOGS)
		.add(Items.STRIPPED_OAK_LOG,
			Items.STRIPPED_OAK_WOOD);
		tag(RevampedItemTags.STRIPPED_BIRCH_LOGS)
		.add(Items.STRIPPED_BIRCH_LOG,
			Items.STRIPPED_BIRCH_WOOD);
		tag(RevampedItemTags.STRIPPED_SPRUCE_LOGS)
		.add(Items.STRIPPED_SPRUCE_LOG,
			Items.STRIPPED_SPRUCE_WOOD);
		tag(RevampedItemTags.STRIPPED_JUNGLE_LOGS)
		.add(Items.STRIPPED_JUNGLE_LOG,
			Items.STRIPPED_JUNGLE_WOOD);
		tag(RevampedItemTags.STRIPPED_ACACIA_LOGS)
		.add(Items.STRIPPED_ACACIA_LOG,
			Items.STRIPPED_ACACIA_WOOD);
		tag(RevampedItemTags.STRIPPED_DARK_OAK_LOGS)
		.add(Items.STRIPPED_DARK_OAK_LOG,
			Items.STRIPPED_DARK_OAK_WOOD);
		tag(RevampedItemTags.STRIPPED_MANGROVE_LOGS)
		.add(Items.STRIPPED_MANGROVE_LOG,
			Items.STRIPPED_MANGROVE_WOOD);
		tag(RevampedItemTags.STRIPPED_CHERRY_LOGS)
		.add(Items.STRIPPED_CHERRY_LOG,
			Items.STRIPPED_CHERRY_WOOD);

		tag(RevampedItemTags.STRIPPED_CRIMSON_STEMS)
		.add(Items.STRIPPED_CRIMSON_STEM,
				Items.STRIPPED_CRIMSON_HYPHAE);
		tag(RevampedItemTags.STRIPPED_WARPED_STEMS)
		.add(Items.STRIPPED_WARPED_STEM,
				Items.STRIPPED_WARPED_HYPHAE);
	}

}
