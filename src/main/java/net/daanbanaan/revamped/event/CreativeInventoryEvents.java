package net.daanbanaan.revamped.event;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@EventBusSubscriber(modid = Revamped.MOD_ID)
public class CreativeInventoryEvents {
	
	@SubscribeEvent
	public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            insertCreative(event, Items.STONECUTTER, RevampedBlocks.CHOPPING_BLOCK);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			insertCreative(event, Items.OAK_LOG, RevampedBlocks.HOLLOW_OAK_LOG);
			insertCreative(event, Items.STRIPPED_OAK_LOG, RevampedBlocks.STRIPPED_HOLLOW_OAK_LOG);
        	insertCreative(event, RevampedBlocks.HOLLOW_OAK_LOG, RevampedBlocks.CHISELED_OAK_WOOD);
            insertBlockSetCreative(event, Items.OAK_PLANKS, RevampedBlocks.OAK_MOSAIC,
            		Items.OAK_STAIRS, RevampedBlocks.OAK_MOSAIC_STAIRS,
            		Items.OAK_SLAB, RevampedBlocks.OAK_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.OAK_PLANKS, RevampedBlocks.OAK_TILES,
            		Items.OAK_STAIRS, RevampedBlocks.OAK_TILE_STAIRS,
            		Items.OAK_SLAB, RevampedBlocks.OAK_TILE_SLAB);

			insertCreative(event, Items.BIRCH_LOG, RevampedBlocks.HOLLOW_BIRCH_LOG);
			insertCreative(event, Items.STRIPPED_BIRCH_LOG, RevampedBlocks.STRIPPED_HOLLOW_BIRCH_LOG);
        	insertCreative(event, Items.STRIPPED_BIRCH_WOOD, RevampedBlocks.CHISELED_BIRCH_WOOD);
            insertBlockSetCreative(event, Items.BIRCH_PLANKS, RevampedBlocks.BIRCH_MOSAIC,
            		Items.BIRCH_STAIRS, RevampedBlocks.BIRCH_MOSAIC_STAIRS,
            		Items.BIRCH_SLAB, RevampedBlocks.BIRCH_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.BIRCH_PLANKS, RevampedBlocks.BIRCH_TILES,
            		Items.BIRCH_STAIRS, RevampedBlocks.BIRCH_TILE_STAIRS,
            		Items.BIRCH_SLAB, RevampedBlocks.BIRCH_TILE_SLAB);

			insertCreative(event, Items.SPRUCE_LOG, RevampedBlocks.HOLLOW_SPRUCE_LOG);
			insertCreative(event, Items.STRIPPED_SPRUCE_LOG, RevampedBlocks.STRIPPED_HOLLOW_SPRUCE_LOG);
        	insertCreative(event, Items.STRIPPED_SPRUCE_WOOD, RevampedBlocks.CHISELED_SPRUCE_WOOD);
            insertBlockSetCreative(event, Items.SPRUCE_PLANKS, RevampedBlocks.SPRUCE_MOSAIC,
            		Items.SPRUCE_STAIRS, RevampedBlocks.SPRUCE_MOSAIC_STAIRS,
            		Items.SPRUCE_SLAB, RevampedBlocks.SPRUCE_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.SPRUCE_PLANKS, RevampedBlocks.SPRUCE_TILES,
            		Items.SPRUCE_STAIRS, RevampedBlocks.SPRUCE_TILE_STAIRS,
            		Items.SPRUCE_SLAB, RevampedBlocks.SPRUCE_TILE_SLAB);

			insertCreative(event, Items.JUNGLE_LOG, RevampedBlocks.HOLLOW_JUNGLE_LOG);
			insertCreative(event, Items.STRIPPED_JUNGLE_LOG, RevampedBlocks.STRIPPED_HOLLOW_JUNGLE_LOG);
        	insertCreative(event, Items.STRIPPED_JUNGLE_WOOD, RevampedBlocks.CHISELED_JUNGLE_WOOD);
            insertBlockSetCreative(event, Items.JUNGLE_PLANKS, RevampedBlocks.JUNGLE_MOSAIC,
            		Items.JUNGLE_STAIRS, RevampedBlocks.JUNGLE_MOSAIC_STAIRS,
            		Items.JUNGLE_SLAB, RevampedBlocks.JUNGLE_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.JUNGLE_PLANKS, RevampedBlocks.JUNGLE_TILES,
            		Items.JUNGLE_STAIRS, RevampedBlocks.JUNGLE_TILE_STAIRS,
            		Items.JUNGLE_SLAB, RevampedBlocks.JUNGLE_TILE_SLAB);

