package net.daanbanaan.revamped.villager.poi;

import com.google.common.collect.ImmutableSet;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RevampedPois {
	public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, Revamped.MOD_ID);
	
	public static final Holder<PoiType> LUMBERJACK_POI = POI_TYPES.register("lumberjack_poi", 
			() -> new PoiType(ImmutableSet.copyOf(RevampedBlocks.CHOPPING_BLOCK.get().getStateDefinition().getPossibleStates()), 1, 1));
	
	public static void register(IEventBus eventBus) {
		POI_TYPES.register(eventBus);
	}
}
