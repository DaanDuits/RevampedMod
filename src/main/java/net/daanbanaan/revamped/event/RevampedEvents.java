package net.daanbanaan.revamped.event;

import java.util.ArrayList;
import java.util.List;

import com.mojang.datafixers.util.Pair;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.daanbanaan.revamped.mixin.StructureTemplatePoolAccessor;
import net.daanbanaan.revamped.tags.RevampedBlockTags;
import net.daanbanaan.revamped.villager.RevampedVillagerTrades;
import net.daanbanaan.revamped.villager.RevampedVillagers;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup.RegistryLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.npc.VillagerTrades;
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
			
			trades.get(4).add(new RevampedVillagerTrades.StripLogsForEmeralds(5, RevampedBlockTags.TRADEABLE_LOGS));
			trades.get(3).add(new VillagerTrades.EmeraldForItems(RevampedBlocks.OAK_MOSAIC, 16, 2, 12, 4));
			trades.get(3).add(new VillagerTrades.EmeraldForItems(RevampedBlocks.SPRUCE_MOSAIC, 16, 2, 12, 4));
			trades.get(3).add(new VillagerTrades.ItemsForEmeralds(RevampedBlocks.CHISELED_OAK_WOOD.get(), 7, 2, 12, 2));
			trades.get(3).add(new VillagerTrades.ItemsForEmeralds(RevampedBlocks.CHISELED_SPRUCE_WOOD.get(), 7, 2, 12, 2));
			trades.get(3).add(new VillagerTrades.ItemsForEmeralds(RevampedBlocks.OAK_TILES.get(), 7, 2, 12, 2));
			trades.get(3).add(new VillagerTrades.ItemsForEmeralds(RevampedBlocks.SPRUCE_TILES.get(), 7, 2, 12, 2));
			
			trades.get(5).add(new RevampedVillagerTrades.StripLogsForEmeralds(5, RevampedBlockTags.TRADEABLE_LOGS));
			trades.get(3).add(new VillagerTrades.EmeraldForItems(RevampedBlocks.MANGROVE_MOSAIC, 16, 2, 12, 4));
			trades.get(3).add(new VillagerTrades.ItemsForEmeralds(RevampedBlocks.CHISELED_MANGROVE_WOOD.get(), 7, 2, 12, 2));
			trades.get(3).add(new VillagerTrades.ItemsForEmeralds(RevampedBlocks.MANGROVE_TILES.get(), 7, 2, 12, 2));
		}
	}
	
	@SubscribeEvent 
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		Registry<StructureTemplatePool> templatePools = event.getServer().registryAccess().registryOrThrow(Registries.TEMPLATE_POOL);
		addCustomVillagerHouses(templatePools, event.getServer());
	}
	
	private static void addCustomVillagerHouses(Registry<StructureTemplatePool> templatePools, MinecraftServer server) {
		RegistryLookup<StructureProcessorList> processorLookup = server.registryAccess().lookupOrThrow(Registries.PROCESSOR_LIST);
		
		Holder<StructureProcessorList> mossify10Percent = processorLookup.getOrThrow(ProcessorLists.MOSSIFY_10_PERCENT);
		Holder<StructureProcessorList> zombieTaigaProcessor = processorLookup.getOrThrow(ProcessorLists.ZOMBIE_TAIGA);

		StructureTemplatePool plainsPool = templatePools.get(ResourceLocation.withDefaultNamespace("village/plains/houses"));
		addToTemplatePool(plainsPool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/plains/houses/plains_lumberjack_lodge_1", mossify10Percent).apply(Projection.RIGID), 2);
		addToTemplatePool(plainsPool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/plains/houses/plains_lumberjack_lodge_2", mossify10Percent).apply(Projection.RIGID), 2);

		StructureTemplatePool taigaPool = templatePools.get(ResourceLocation.withDefaultNamespace("village/taiga/houses"));
		addToTemplatePool(taigaPool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/taiga/houses/taiga_lumberjack_lodge_1", mossify10Percent).apply(Projection.RIGID), 6);
		addToTemplatePool(taigaPool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/taiga/houses/taiga_lumberjack_lodge_2", mossify10Percent).apply(Projection.RIGID), 5);
		addToTemplatePool(taigaPool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/taiga/houses/taiga_lumberjack", mossify10Percent).apply(Projection.RIGID), 3);
		
		StructureTemplatePool taigaZombiePool = templatePools.get(ResourceLocation.withDefaultNamespace("village/taiga/zombie/houses"));
		addToTemplatePool(taigaZombiePool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/taiga/zombie/houses/taiga_lumberjack_lodge_2", zombieTaigaProcessor).apply(Projection.RIGID), 3);

		StructureTemplatePool snowyPool = templatePools.get(ResourceLocation.withDefaultNamespace("village/snowy/houses"));
		addToTemplatePool(snowyPool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/snowy/houses/snowy_lumberjack_lodge_1").apply(Projection.RIGID), 4);
		
		StructureTemplatePool savannaPool = templatePools.get(ResourceLocation.withDefaultNamespace("village/savanna/houses"));
		addToTemplatePool(savannaPool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/savanna/houses/savanna_lumberjack_lodge_1").apply(Projection.RIGID), 4);
		
		StructureTemplatePool desertPool = templatePools.get(ResourceLocation.withDefaultNamespace("village/desert/houses"));
		addToTemplatePool(desertPool, SinglePoolElement.legacy(Revamped.MOD_ID + ":village/desert/houses/desert_lumberjack_lodge_1").apply(Projection.RIGID), 2);
	}
	
	private static void addToTemplatePool(StructureTemplatePool pool, StructurePoolElement newPiece, int weight) {
		if (pool == null) return;
		StructureTemplatePoolAccessor poolAccess = (StructureTemplatePoolAccessor)pool;
		ObjectArrayList<StructurePoolElement> oldPieces = poolAccess.getTemplates();
		
		for (int i = 0; i < weight; i++) {
			oldPieces.add(newPiece);
		}
		
		List<Pair<StructurePoolElement, Integer>> listOfPieceEntries = new ArrayList<>(poolAccess.getRawTemplates());
		listOfPieceEntries.add(new Pair<>(newPiece, weight));
		poolAccess.setRawTemplates(listOfPieceEntries);
	}
}
