package net.daanbanaan.revamped.event;

import net.daanbanaan.revamped.client.gui.screen.inventory.ChoppingBlockScreen;
import net.daanbanaan.revamped.world.inventory.RevampedMenuTypes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

@EventBusSubscriber(modid = "revamped", value = Dist.CLIENT)
public class RevampedClientEvents {
	@SubscribeEvent
	public static void registerScreens(RegisterMenuScreensEvent event) {
	    // This links your MenuType to the vanilla Stonecutter GUI
	    event.register(RevampedMenuTypes.CHOPPING_BLOCK_MENU.get(), ChoppingBlockScreen::new);
	}
}
