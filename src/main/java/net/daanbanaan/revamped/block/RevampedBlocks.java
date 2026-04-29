package net.daanbanaan.revamped.block;

import java.util.function.Supplier;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.item.RevampedItems;
import net.daanbanaan.revamped.block.custom.ChoppingBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RevampedBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Revamped.MOD_ID);
    
    public static final DeferredBlock<Block> CHOPPING_BLOCK = registerBlock("chopping_block", () -> new ChoppingBlock(BlockBehaviour.Properties.of()
    		.mapColor(MapColor.WOOD)
    		.sound(SoundType.WOOD)
    		.strength(2.0f, 3.0f)
    		.noOcclusion()));
    
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
    	DeferredBlock<T> toReturn = BLOCKS.register(name, block);
    	registerBlockItem(name, toReturn);
    	return toReturn;
    }
    
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
    	RevampedItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    
    public static void register(IEventBus eventBus) {
    	BLOCKS.register(eventBus);
    }
}
