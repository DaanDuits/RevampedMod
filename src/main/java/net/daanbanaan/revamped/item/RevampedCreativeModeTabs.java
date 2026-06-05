package net.daanbanaan.revamped.item;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RevampedCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Revamped.MOD_ID);
    
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> REVAMPED_TAB = CREATIVE_MODE_TABS.register("revamped_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.revamped")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> new ItemStack(RevampedBlocks.CHOPPING_BLOCK.get()))
            .displayItems((parameters, output) -> {
                output.accept(RevampedBlocks.CHOPPING_BLOCK.get());

                output.accept(RevampedBlocks.CHISELED_OAK_WOOD);
                output.accept(RevampedBlocks.OAK_MOSAIC.get());
                output.accept(RevampedBlocks.OAK_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.OAK_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.OAK_TILES.get());
                output.accept(RevampedBlocks.OAK_TILE_STAIRS.get());
                output.accept(RevampedBlocks.OAK_TILE_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_BIRCH_WOOD);
                output.accept(RevampedBlocks.BIRCH_MOSAIC.get());
                output.accept(RevampedBlocks.BIRCH_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.BIRCH_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.BIRCH_TILES.get());
                output.accept(RevampedBlocks.BIRCH_TILE_STAIRS.get());
                output.accept(RevampedBlocks.BIRCH_TILE_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_SPRUCE_WOOD);
                output.accept(RevampedBlocks.SPRUCE_MOSAIC.get());
                output.accept(RevampedBlocks.SPRUCE_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.SPRUCE_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.SPRUCE_TILES.get());
                output.accept(RevampedBlocks.SPRUCE_TILE_STAIRS.get());
                output.accept(RevampedBlocks.SPRUCE_TILE_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_JUNGLE_WOOD);
                output.accept(RevampedBlocks.JUNGLE_MOSAIC.get());
                output.accept(RevampedBlocks.JUNGLE_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.JUNGLE_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.JUNGLE_TILES.get());
                output.accept(RevampedBlocks.JUNGLE_TILE_STAIRS.get());
                output.accept(RevampedBlocks.JUNGLE_TILE_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_ACACIA_WOOD);
                output.accept(RevampedBlocks.ACACIA_MOSAIC.get());
                output.accept(RevampedBlocks.ACACIA_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.ACACIA_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.ACACIA_TILES.get());
                output.accept(RevampedBlocks.ACACIA_TILE_STAIRS.get());
                output.accept(RevampedBlocks.ACACIA_TILE_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_DARK_OAK_WOOD);
                output.accept(RevampedBlocks.DARK_OAK_MOSAIC.get());
                output.accept(RevampedBlocks.DARK_OAK_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.DARK_OAK_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.DARK_OAK_TILES.get());
                output.accept(RevampedBlocks.DARK_OAK_TILE_STAIRS.get());
                output.accept(RevampedBlocks.DARK_OAK_TILE_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_MANGROVE_WOOD);
                output.accept(RevampedBlocks.MANGROVE_MOSAIC.get());
                output.accept(RevampedBlocks.MANGROVE_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.MANGROVE_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.MANGROVE_TILES.get());
                output.accept(RevampedBlocks.MANGROVE_TILE_STAIRS.get());
                output.accept(RevampedBlocks.MANGROVE_TILE_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_CHERRY_WOOD);
                output.accept(RevampedBlocks.CHERRY_MOSAIC.get());
                output.accept(RevampedBlocks.CHERRY_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.CHERRY_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.CHERRY_TILES.get());
                output.accept(RevampedBlocks.CHERRY_TILE_STAIRS.get());
                output.accept(RevampedBlocks.CHERRY_TILE_SLAB.get());
                
                output.accept(RevampedBlocks.CHISELED_BAMBOO_BLOCK);
                output.accept(RevampedBlocks.BAMBOO_TILES.get());
                output.accept(RevampedBlocks.BAMBOO_TILE_STAIRS.get());
                output.accept(RevampedBlocks.BAMBOO_TILE_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_CRIMSON_HYPHAE);
                output.accept(RevampedBlocks.CRIMSON_MOSAIC.get());
                output.accept(RevampedBlocks.CRIMSON_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.CRIMSON_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.CRIMSON_TILES.get());
                output.accept(RevampedBlocks.CRIMSON_TILE_STAIRS.get());
                output.accept(RevampedBlocks.CRIMSON_TILE_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_WARPED_HYPHAE);
                output.accept(RevampedBlocks.WARPED_MOSAIC.get());
                output.accept(RevampedBlocks.WARPED_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.WARPED_MOSAIC_SLAB.get());
                output.accept(RevampedBlocks.WARPED_TILES.get());
                output.accept(RevampedBlocks.WARPED_TILE_STAIRS.get());
                output.accept(RevampedBlocks.WARPED_TILE_SLAB.get());
            }).build());
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}
