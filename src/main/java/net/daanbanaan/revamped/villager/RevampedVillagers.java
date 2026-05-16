package net.daanbanaan.revamped.villager;

import net.daanbanaan.revamped.villager.poi.RevampedPois;

import com.google.common.collect.ImmutableSet;

import net.daanbanaan.revamped.Revamped;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RevampedVillagers {
	public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, Revamped.MOD_ID);
	
	public static final Holder<VillagerProfession> LUMBERJACK = VILLAGER_PROFESSIONS.register("lumberjack", 
			() -> new VillagerProfession("lumberjack", holder -> holder.value() == RevampedPois.LUMBERJACK_POI.value(), 
			poiTypeHolder -> poiTypeHolder.value() == RevampedPois.LUMBERJACK_POI.value(), ImmutableSet.of(), ImmutableSet.of(), 
			SoundEvents.UI_STONECUTTER_TAKE_RESULT));
	
	public static void register(IEventBus eventBus) {
		VILLAGER_PROFESSIONS.register(eventBus);
	}
}
