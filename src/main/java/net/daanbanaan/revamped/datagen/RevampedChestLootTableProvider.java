package net.daanbanaan.revamped.datagen;

import java.util.function.BiConsumer;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class RevampedChestLootTableProvider implements LootTableSubProvider {

	public RevampedChestLootTableProvider(HolderLookup.Provider lookupProvider) { }
	
	@Override
	public void generate(BiConsumer<ResourceKey<LootTable>, Builder> output) {
		ResourceKey<LootTable> plainsVillage = ResourceKey.create(
		        Registries.LOOT_TABLE, 
		        ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "chests/village/village_plains_lumberjack")
		    );
		
		output.accept(plainsVillage, LootTable.lootTable()
				.setParamSet(LootContextParamSets.CHEST)
				.withPool(LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0f, 5.0f))
						.add(LootItem.lootTableItem(RevampedBlocks.OAK_MOSAIC).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.OAK_PLANKS).setWeight(6).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 3.0f))))
						.add(LootItem.lootTableItem(Items.OAK_LOG).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 3.0f))))
						.add(LootItem.lootTableItem(Items.STRIPPED_OAK_LOG).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(1))
						.add(LootItem.lootTableItem(Items.BREAD).setWeight(4).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.OAK_SAPLING).setWeight(6).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 8.0f))))
						.add(LootItem.lootTableItem(Items.BIRCH_SAPLING).setWeight(3).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 3.0f))))
						)
					);
		
		ResourceKey<LootTable> taigaVillage = ResourceKey.create(
		        Registries.LOOT_TABLE, 
		        ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "chests/village/village_taiga_lumberjack")
		    );
		output.accept(taigaVillage, LootTable.lootTable()
				.setParamSet(LootContextParamSets.CHEST)
				.withPool(LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0f, 5.0f))
						.add(LootItem.lootTableItem(RevampedBlocks.SPRUCE_MOSAIC).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.SPRUCE_PLANKS).setWeight(6).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 3.0f))))
						.add(LootItem.lootTableItem(Items.SPRUCE_LOG).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 3.0f))))
						.add(LootItem.lootTableItem(Items.STRIPPED_SPRUCE_LOG).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(1))
						.add(LootItem.lootTableItem(Items.BREAD).setWeight(4).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.SWEET_BERRIES).setWeight(4).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.SPRUCE_SAPLING).setWeight(6).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 8.0f))))
						)
					);
		
		ResourceKey<LootTable> snowyVillage = ResourceKey.create(
		        Registries.LOOT_TABLE, 
		        ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "chests/village/village_snowy_lumberjack")
		    );
		output.accept(snowyVillage, LootTable.lootTable()
				.setParamSet(LootContextParamSets.CHEST)
				.withPool(LootPool.lootPool()
						.setRolls(UniformGenerator.between(1.0f, 5.0f))
						.add(LootItem.lootTableItem(RevampedBlocks.CHISELED_SPRUCE_WOOD).setWeight(4).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(RevampedBlocks.SPRUCE_MOSAIC).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.SPRUCE_PLANKS).setWeight(6).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 3.0f))))
						.add(LootItem.lootTableItem(Items.SPRUCE_LOG).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 3.0f))))
						.add(LootItem.lootTableItem(Items.STRIPPED_SPRUCE_LOG).setWeight(5).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(1))
						.add(LootItem.lootTableItem(Items.BREAD).setWeight(4).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f))))
						.add(LootItem.lootTableItem(Items.SPRUCE_SAPLING).setWeight(6).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 8.0f))))
						)
					);
	}

}
