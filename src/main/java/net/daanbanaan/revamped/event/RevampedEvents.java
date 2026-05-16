package net.daanbanaan.revamped.event;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mojang.datafixers.util.Pair;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.mixin.StructureTemplatePoolAccessor;
import net.daanbanaan.revamped.tags.RevampedBlockTags;
import net.daanbanaan.revamped.villager.RevampedVillagerTrades;
import net.daanbanaan.revamped.villager.RevampedVillagers;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

@EventBusSubscriber(modid = Revamped.MOD_ID)
public class RevampedEvents {
	@SubscribeEvent
	public static void onRegisterTrades(VillagerTradesEvent event) {
		if (event.getType() == RevampedVillagers.LUMBERJACK.value()) {
			Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
			
			trades.get(1).add(new RevampedVillagerTrades.StripLogsForEmeralds(5, RevampedBlockTags.TRADEABLE_LOGS));
			trades.get(1).add(new VillagerTrades.EmeraldForItems(Blocks.OAK_LOG, 16, 2, 12, 4));
			trades.get(1).add(new VillagerTrades.EmeraldForItems(Blocks.BIRCH_LOG, 16, 2, 12, 4));
			trades.get(1).add(new VillagerTrades.EmeraldForItems(Blocks.SPRUCE_LOG, 16, 2, 12, 4));
			trades.get(1).add(new VillagerTrades.ItemsForEmeralds(Blocks.OAK_PLANKS, 7, 2, 12, 2));
			trades.get(1).add(new VillagerTrades.ItemsForEmeralds(Blocks.BIRCH_PLANKS, 7, 2, 12, 2));
			trades.get(1).add(new VillagerTrades.ItemsForEmeralds(Blocks.SPRUCE_PLANKS, 7, 2, 12, 2));
			
			trades.get(2).add(new RevampedVillagerTrades.StripLogsForEmeralds(5, RevampedBlockTags.TRADEABLE_LOGS));
			trades.get(2).add(new VillagerTrades.EmeraldForItems(Blocks.JUNGLE_LOG, 16, 2, 12, 4));
			trades.get(2).add(new VillagerTrades.EmeraldForItems(Blocks.ACACIA_LOG, 16, 2, 12, 4));
			trades.get(2).add(new VillagerTrades.EmeraldForItems(Blocks.DARK_OAK_LOG, 16, 2, 12, 4));
			trades.get(2).add(new VillagerTrades.ItemsForEmeralds(Blocks.JUNGLE_PLANKS, 7, 2, 12, 2));
			trades.get(2).add(new VillagerTrades.ItemsForEmeralds(Blocks.ACACIA_PLANKS, 7, 2, 12, 2));
			trades.get(2).add(new VillagerTrades.ItemsForEmeralds(Blocks.DARK_OAK_PLANKS, 7, 2, 12, 2));
			
			trades.get(3).add(new RevampedVillagerTrades.StripLogsForEmeralds(5, RevampedBlockTags.TRADEABLE_LOGS));
			trades.get(3).add(new VillagerTrades.EmeraldForItems(Blocks.MANGROVE_LOG, 16, 2, 12, 4));
			trades.get(3).add(new VillagerTrades.EmeraldForItems(Blocks.CHERRY_LOG, 16, 2, 12, 4));
			trades.get(3).add(new VillagerTrades.EmeraldForItems(Blocks.BAMBOO_BLOCK, 16, 2, 12, 4));
			trades.get(3).add(new VillagerTrades.ItemsForEmeralds(Blocks.MANGROVE_PLANKS, 7, 2, 12, 2));
			trades.get(3).add(new VillagerTrades.ItemsForEmeralds(Blocks.CHERRY_PLANKS, 7, 2, 12, 2));
			trades.get(3).add(new VillagerTrades.ItemsForEmeralds(Blocks.BAMBOO_PLANKS, 7, 2, 12, 2));
		}
	}
	
	@SubscribeEvent 
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		Registry<StructureTemplatePool> templatePools = event.getServer().registryAccess().registryOrThrow(Registries.TEMPLATE_POOL);
		addCustomVillagerHouses(templatePools, event.getServer());
	}
	
	private static void addCustomVillagerHouses(Registry<StructureTemplatePool> templatePools, MinecraftServer server) {
		StructureTemplatePool plainsPool = templatePools.get(ResourceLocation.withDefaultNamespace("village/plains/houses"));
		Holder<StructureProcessorList> processorHolder = server.registryAccess()
			    .lookupOrThrow(Registries.PROCESSOR_LIST)
			    .getOrThrow(ProcessorLists.MOSSIFY_10_PERCENT);
		
		addToTemplatePool(plainsPool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/plains/houses/plains_lumberjack_lodge_1", processorHolder).apply(Projection.RIGID), 1);
	}
	
	private static void addToTemplatePool(StructureTemplatePool pool, StructurePoolElement newPiece, int weight) {
		if (pool == null) return;
		StructureTemplatePoolAccessor poolAccess = (StructureTemplatePoolAccessor)pool;
		List<StructurePoolElement> oldPieces = poolAccess.getTemplates();
		
		for (int i = 0; i < weight; i++) {
			oldPieces.add(newPiece);
		}
		
		List<Pair<StructurePoolElement, Integer>> listOfPieceEntries = new ArrayList<>(poolAccess.getRawTemplates());
		listOfPieceEntries.add(new Pair<>(newPiece, weight));
	}
}
