package net.daanbanaan.revamped.item;

import net.daanbanaan.revamped.Revamped;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RevampedItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Revamped.MOD_ID);
	
	public static void register(IEventBus eventBus)
	{
		ITEMS.register(eventBus);
	}
}