			insertCreative(event, Items.ACACIA_LOG, RevampedBlocks.HOLLOW_ACACIA_LOG);
			insertCreative(event, Items.STRIPPED_ACACIA_LOG, RevampedBlocks.STRIPPED_HOLLOW_ACACIA_LOG);
        	insertCreative(event, Items.STRIPPED_ACACIA_WOOD, RevampedBlocks.CHISELED_ACACIA_WOOD);
            insertBlockSetCreative(event, Items.ACACIA_PLANKS, RevampedBlocks.ACACIA_MOSAIC,
            		Items.ACACIA_STAIRS, RevampedBlocks.ACACIA_MOSAIC_STAIRS,
            		Items.ACACIA_SLAB, RevampedBlocks.ACACIA_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.ACACIA_PLANKS, RevampedBlocks.ACACIA_TILES,
            		Items.ACACIA_STAIRS, RevampedBlocks.ACACIA_TILE_STAIRS,
            		Items.ACACIA_SLAB, RevampedBlocks.ACACIA_TILE_SLAB);

			insertCreative(event, Items.DARK_OAK_LOG, RevampedBlocks.HOLLOW_DARK_OAK_LOG);
			insertCreative(event, Items.STRIPPED_DARK_OAK_LOG, RevampedBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG);
        	insertCreative(event, Items.STRIPPED_DARK_OAK_WOOD, RevampedBlocks.CHISELED_DARK_OAK_WOOD);
            insertBlockSetCreative(event, Items.DARK_OAK_PLANKS, RevampedBlocks.DARK_OAK_MOSAIC,
            		Items.DARK_OAK_STAIRS, RevampedBlocks.DARK_OAK_MOSAIC_STAIRS,
            		Items.DARK_OAK_SLAB, RevampedBlocks.DARK_OAK_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.DARK_OAK_PLANKS, RevampedBlocks.DARK_OAK_TILES,
            		Items.DARK_OAK_STAIRS, RevampedBlocks.DARK_OAK_TILE_STAIRS,
            		Items.DARK_OAK_SLAB, RevampedBlocks.DARK_OAK_TILE_SLAB);

			insertCreative(event, Items.MANGROVE_LOG, RevampedBlocks.HOLLOW_MANGROVE_LOG);
			insertCreative(event, Items.STRIPPED_MANGROVE_LOG, RevampedBlocks.STRIPPED_HOLLOW_MANGROVE_LOG);
			insertCreative(event, Items.STRIPPED_MANGROVE_WOOD, RevampedBlocks.CHISELED_MANGROVE_WOOD);
            insertBlockSetCreative(event, Items.MANGROVE_PLANKS, RevampedBlocks.MANGROVE_MOSAIC,
            		Items.MANGROVE_STAIRS, RevampedBlocks.MANGROVE_MOSAIC_STAIRS,
            		Items.MANGROVE_SLAB, RevampedBlocks.MANGROVE_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.MANGROVE_PLANKS, RevampedBlocks.MANGROVE_TILES,
            		Items.MANGROVE_STAIRS, RevampedBlocks.MANGROVE_TILE_STAIRS,
            		Items.MANGROVE_SLAB, RevampedBlocks.MANGROVE_TILE_SLAB);

