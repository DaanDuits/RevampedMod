package net.daanbanaan.revamped.villager;

import java.util.Optional;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

public class RevampedVillagerTrades {
	public static class StripLogsForEmeralds implements VillagerTrades.ItemListing {
		private final int villagerXp;
		private final TagKey<Block> tradeableLogs;
		private final int AMOUNT = 8;
		
		public StripLogsForEmeralds(int villagerXp, TagKey<Block> tradeableLogs) {
			this.villagerXp = villagerXp;
			this.tradeableLogs = tradeableLogs;
		}
		
		@Override
		public MerchantOffer getOffer(Entity trader, RandomSource random) {
			Optional<Holder<Block>> optional = trader.level()
					.registryAccess()
					.registryOrThrow(Registries.BLOCK)
					.getRandomElementOf(this.tradeableLogs, random);
			Item logItem;
			ItemStack itemStack;
			if (!optional.isEmpty()) {
				Holder<Block> holder = optional.get();
				logItem = holder.value().asItem();
				
				Strippable data = holder.getData(NeoForgeDataMaps.STRIPPABLES);
				
				if (data != null) {
					itemStack = new ItemStack(data.strippedBlock().asItem(), AMOUNT);
				}
				else {
					logItem = Items.OAK_LOG;
					itemStack = new ItemStack(Items.OAK_LOG, AMOUNT);
				}
			}
			else {
				logItem = Items.OAK_LOG;
				itemStack = new ItemStack(Items.OAK_LOG, AMOUNT);
			}
			return new MerchantOffer(new ItemCost(Items.EMERALD, 14), Optional.of(new ItemCost(logItem, AMOUNT)), itemStack, 5, villagerXp, 0.1f);
		}
		
	}
}
