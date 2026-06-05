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
            insertCreative(event, Items.STONECUTTER, RevampedBlocks.CHOPPING_BLOCK.get());
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
        	insertCreative(event, Items.STRIPPED_OAK_WOOD, RevampedBlocks.CHISELED_OAK_WOOD.get());
            insertBlockSetCreative(event, Items.OAK_PLANKS, RevampedBlocks.OAK_MOSAIC.get(),
            		Items.OAK_STAIRS, RevampedBlocks.OAK_MOSAIC_STAIRS.get(),
            		Items.OAK_SLAB, RevampedBlocks.OAK_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.OAK_PLANKS, RevampedBlocks.OAK_TILES.get(),
            		Items.OAK_STAIRS, RevampedBlocks.OAK_TILE_STAIRS.get(),
            		Items.OAK_SLAB, RevampedBlocks.OAK_TILE_SLAB.get());

        	insertCreative(event, Items.STRIPPED_BIRCH_WOOD, RevampedBlocks.CHISELED_BIRCH_WOOD.get());
            insertBlockSetCreative(event, Items.BIRCH_PLANKS, RevampedBlocks.BIRCH_MOSAIC.get(),
            		Items.BIRCH_STAIRS, RevampedBlocks.BIRCH_MOSAIC_STAIRS.get(),
            		Items.BIRCH_SLAB, RevampedBlocks.BIRCH_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.BIRCH_PLANKS, RevampedBlocks.BIRCH_TILES.get(),
            		Items.BIRCH_STAIRS, RevampedBlocks.BIRCH_TILE_STAIRS.get(),
            		Items.BIRCH_SLAB, RevampedBlocks.BIRCH_TILE_SLAB.get());

        	insertCreative(event, Items.STRIPPED_SPRUCE_WOOD, RevampedBlocks.CHISELED_SPRUCE_WOOD.get());
            insertBlockSetCreative(event, Items.SPRUCE_PLANKS, RevampedBlocks.SPRUCE_MOSAIC.get(),
            		Items.SPRUCE_STAIRS, RevampedBlocks.SPRUCE_MOSAIC_STAIRS.get(),
            		Items.SPRUCE_SLAB, RevampedBlocks.SPRUCE_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.SPRUCE_PLANKS, RevampedBlocks.SPRUCE_TILES.get(),
            		Items.SPRUCE_STAIRS, RevampedBlocks.SPRUCE_TILE_STAIRS.get(),
            		Items.SPRUCE_SLAB, RevampedBlocks.SPRUCE_TILE_SLAB.get());

        	insertCreative(event, Items.STRIPPED_JUNGLE_WOOD, RevampedBlocks.CHISELED_JUNGLE_WOOD.get());
            insertBlockSetCreative(event, Items.JUNGLE_PLANKS, RevampedBlocks.JUNGLE_MOSAIC.get(),
            		Items.JUNGLE_STAIRS, RevampedBlocks.JUNGLE_MOSAIC_STAIRS.get(),
            		Items.JUNGLE_SLAB, RevampedBlocks.JUNGLE_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.JUNGLE_PLANKS, RevampedBlocks.JUNGLE_TILES.get(),
            		Items.JUNGLE_STAIRS, RevampedBlocks.JUNGLE_TILE_STAIRS.get(),
            		Items.JUNGLE_SLAB, RevampedBlocks.JUNGLE_TILE_SLAB.get());

        	insertCreative(event, Items.STRIPPED_ACACIA_WOOD, RevampedBlocks.CHISELED_ACACIA_WOOD.get());
            insertBlockSetCreative(event, Items.ACACIA_PLANKS, RevampedBlocks.ACACIA_MOSAIC.get(),
            		Items.ACACIA_STAIRS, RevampedBlocks.ACACIA_MOSAIC_STAIRS.get(),
            		Items.ACACIA_SLAB, RevampedBlocks.ACACIA_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.ACACIA_PLANKS, RevampedBlocks.ACACIA_TILES.get(),
            		Items.ACACIA_STAIRS, RevampedBlocks.ACACIA_TILE_STAIRS.get(),
            		Items.ACACIA_SLAB, RevampedBlocks.ACACIA_TILE_SLAB.get());

        	insertCreative(event, Items.STRIPPED_DARK_OAK_WOOD, RevampedBlocks.CHISELED_DARK_OAK_WOOD.get());
            insertBlockSetCreative(event, Items.DARK_OAK_PLANKS, RevampedBlocks.DARK_OAK_MOSAIC.get(),
            		Items.DARK_OAK_STAIRS, RevampedBlocks.DARK_OAK_MOSAIC_STAIRS.get(),
            		Items.DARK_OAK_SLAB, RevampedBlocks.DARK_OAK_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.DARK_OAK_PLANKS, RevampedBlocks.DARK_OAK_TILES.get(),
            		Items.DARK_OAK_STAIRS, RevampedBlocks.DARK_OAK_TILE_STAIRS.get(),
            		Items.DARK_OAK_SLAB, RevampedBlocks.DARK_OAK_TILE_SLAB.get());

        	insertCreative(event, Items.STRIPPED_MANGROVE_WOOD, RevampedBlocks.CHISELED_MANGROVE_WOOD.get());
            insertBlockSetCreative(event, Items.MANGROVE_PLANKS, RevampedBlocks.MANGROVE_MOSAIC.get(),
            		Items.MANGROVE_STAIRS, RevampedBlocks.MANGROVE_MOSAIC_STAIRS.get(),
            		Items.MANGROVE_SLAB, RevampedBlocks.MANGROVE_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.MANGROVE_PLANKS, RevampedBlocks.MANGROVE_TILES.get(),
            		Items.MANGROVE_STAIRS, RevampedBlocks.MANGROVE_TILE_STAIRS.get(),
            		Items.MANGROVE_SLAB, RevampedBlocks.MANGROVE_TILE_SLAB.get());

        	insertCreative(event, Items.STRIPPED_CHERRY_WOOD, RevampedBlocks.CHISELED_CHERRY_WOOD.get());
            insertBlockSetCreative(event, Items.CHERRY_PLANKS, RevampedBlocks.CHERRY_MOSAIC.get(),
            		Items.CHERRY_STAIRS, RevampedBlocks.CHERRY_MOSAIC_STAIRS.get(),
            		Items.CHERRY_SLAB, RevampedBlocks.CHERRY_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.CHERRY_PLANKS, RevampedBlocks.CHERRY_TILES.get(),
            		Items.CHERRY_STAIRS, RevampedBlocks.CHERRY_TILE_STAIRS.get(),
            		Items.CHERRY_SLAB, RevampedBlocks.CHERRY_TILE_SLAB.get());

        	insertCreative(event, Items.STRIPPED_BAMBOO_BLOCK, RevampedBlocks.CHISELED_BAMBOO_BLOCK.get());
        	insertBlockSetCreative(event, Items.BAMBOO_PLANKS, RevampedBlocks.BAMBOO_TILES.get(),
            		Items.BAMBOO_STAIRS, RevampedBlocks.BAMBOO_TILE_STAIRS.get(),
            		Items.BAMBOO_SLAB, RevampedBlocks.BAMBOO_TILE_SLAB.get());
        	
        	insertCreative(event, Items.STRIPPED_CRIMSON_HYPHAE, RevampedBlocks.CHISELED_CRIMSON_HYPHAE.get());
            insertBlockSetCreative(event, Items.CRIMSON_PLANKS, RevampedBlocks.CRIMSON_MOSAIC.get(),
            		Items.CRIMSON_STAIRS, RevampedBlocks.CRIMSON_MOSAIC_STAIRS.get(),
            		Items.CRIMSON_SLAB, RevampedBlocks.CRIMSON_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.CRIMSON_PLANKS, RevampedBlocks.CRIMSON_TILES.get(),
            		Items.CRIMSON_STAIRS, RevampedBlocks.CRIMSON_TILE_STAIRS.get(),
            		Items.CRIMSON_SLAB, RevampedBlocks.CRIMSON_TILE_SLAB.get());

        	insertCreative(event, Items.STRIPPED_WARPED_HYPHAE, RevampedBlocks.CHISELED_WARPED_HYPHAE.get());
            insertBlockSetCreative(event, Items.WARPED_PLANKS, RevampedBlocks.WARPED_MOSAIC.get(),
            		Items.WARPED_STAIRS, RevampedBlocks.WARPED_MOSAIC_STAIRS.get(),
            		Items.WARPED_SLAB, RevampedBlocks.WARPED_MOSAIC_SLAB.get());
            insertBlockSetCreative(event, Items.WARPED_PLANKS, RevampedBlocks.WARPED_TILES.get(),
            		Items.WARPED_STAIRS, RevampedBlocks.WARPED_TILE_STAIRS.get(),
            		Items.WARPED_SLAB, RevampedBlocks.WARPED_TILE_SLAB.get());
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
