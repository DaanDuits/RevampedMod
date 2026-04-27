package net.daanbanaan.revamped.world.inventory;

import net.daanbanaan.revamped.Revamped;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RevampedMenuTypes {
	public static final DeferredRegister<MenuType<?>> MENUS = 
            DeferredRegister.create(Registries.MENU, Revamped.MOD_ID);

    // We use IMenuTypeExtension because StonecutterMenu needs ContainerLevelAccess 
    // (which usually requires extra data or special handling during sync)
    public static final DeferredHolder<MenuType<?>, MenuType<ChoppingBlockMenu>> CHOPPING_BLOCK_MENU =
            MENUS.register("chopping_block_menu", () -> IMenuTypeExtension.create((windowId, inv, data) -> {
                // On the client, we don't have the LevelPos easily via 'data' unless we send it, 
                // but for a simple copy, we can use this:
                return new ChoppingBlockMenu(windowId, inv, net.minecraft.world.inventory.ContainerLevelAccess.NULL);
            }));

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