			insertCreative(event, Items.CHERRY_LOG, RevampedBlocks.HOLLOW_CHERRY_LOG);
			insertCreative(event, Items.STRIPPED_CHERRY_LOG, RevampedBlocks.STRIPPED_HOLLOW_CHERRY_LOG);
			insertCreative(event, Items.STRIPPED_CHERRY_WOOD, RevampedBlocks.CHISELED_CHERRY_WOOD);
            insertBlockSetCreative(event, Items.CHERRY_PLANKS, RevampedBlocks.CHERRY_MOSAIC,
            		Items.CHERRY_STAIRS, RevampedBlocks.CHERRY_MOSAIC_STAIRS,
            		Items.CHERRY_SLAB, RevampedBlocks.CHERRY_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.CHERRY_PLANKS, RevampedBlocks.CHERRY_TILES,
            		Items.CHERRY_STAIRS, RevampedBlocks.CHERRY_TILE_STAIRS,
            		Items.CHERRY_SLAB, RevampedBlocks.CHERRY_TILE_SLAB);

        	insertCreative(event, Items.STRIPPED_BAMBOO_BLOCK, RevampedBlocks.CHISELED_BAMBOO_BLOCK);
        	insertBlockSetCreative(event, Items.BAMBOO_PLANKS, RevampedBlocks.BAMBOO_TILES,
            		Items.BAMBOO_STAIRS, RevampedBlocks.BAMBOO_TILE_STAIRS,
            		Items.BAMBOO_SLAB, RevampedBlocks.BAMBOO_TILE_SLAB);

			insertCreative(event, Items.CRIMSON_STEM, RevampedBlocks.HOLLOW_CRIMSON_STEM);
			insertCreative(event, Items.STRIPPED_CRIMSON_STEM, RevampedBlocks.STRIPPED_HOLLOW_CRIMSON_STEM);
        	insertCreative(event, Items.STRIPPED_CRIMSON_HYPHAE, RevampedBlocks.CHISELED_CRIMSON_HYPHAE);
            insertBlockSetCreative(event, Items.CRIMSON_PLANKS, RevampedBlocks.CRIMSON_MOSAIC,
            		Items.CRIMSON_STAIRS, RevampedBlocks.CRIMSON_MOSAIC_STAIRS,
            		Items.CRIMSON_SLAB, RevampedBlocks.CRIMSON_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.CRIMSON_PLANKS, RevampedBlocks.CRIMSON_TILES,
            		Items.CRIMSON_STAIRS, RevampedBlocks.CRIMSON_TILE_STAIRS,
            		Items.CRIMSON_SLAB, RevampedBlocks.CRIMSON_TILE_SLAB);

			insertCreative(event, Items.WARPED_STEM, RevampedBlocks.HOLLOW_WARPED_STEM);
			insertCreative(event, Items.STRIPPED_WARPED_STEM, RevampedBlocks.STRIPPED_HOLLOW_WARPED_STEM);
        	insertCreative(event, Items.STRIPPED_WARPED_HYPHAE, RevampedBlocks.CHISELED_WARPED_HYPHAE);
            insertBlockSetCreative(event, Items.WARPED_PLANKS, RevampedBlocks.WARPED_MOSAIC,
            		Items.WARPED_STAIRS, RevampedBlocks.WARPED_MOSAIC_STAIRS,
            		Items.WARPED_SLAB, RevampedBlocks.WARPED_MOSAIC_SLAB);
            insertBlockSetCreative(event, Items.WARPED_PLANKS, RevampedBlocks.WARPED_TILES,
            		Items.WARPED_STAIRS, RevampedBlocks.WARPED_TILE_STAIRS,
            		Items.WARPED_SLAB, RevampedBlocks.WARPED_TILE_SLAB);
        }
    }
    
    private static void insertCreative(BuildCreativeModeTabContentsEvent event, ItemLike existingEntry, ItemLike newEntry) {
    	ItemStack existingStack = new ItemStack(existingEntry);
        ItemStack newStack = new ItemStack(newEntry);
        event.insertAfter(existingStack, newStack, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
    private static void insertBlockSetCreative(BuildCreativeModeTabContentsEvent event, ItemLike existingBlockEntry, ItemLike newBlockEntry, 
    							ItemLike existingStairsEntry, ItemLike newStairsEntry,
    							ItemLike existingSlabEntry, ItemLike newSlabEntry) {
    	insertCreative(event, existingBlockEntry, newBlockEntry);
    	insertCreative(event, existingStairsEntry, newStairsEntry);
    	insertCreative(event, existingSlabEntry, newSlabEntry);
    }
}
