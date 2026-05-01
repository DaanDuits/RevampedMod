package net.daanbanaan.revamped.block;

import java.util.function.Supplier;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.item.RevampedItems;
import net.daanbanaan.revamped.block.custom.ChoppingBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RevampedBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Revamped.MOD_ID);
    
    public static final DeferredBlock<Block> CHOPPING_BLOCK = registerBlock("chopping_block", () -> new ChoppingBlock(Properties.ofFullCopy(Blocks.OAK_PLANKS)
    		.noOcclusion()));
    
    public static final DeferredBlock<Block> OAK_MOSAIC = registerBlock("oak_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<StairBlock> OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",() -> new StairBlock(OAK_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<Block> BIRCH_MOSAIC = registerBlock("birch_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
    public static final DeferredBlock<StairBlock> BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",() -> new StairBlock(BIRCH_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.BIRCH_STAIRS)));
    public static final DeferredBlock<SlabBlock> BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    
    public static final DeferredBlock<Block> SPRUCE_MOSAIC = registerBlock("spruce_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
    public static final DeferredBlock<StairBlock> SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",() -> new StairBlock(SPRUCE_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.SPRUCE_STAIRS)));
    public static final DeferredBlock<SlabBlock> SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    
    public static final DeferredBlock<Block> JUNGLE_MOSAIC = registerBlock("jungle_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
    public static final DeferredBlock<StairBlock> JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",() -> new StairBlock(JUNGLE_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.JUNGLE_STAIRS)));
    public static final DeferredBlock<SlabBlock> JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    
    public static final DeferredBlock<Block> ACACIA_MOSAIC = registerBlock("acacia_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
    public static final DeferredBlock<StairBlock> ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",() -> new StairBlock(ACACIA_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.ACACIA_STAIRS)));
    public static final DeferredBlock<SlabBlock> ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    
    public static final DeferredBlock<Block> DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
    public static final DeferredBlock<StairBlock> DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",() -> new StairBlock(DARK_OAK_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.DARK_OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    
    public static final DeferredBlock<Block> MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
    public static final DeferredBlock<StairBlock> MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",() -> new StairBlock(MANGROVE_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.MANGROVE_STAIRS)));
    public static final DeferredBlock<SlabBlock> MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    
    public static final DeferredBlock<Block> CHERRY_MOSAIC = registerBlock("cherry_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final DeferredBlock<StairBlock> CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",() -> new StairBlock(CHERRY_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.CHERRY_STAIRS)));
    public static final DeferredBlock<SlabBlock> CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    
    public static final DeferredBlock<Block> CRIMSON_MOSAIC = registerBlock("crimson_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));
    public static final DeferredBlock<StairBlock> CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs",() -> new StairBlock(CRIMSON_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.CRIMSON_STAIRS)));
    public static final DeferredBlock<SlabBlock> CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.CRIMSON_SLAB)));
    
    public static final DeferredBlock<Block> WARPED_MOSAIC = registerBlock("warped_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.WARPED_PLANKS)));
    public static final DeferredBlock<StairBlock> WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs",() -> new StairBlock(WARPED_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.WARPED_STAIRS)));
    public static final DeferredBlock<SlabBlock> WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.WARPED_SLAB)));
    
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
