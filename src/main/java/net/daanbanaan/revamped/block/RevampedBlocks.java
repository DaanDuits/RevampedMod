package net.daanbanaan.revamped.block;

import java.util.function.Supplier;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.custom.HollowLog;
import net.daanbanaan.revamped.item.RevampedItems;
import net.daanbanaan.revamped.block.custom.ChoppingBlock;
import net.minecraft.world.level.block.*;
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

    public static final DeferredBlock<Block> CHISELED_OAK_WOOD = registerBlock("chiseled_oak_wood",() -> new Block(Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> OAK_MOSAIC = registerBlock("oak_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<StairBlock> OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",() -> new StairBlock(OAK_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<Block> OAK_TILES = registerBlock("oak_tiles",() -> new Block(Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<StairBlock> OAK_TILE_STAIRS = registerBlock("oak_tile_stairs",() -> new StairBlock(OAK_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> OAK_TILE_SLAB = registerBlock("oak_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_OAK_LOG = registerBlock("hollow_oak_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_OAK_LOG = registerBlock("stripped_hollow_oak_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final DeferredBlock<Block> CHISELED_BIRCH_WOOD = registerBlock("chiseled_birch_wood",() -> new Block(Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
    public static final DeferredBlock<Block> BIRCH_MOSAIC = registerBlock("birch_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
    public static final DeferredBlock<StairBlock> BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",() -> new StairBlock(BIRCH_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.BIRCH_STAIRS)));
    public static final DeferredBlock<SlabBlock> BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final DeferredBlock<Block> BIRCH_TILES = registerBlock("birch_tiles",() -> new Block(Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
    public static final DeferredBlock<StairBlock> BIRCH_TILE_STAIRS = registerBlock("birch_tile_stairs",() -> new StairBlock(BIRCH_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.BIRCH_STAIRS)));
    public static final DeferredBlock<SlabBlock> BIRCH_TILE_SLAB = registerBlock("birch_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.BIRCH_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_BIRCH_LOG = registerBlock("hollow_birch_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_BIRCH_LOG = registerBlock("stripped_hollow_birch_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion()));

    public static final DeferredBlock<Block> CHISELED_SPRUCE_WOOD = registerBlock("chiseled_spruce_wood",() -> new Block(Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
    public static final DeferredBlock<Block> SPRUCE_MOSAIC = registerBlock("spruce_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
    public static final DeferredBlock<StairBlock> SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",() -> new StairBlock(SPRUCE_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.SPRUCE_STAIRS)));
    public static final DeferredBlock<SlabBlock> SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final DeferredBlock<Block> SPRUCE_TILES = registerBlock("spruce_tiles",() -> new Block(Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
    public static final DeferredBlock<StairBlock> SPRUCE_TILE_STAIRS = registerBlock("spruce_tile_stairs",() -> new StairBlock(SPRUCE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.SPRUCE_STAIRS)));
    public static final DeferredBlock<SlabBlock> SPRUCE_TILE_SLAB = registerBlock("spruce_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.SPRUCE_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_SPRUCE_LOG = registerBlock("hollow_spruce_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_SPRUCE_LOG = registerBlock("stripped_hollow_spruce_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion()));

    public static final DeferredBlock<Block> CHISELED_JUNGLE_WOOD = registerBlock("chiseled_jungle_wood",() -> new Block(Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
    public static final DeferredBlock<Block> JUNGLE_MOSAIC = registerBlock("jungle_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
    public static final DeferredBlock<StairBlock> JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",() -> new StairBlock(JUNGLE_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.JUNGLE_STAIRS)));
    public static final DeferredBlock<SlabBlock> JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final DeferredBlock<Block> JUNGLE_TILES = registerBlock("jungle_tiles",() -> new Block(Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
    public static final DeferredBlock<StairBlock> JUNGLE_TILE_STAIRS = registerBlock("jungle_tile_stairs",() -> new StairBlock(JUNGLE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.JUNGLE_STAIRS)));
    public static final DeferredBlock<SlabBlock> JUNGLE_TILE_SLAB = registerBlock("jungle_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.JUNGLE_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_JUNGLE_LOG = registerBlock("hollow_jungle_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_JUNGLE_LOG = registerBlock("stripped_hollow_jungle_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion()));

    public static final DeferredBlock<Block> CHISELED_ACACIA_WOOD = registerBlock("chiseled_acacia_wood",() -> new Block(Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
    public static final DeferredBlock<Block> ACACIA_MOSAIC = registerBlock("acacia_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
    public static final DeferredBlock<StairBlock> ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",() -> new StairBlock(ACACIA_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.ACACIA_STAIRS)));
    public static final DeferredBlock<SlabBlock> ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final DeferredBlock<Block> ACACIA_TILES = registerBlock("acacia_tiles",() -> new Block(Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
    public static final DeferredBlock<StairBlock> ACACIA_TILE_STAIRS = registerBlock("acacia_tile_stairs",() -> new StairBlock(ACACIA_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.ACACIA_STAIRS)));
    public static final DeferredBlock<SlabBlock> ACACIA_TILE_SLAB = registerBlock("acacia_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.ACACIA_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_ACACIA_LOG = registerBlock("hollow_acacia_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_ACACIA_LOG = registerBlock("stripped_hollow_acacia_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion()));

    public static final DeferredBlock<Block> CHISELED_DARK_OAK_WOOD = registerBlock("chiseled_dark_oak_wood",() -> new Block(Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
    public static final DeferredBlock<Block> DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
    public static final DeferredBlock<StairBlock> DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",() -> new StairBlock(DARK_OAK_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.DARK_OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final DeferredBlock<Block> DARK_OAK_TILES = registerBlock("dark_oak_tiles",() -> new Block(Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
    public static final DeferredBlock<StairBlock> DARK_OAK_TILE_STAIRS = registerBlock("dark_oak_tile_stairs",() -> new StairBlock(DARK_OAK_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.DARK_OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> DARK_OAK_TILE_SLAB = registerBlock("dark_oak_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.DARK_OAK_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_DARK_OAK_LOG = registerBlock("hollow_dark_oak_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_DARK_OAK_LOG = registerBlock("stripped_hollow_dark_oak_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion()));

    public static final DeferredBlock<Block> CHISELED_MANGROVE_WOOD = registerBlock("chiseled_mangrove_wood",() -> new Block(Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
    public static final DeferredBlock<Block> MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
    public static final DeferredBlock<StairBlock> MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",() -> new StairBlock(MANGROVE_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.MANGROVE_STAIRS)));
    public static final DeferredBlock<SlabBlock> MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final DeferredBlock<Block> MANGROVE_TILES = registerBlock("mangrove_tiles",() -> new Block(Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
    public static final DeferredBlock<StairBlock> MANGROVE_TILE_STAIRS = registerBlock("mangrove_tile_stairs",() -> new StairBlock(MANGROVE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.MANGROVE_STAIRS)));
    public static final DeferredBlock<SlabBlock> MANGROVE_TILE_SLAB = registerBlock("mangrove_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.MANGROVE_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_MANGROVE_LOG = registerBlock("hollow_mangrove_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_MANGROVE_LOG = registerBlock("stripped_hollow_mangrove_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion()));

    public static final DeferredBlock<Block> CHISELED_CHERRY_WOOD = registerBlock("chiseled_cherry_wood",() -> new Block(Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final DeferredBlock<Block> CHERRY_MOSAIC = registerBlock("cherry_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final DeferredBlock<StairBlock> CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",() -> new StairBlock(CHERRY_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.CHERRY_STAIRS)));
    public static final DeferredBlock<SlabBlock> CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final DeferredBlock<Block> CHERRY_TILES = registerBlock("cherry_tiles",() -> new Block(Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final DeferredBlock<StairBlock> CHERRY_TILE_STAIRS = registerBlock("cherry_tile_stairs",() -> new StairBlock(CHERRY_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.CHERRY_STAIRS)));
    public static final DeferredBlock<SlabBlock> CHERRY_TILE_SLAB = registerBlock("cherry_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_CHERRY_LOG = registerBlock("hollow_cherry_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_CHERRY_LOG = registerBlock("stripped_hollow_cherry_log",() -> new HollowLog(Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion()));

    public static final DeferredBlock<Block> CHISELED_BAMBOO_BLOCK = registerBlock("chiseled_bamboo_block",() -> new Block(Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));
    public static final DeferredBlock<Block> BAMBOO_TILES = registerBlock("bamboo_tiles",() -> new Block(Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));
    public static final DeferredBlock<StairBlock> BAMBOO_TILE_STAIRS = registerBlock("bamboo_tile_stairs",() -> new StairBlock(BAMBOO_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.BAMBOO_STAIRS)));
    public static final DeferredBlock<SlabBlock> BAMBOO_TILE_SLAB = registerBlock("bamboo_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.BAMBOO_SLAB)));

    public static final DeferredBlock<Block> CHISELED_CRIMSON_HYPHAE = registerBlock("chiseled_crimson_hyphae",() -> new Block(Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));
    public static final DeferredBlock<Block> CRIMSON_MOSAIC = registerBlock("crimson_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));
    public static final DeferredBlock<StairBlock> CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs",() -> new StairBlock(CRIMSON_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.CRIMSON_STAIRS)));
    public static final DeferredBlock<SlabBlock> CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.CRIMSON_SLAB)));
    public static final DeferredBlock<Block> CRIMSON_TILES = registerBlock("crimson_tiles",() -> new Block(Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));
    public static final DeferredBlock<StairBlock> CRIMSON_TILE_STAIRS = registerBlock("crimson_tile_stairs",() -> new StairBlock(CRIMSON_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.CRIMSON_STAIRS)));
    public static final DeferredBlock<SlabBlock> CRIMSON_TILE_SLAB = registerBlock("crimson_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.CRIMSON_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_CRIMSON_STEM = registerBlock("hollow_crimson_stem",() -> new HollowLog(Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).sound(SoundType.STEM).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_CRIMSON_STEM = registerBlock("stripped_hollow_crimson_stem",() -> new HollowLog(Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).sound(SoundType.STEM).noOcclusion()));

    public static final DeferredBlock<Block> CHISELED_WARPED_HYPHAE = registerBlock("chiseled_warped_hyphae",() -> new Block(Properties.ofFullCopy(Blocks.WARPED_PLANKS)));
    public static final DeferredBlock<Block> WARPED_MOSAIC = registerBlock("warped_mosaic",() -> new Block(Properties.ofFullCopy(Blocks.WARPED_PLANKS)));
    public static final DeferredBlock<StairBlock> WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs",() -> new StairBlock(WARPED_MOSAIC.get().defaultBlockState(), Properties.ofFullCopy(Blocks.WARPED_STAIRS)));
    public static final DeferredBlock<SlabBlock> WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.WARPED_SLAB)));
    public static final DeferredBlock<Block> WARPED_TILES = registerBlock("warped_tiles",() -> new Block(Properties.ofFullCopy(Blocks.WARPED_PLANKS)));
    public static final DeferredBlock<StairBlock> WARPED_TILE_STAIRS = registerBlock("warped_tile_stairs",() -> new StairBlock(WARPED_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.WARPED_STAIRS)));
    public static final DeferredBlock<SlabBlock> WARPED_TILE_SLAB = registerBlock("warped_tile_slab",() -> new SlabBlock(Properties.ofFullCopy(Blocks.WARPED_SLAB)));
    public static final DeferredBlock<HollowLog> HOLLOW_WARPED_STEM = registerBlock("hollow_warped_stem",() -> new HollowLog(Properties.ofFullCopy(Blocks.WARPED_PLANKS).sound(SoundType.STEM).noOcclusion()));
    public static final DeferredBlock<HollowLog> STRIPPED_HOLLOW_WARPED_STEM = registerBlock("stripped_hollow_warped_stem",() -> new HollowLog(Properties.ofFullCopy(Blocks.WARPED_PLANKS).sound(SoundType.STEM).noOcclusion()));

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
