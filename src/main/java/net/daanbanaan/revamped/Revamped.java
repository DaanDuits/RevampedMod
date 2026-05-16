package net.daanbanaan.revamped;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.daanbanaan.revamped.block.RevampedBlocks;
import net.daanbanaan.revamped.item.RevampedItems;
import net.daanbanaan.revamped.recipe.RevampedRecipes;
import net.daanbanaan.revamped.villager.RevampedVillagers;
import net.daanbanaan.revamped.villager.poi.RevampedPois;
import net.daanbanaan.revamped.world.inventory.RevampedMenuTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Revamped.MOD_ID)
public class Revamped {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "revamped";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "revamped" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    // Creates a creative tab with the id "revamped:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("revamped_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.revamped")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> new ItemStack(RevampedBlocks.CHOPPING_BLOCK.get()))
            .displayItems((parameters, output) -> {
                output.accept(RevampedBlocks.CHOPPING_BLOCK.get());

                output.accept(RevampedBlocks.CHISELED_OAK_WOOD);
                output.accept(RevampedBlocks.OAK_MOSAIC.get());
                output.accept(RevampedBlocks.OAK_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.OAK_MOSAIC_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_BIRCH_WOOD);
                output.accept(RevampedBlocks.BIRCH_MOSAIC.get());
                output.accept(RevampedBlocks.BIRCH_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.BIRCH_MOSAIC_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_SPRUCE_WOOD);
                output.accept(RevampedBlocks.SPRUCE_MOSAIC.get());
                output.accept(RevampedBlocks.SPRUCE_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.SPRUCE_MOSAIC_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_JUNGLE_WOOD);
                output.accept(RevampedBlocks.JUNGLE_MOSAIC.get());
                output.accept(RevampedBlocks.JUNGLE_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.JUNGLE_MOSAIC_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_ACACIA_WOOD);
                output.accept(RevampedBlocks.ACACIA_MOSAIC.get());
                output.accept(RevampedBlocks.ACACIA_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.ACACIA_MOSAIC_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_DARK_OAK_WOOD);
                output.accept(RevampedBlocks.DARK_OAK_MOSAIC.get());
                output.accept(RevampedBlocks.DARK_OAK_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.DARK_OAK_MOSAIC_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_MANGROVE_WOOD);
                output.accept(RevampedBlocks.MANGROVE_MOSAIC.get());
                output.accept(RevampedBlocks.MANGROVE_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.MANGROVE_MOSAIC_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_CHERRY_WOOD);
                output.accept(RevampedBlocks.CHERRY_MOSAIC.get());
                output.accept(RevampedBlocks.CHERRY_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.CHERRY_MOSAIC_SLAB.get());
                
                output.accept(RevampedBlocks.CHISELED_BAMBOO_BLOCK);

                output.accept(RevampedBlocks.CHISELED_CRIMSON_HYPHAE);
                output.accept(RevampedBlocks.CRIMSON_MOSAIC.get());
                output.accept(RevampedBlocks.CRIMSON_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.CRIMSON_MOSAIC_SLAB.get());

                output.accept(RevampedBlocks.CHISELED_WARPED_HYPHAE);
                output.accept(RevampedBlocks.WARPED_MOSAIC.get());
                output.accept(RevampedBlocks.WARPED_MOSAIC_STAIRS.get());
                output.accept(RevampedBlocks.WARPED_MOSAIC_SLAB.get());
            }).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Revamped(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        RevampedBlocks.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        RevampedItems.register(modEventBus);
        
        RevampedMenuTypes.register(modEventBus);
        
        RevampedRecipes.register(modEventBus);
        
        RevampedPois.register(modEventBus);
        
        RevampedVillagers.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (Revamped) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            insertCreative(event, Items.STONECUTTER, RevampedBlocks.CHOPPING_BLOCK.get());
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
        	insertCreative(event, Items.STRIPPED_OAK_WOOD, RevampedBlocks.CHISELED_OAK_WOOD.get());
            insertBlockSetCreative(event, Items.OAK_PLANKS, RevampedBlocks.OAK_MOSAIC.get(),
            		Items.OAK_STAIRS, RevampedBlocks.OAK_MOSAIC_STAIRS.get(),
            		Items.OAK_SLAB, RevampedBlocks.OAK_MOSAIC_SLAB.get());

        	insertCreative(event, Items.STRIPPED_BIRCH_WOOD, RevampedBlocks.CHISELED_BIRCH_WOOD.get());
            insertBlockSetCreative(event, Items.BIRCH_PLANKS, RevampedBlocks.BIRCH_MOSAIC.get(),
            		Items.BIRCH_STAIRS, RevampedBlocks.BIRCH_MOSAIC_STAIRS.get(),
            		Items.BIRCH_SLAB, RevampedBlocks.BIRCH_MOSAIC_SLAB.get());

        	insertCreative(event, Items.STRIPPED_SPRUCE_WOOD, RevampedBlocks.CHISELED_SPRUCE_WOOD.get());
            insertBlockSetCreative(event, Items.SPRUCE_PLANKS, RevampedBlocks.SPRUCE_MOSAIC.get(),
            		Items.SPRUCE_STAIRS, RevampedBlocks.SPRUCE_MOSAIC_STAIRS.get(),
            		Items.SPRUCE_SLAB, RevampedBlocks.SPRUCE_MOSAIC_SLAB.get());

        	insertCreative(event, Items.STRIPPED_JUNGLE_WOOD, RevampedBlocks.CHISELED_JUNGLE_WOOD.get());
            insertBlockSetCreative(event, Items.JUNGLE_PLANKS, RevampedBlocks.JUNGLE_MOSAIC.get(),
            		Items.JUNGLE_STAIRS, RevampedBlocks.JUNGLE_MOSAIC_STAIRS.get(),
            		Items.JUNGLE_SLAB, RevampedBlocks.JUNGLE_MOSAIC_SLAB.get());

        	insertCreative(event, Items.STRIPPED_ACACIA_WOOD, RevampedBlocks.CHISELED_ACACIA_WOOD.get());
            insertBlockSetCreative(event, Items.ACACIA_PLANKS, RevampedBlocks.ACACIA_MOSAIC.get(),
            		Items.ACACIA_STAIRS, RevampedBlocks.ACACIA_MOSAIC_STAIRS.get(),
            		Items.ACACIA_SLAB, RevampedBlocks.ACACIA_MOSAIC_SLAB.get());

        	insertCreative(event, Items.STRIPPED_DARK_OAK_WOOD, RevampedBlocks.CHISELED_DARK_OAK_WOOD.get());
            insertBlockSetCreative(event, Items.DARK_OAK_PLANKS, RevampedBlocks.DARK_OAK_MOSAIC.get(),
            		Items.DARK_OAK_STAIRS, RevampedBlocks.DARK_OAK_MOSAIC_STAIRS.get(),
            		Items.DARK_OAK_SLAB, RevampedBlocks.DARK_OAK_MOSAIC_SLAB.get());

        	insertCreative(event, Items.STRIPPED_MANGROVE_WOOD, RevampedBlocks.CHISELED_MANGROVE_WOOD.get());
            insertBlockSetCreative(event, Items.MANGROVE_PLANKS, RevampedBlocks.MANGROVE_MOSAIC.get(),
            		Items.MANGROVE_STAIRS, RevampedBlocks.MANGROVE_MOSAIC_STAIRS.get(),
            		Items.MANGROVE_SLAB, RevampedBlocks.MANGROVE_MOSAIC_SLAB.get());

        	insertCreative(event, Items.STRIPPED_CHERRY_WOOD, RevampedBlocks.CHISELED_CHERRY_WOOD.get());
            insertBlockSetCreative(event, Items.CHERRY_PLANKS, RevampedBlocks.CHERRY_MOSAIC.get(),
            		Items.CHERRY_STAIRS, RevampedBlocks.CHERRY_MOSAIC_STAIRS.get(),
            		Items.CHERRY_SLAB, RevampedBlocks.CHERRY_MOSAIC_SLAB.get());

        	insertCreative(event, Items.STRIPPED_BAMBOO_BLOCK, RevampedBlocks.CHISELED_BAMBOO_BLOCK.get());
        	
        	insertCreative(event, Items.STRIPPED_CRIMSON_HYPHAE, RevampedBlocks.CHISELED_CRIMSON_HYPHAE.get());
            insertBlockSetCreative(event, Items.CRIMSON_PLANKS, RevampedBlocks.CRIMSON_MOSAIC.get(),
            		Items.CRIMSON_STAIRS, RevampedBlocks.CRIMSON_MOSAIC_STAIRS.get(),
            		Items.CRIMSON_SLAB, RevampedBlocks.CRIMSON_MOSAIC_SLAB.get());

        	insertCreative(event, Items.STRIPPED_WARPED_HYPHAE, RevampedBlocks.CHISELED_WARPED_HYPHAE.get());
            insertBlockSetCreative(event, Items.WARPED_PLANKS, RevampedBlocks.WARPED_MOSAIC.get(),
            		Items.WARPED_STAIRS, RevampedBlocks.WARPED_MOSAIC_STAIRS.get(),
            		Items.WARPED_SLAB, RevampedBlocks.WARPED_MOSAIC_SLAB.get());
        }
    }
    
    private void insertCreative(BuildCreativeModeTabContentsEvent event, ItemLike existingEntry, ItemLike newEntry) {
    	ItemStack existingStack = new ItemStack(existingEntry);
        ItemStack newStack = new ItemStack(newEntry);
        event.insertAfter(existingStack, newStack, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
    private void insertBlockSetCreative(BuildCreativeModeTabContentsEvent event, ItemLike existingBlockEntry, ItemLike newBlockEntry, 
    							ItemLike existingStairsEntry, ItemLike newStairsEntry,
    							ItemLike existingSlabEntry, ItemLike newSlabEntry) {
    	insertCreative(event, existingBlockEntry, newBlockEntry);
    	insertCreative(event, existingStairsEntry, newStairsEntry);
    	insertCreative(event, existingSlabEntry, newSlabEntry);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
