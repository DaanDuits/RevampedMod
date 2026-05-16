package net.daanbanaan.revamped;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.daanbanaan.revamped.block.RevampedBlocks;
import net.daanbanaan.revamped.item.RevampedCreativeModeTabs;
import net.daanbanaan.revamped.item.RevampedItems;
import net.daanbanaan.revamped.recipe.RevampedRecipes;
import net.daanbanaan.revamped.villager.RevampedVillagers;
import net.daanbanaan.revamped.villager.poi.RevampedPois;
import net.daanbanaan.revamped.world.inventory.RevampedMenuTypes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Revamped.MOD_ID)
public class Revamped {
    public static final String MOD_ID = "revamped";
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public Revamped(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        RevampedBlocks.register(modEventBus);
        RevampedItems.register(modEventBus);
        
        RevampedMenuTypes.register(modEventBus);
        
        RevampedRecipes.register(modEventBus);
        
        RevampedPois.register(modEventBus);
        
        RevampedVillagers.register(modEventBus);
        
        RevampedCreativeModeTabs.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }   
}
