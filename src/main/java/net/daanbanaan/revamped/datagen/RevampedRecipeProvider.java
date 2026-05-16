package net.daanbanaan.revamped.datagen;

import java.util.concurrent.CompletableFuture;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.daanbanaan.revamped.item.RevampedItems;
import net.daanbanaan.revamped.recipe.ChoppingRecipe;
import net.daanbanaan.revamped.tags.RevampedItemTags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger.TriggerInstance;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public class RevampedRecipeProvider extends RecipeProvider implements IConditionBuilder {

	public RevampedRecipeProvider(PackOutput output, CompletableFuture<Provider> registries) {
		super(output, registries);
	}
	
	@Override
	protected void buildRecipes(RecipeOutput recipeOutput) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RevampedBlocks.CHOPPING_BLOCK.get())
		.pattern(" A ")
		.pattern("LLL")
		.define('A', RevampedItemTags.IRON_TIER_AXES)
		.define('L', ItemTags.LOGS)
		.unlockedBy("has_log", has(ItemTags.LOGS))
		.unlockedBy("has_axe", has(RevampedItemTags.IRON_TIER_AXES))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "chopping_block"));
		
		WoodTypeInfo oakWoodInfo = new WoodTypeInfo("oak", ItemTags.OAK_LOGS, RevampedItemTags.NATURAL_OAK_LOGS, RevampedItemTags.STRIPPED_OAK_LOGS, Items.OAK_LOG, 
				Items.OAK_WOOD, Items.STRIPPED_OAK_LOG, Items.STRIPPED_OAK_WOOD, Items.OAK_PLANKS, Items.OAK_SLAB, Items.OAK_STAIRS, 
				Items.OAK_DOOR, Items.OAK_TRAPDOOR, Items.OAK_SIGN, Items.OAK_FENCE, Items.OAK_FENCE_GATE,
				RevampedBlocks.CHISELED_OAK_WOOD.asItem(), RevampedBlocks.OAK_MOSAIC.asItem(), RevampedBlocks.OAK_MOSAIC_STAIRS.asItem(), RevampedBlocks.OAK_MOSAIC_SLAB.asItem(),
				RevampedBlocks.OAK_TILES.asItem(), RevampedBlocks.OAK_TILE_STAIRS.asItem(), RevampedBlocks.OAK_TILE_SLAB.asItem());
		generateWoodChopping(recipeOutput, oakWoodInfo);
		generateMosaicSetShaped(recipeOutput, oakWoodInfo);
		generateTilesSetShaped(recipeOutput, oakWoodInfo);
		generateChiseledWoodShaped(recipeOutput, oakWoodInfo);
		
		WoodTypeInfo birchWoodInfo = new WoodTypeInfo("birch", ItemTags.BIRCH_LOGS, RevampedItemTags.NATURAL_BIRCH_LOGS, RevampedItemTags.STRIPPED_BIRCH_LOGS, Items.BIRCH_LOG, 
				Items.BIRCH_WOOD, Items.STRIPPED_BIRCH_LOG, Items.STRIPPED_BIRCH_WOOD, Items.BIRCH_PLANKS, Items.BIRCH_SLAB, Items.BIRCH_STAIRS, 
				Items.BIRCH_DOOR, Items.BIRCH_TRAPDOOR, Items.BIRCH_SIGN, Items.BIRCH_FENCE, Items.BIRCH_FENCE_GATE,
				RevampedBlocks.CHISELED_BIRCH_WOOD.asItem(), RevampedBlocks.BIRCH_MOSAIC.asItem(), RevampedBlocks.BIRCH_MOSAIC_STAIRS.asItem(), RevampedBlocks.BIRCH_MOSAIC_SLAB.asItem(),
				RevampedBlocks.BIRCH_TILES.asItem(), RevampedBlocks.BIRCH_TILE_STAIRS.asItem(), RevampedBlocks.BIRCH_TILE_SLAB.asItem());
		generateWoodChopping(recipeOutput, birchWoodInfo);
		generateMosaicSetShaped(recipeOutput, birchWoodInfo);
		generateTilesSetShaped(recipeOutput, birchWoodInfo);
		generateChiseledWoodShaped(recipeOutput, birchWoodInfo);
		
		WoodTypeInfo spruceWoodInfo = new WoodTypeInfo("spruce", ItemTags.SPRUCE_LOGS, RevampedItemTags.NATURAL_SPRUCE_LOGS, RevampedItemTags.STRIPPED_SPRUCE_LOGS, Items.SPRUCE_LOG, 
				Items.SPRUCE_WOOD, Items.STRIPPED_SPRUCE_LOG, Items.STRIPPED_SPRUCE_WOOD, Items.SPRUCE_PLANKS, Items.SPRUCE_SLAB, Items.SPRUCE_STAIRS, 
				Items.SPRUCE_DOOR, Items.SPRUCE_TRAPDOOR, Items.SPRUCE_SIGN, Items.SPRUCE_FENCE, Items.SPRUCE_FENCE_GATE,
				RevampedBlocks.CHISELED_SPRUCE_WOOD.asItem(), RevampedBlocks.SPRUCE_MOSAIC.asItem(), RevampedBlocks.SPRUCE_MOSAIC_STAIRS.asItem(), RevampedBlocks.SPRUCE_MOSAIC_SLAB.asItem(),
				RevampedBlocks.SPRUCE_TILES.asItem(), RevampedBlocks.SPRUCE_TILE_STAIRS.asItem(), RevampedBlocks.SPRUCE_TILE_SLAB.asItem());
		generateWoodChopping(recipeOutput, spruceWoodInfo);
		generateMosaicSetShaped(recipeOutput, spruceWoodInfo);
		generateTilesSetShaped(recipeOutput, spruceWoodInfo);
		generateChiseledWoodShaped(recipeOutput, spruceWoodInfo);
		
		WoodTypeInfo jungleWoodInfo = new WoodTypeInfo("jungle", ItemTags.JUNGLE_LOGS, RevampedItemTags.NATURAL_JUNGLE_LOGS, RevampedItemTags.STRIPPED_JUNGLE_LOGS, Items.JUNGLE_LOG, 
				Items.JUNGLE_WOOD, Items.STRIPPED_JUNGLE_LOG, Items.STRIPPED_JUNGLE_WOOD, Items.JUNGLE_PLANKS, Items.JUNGLE_SLAB, Items.JUNGLE_STAIRS, 
				Items.JUNGLE_DOOR, Items.JUNGLE_TRAPDOOR, Items.JUNGLE_SIGN, Items.JUNGLE_FENCE, Items.JUNGLE_FENCE_GATE,
				RevampedBlocks.CHISELED_JUNGLE_WOOD.asItem(), RevampedBlocks.JUNGLE_MOSAIC.asItem(), RevampedBlocks.JUNGLE_MOSAIC_STAIRS.asItem(), RevampedBlocks.JUNGLE_MOSAIC_SLAB.asItem(),
				RevampedBlocks.JUNGLE_TILES.asItem(), RevampedBlocks.JUNGLE_TILE_STAIRS.asItem(), RevampedBlocks.JUNGLE_TILE_SLAB.asItem());
		generateWoodChopping(recipeOutput, jungleWoodInfo);
		generateMosaicSetShaped(recipeOutput, jungleWoodInfo);
		generateTilesSetShaped(recipeOutput, jungleWoodInfo);
		generateChiseledWoodShaped(recipeOutput, jungleWoodInfo);
		
		WoodTypeInfo acaciaWoodInfo = new WoodTypeInfo("acacia", ItemTags.ACACIA_LOGS, RevampedItemTags.NATURAL_ACACIA_LOGS, RevampedItemTags.STRIPPED_ACACIA_LOGS, Items.ACACIA_LOG, 
				Items.ACACIA_WOOD, Items.STRIPPED_ACACIA_LOG, Items.STRIPPED_ACACIA_WOOD, Items.ACACIA_PLANKS, Items.ACACIA_SLAB, Items.ACACIA_STAIRS, 
				Items.ACACIA_DOOR, Items.ACACIA_TRAPDOOR, Items.ACACIA_SIGN, Items.ACACIA_FENCE, Items.ACACIA_FENCE_GATE,
				RevampedBlocks.CHISELED_ACACIA_WOOD.asItem(), RevampedBlocks.ACACIA_MOSAIC.asItem(), RevampedBlocks.ACACIA_MOSAIC_STAIRS.asItem(), RevampedBlocks.ACACIA_MOSAIC_SLAB.asItem(),
				RevampedBlocks.ACACIA_TILES.asItem(), RevampedBlocks.ACACIA_TILE_STAIRS.asItem(), RevampedBlocks.ACACIA_TILE_SLAB.asItem());
		generateWoodChopping(recipeOutput, acaciaWoodInfo);
		generateMosaicSetShaped(recipeOutput, acaciaWoodInfo);
		generateTilesSetShaped(recipeOutput, acaciaWoodInfo);
		generateChiseledWoodShaped(recipeOutput, acaciaWoodInfo);
		
		WoodTypeInfo darkOakWoodInfo = new WoodTypeInfo("dark_oak", ItemTags.DARK_OAK_LOGS, RevampedItemTags.NATURAL_DARK_OAK_LOGS, RevampedItemTags.STRIPPED_DARK_OAK_LOGS, Items.DARK_OAK_LOG, 
				Items.DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_WOOD, Items.DARK_OAK_PLANKS, Items.DARK_OAK_SLAB, Items.DARK_OAK_STAIRS, 
				Items.DARK_OAK_DOOR, Items.DARK_OAK_TRAPDOOR, Items.DARK_OAK_SIGN, Items.DARK_OAK_FENCE, Items.DARK_OAK_FENCE_GATE,
				RevampedBlocks.CHISELED_DARK_OAK_WOOD.asItem(), RevampedBlocks.DARK_OAK_MOSAIC.asItem(), RevampedBlocks.DARK_OAK_MOSAIC_STAIRS.asItem(), RevampedBlocks.DARK_OAK_MOSAIC_SLAB.asItem(),
				RevampedBlocks.DARK_OAK_TILES.asItem(), RevampedBlocks.DARK_OAK_TILE_STAIRS.asItem(), RevampedBlocks.DARK_OAK_TILE_SLAB.asItem());
		generateWoodChopping(recipeOutput, darkOakWoodInfo);
		generateMosaicSetShaped(recipeOutput, darkOakWoodInfo);
		generateTilesSetShaped(recipeOutput, darkOakWoodInfo);
		generateChiseledWoodShaped(recipeOutput, darkOakWoodInfo);
		
		WoodTypeInfo mangroveWoodInfo = new WoodTypeInfo("mangrove", ItemTags.MANGROVE_LOGS, RevampedItemTags.NATURAL_MANGROVE_LOGS, RevampedItemTags.STRIPPED_MANGROVE_LOGS, Items.MANGROVE_LOG, 
				Items.MANGROVE_WOOD, Items.STRIPPED_MANGROVE_LOG, Items.STRIPPED_MANGROVE_WOOD, Items.MANGROVE_PLANKS, Items.MANGROVE_SLAB, Items.MANGROVE_STAIRS, 
				Items.MANGROVE_DOOR, Items.MANGROVE_TRAPDOOR, Items.MANGROVE_SIGN, Items.MANGROVE_FENCE, Items.MANGROVE_FENCE_GATE,
				RevampedBlocks.CHISELED_MANGROVE_WOOD.asItem(), RevampedBlocks.MANGROVE_MOSAIC.asItem(), RevampedBlocks.MANGROVE_MOSAIC_STAIRS.asItem(), RevampedBlocks.MANGROVE_MOSAIC_SLAB.asItem(),
				RevampedBlocks.MANGROVE_TILES.asItem(), RevampedBlocks.MANGROVE_TILE_STAIRS.asItem(), RevampedBlocks.MANGROVE_TILE_SLAB.asItem());
		generateWoodChopping(recipeOutput, mangroveWoodInfo);
		generateMosaicSetShaped(recipeOutput, mangroveWoodInfo);
		generateTilesSetShaped(recipeOutput, mangroveWoodInfo);
		generateChiseledWoodShaped(recipeOutput, mangroveWoodInfo);
		
		WoodTypeInfo cherryWoodInfo = new WoodTypeInfo("cherry", ItemTags.CHERRY_LOGS, RevampedItemTags.NATURAL_CHERRY_LOGS, RevampedItemTags.STRIPPED_CHERRY_LOGS, Items.CHERRY_LOG, 
				Items.CHERRY_WOOD, Items.STRIPPED_CHERRY_LOG, Items.STRIPPED_CHERRY_WOOD, Items.CHERRY_PLANKS, Items.CHERRY_SLAB, Items.CHERRY_STAIRS, 
				Items.CHERRY_DOOR, Items.CHERRY_TRAPDOOR, Items.CHERRY_SIGN, Items.CHERRY_FENCE, Items.CHERRY_FENCE_GATE,
				RevampedBlocks.CHISELED_CHERRY_WOOD.asItem(), RevampedBlocks.CHERRY_MOSAIC.asItem(), RevampedBlocks.CHERRY_MOSAIC_STAIRS.asItem(), RevampedBlocks.CHERRY_MOSAIC_SLAB.asItem(),
				RevampedBlocks.CHERRY_TILES.asItem(), RevampedBlocks.CHERRY_TILE_STAIRS.asItem(), RevampedBlocks.CHERRY_TILE_SLAB.asItem());
		generateWoodChopping(recipeOutput, cherryWoodInfo);
		generateMosaicSetShaped(recipeOutput, cherryWoodInfo);
		generateTilesSetShaped(recipeOutput, cherryWoodInfo);
		generateChiseledWoodShaped(recipeOutput, cherryWoodInfo);
		
		generateBambooChopping(recipeOutput);
		generateTilesSetShapedBamboo(recipeOutput);
		generateChiseledShapedBamboo(recipeOutput);
		
		WoodTypeInfo crimsonWoodInfo = new WoodTypeInfo("crimson", ItemTags.CRIMSON_STEMS, RevampedItemTags.NATURAL_CRIMSON_STEMS, RevampedItemTags.STRIPPED_CRIMSON_STEMS, Items.CRIMSON_STEM, 
				Items.CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_STEM, Items.STRIPPED_CRIMSON_HYPHAE, Items.CRIMSON_PLANKS, Items.CRIMSON_SLAB, Items.CRIMSON_STAIRS, 
				Items.CRIMSON_DOOR, Items.CRIMSON_TRAPDOOR, Items.CRIMSON_SIGN, Items.CRIMSON_FENCE, Items.CRIMSON_FENCE_GATE,
				RevampedBlocks.CHISELED_CRIMSON_HYPHAE.asItem(), RevampedBlocks.CRIMSON_MOSAIC.asItem(), RevampedBlocks.CRIMSON_MOSAIC_STAIRS.asItem(), RevampedBlocks.CRIMSON_MOSAIC_SLAB.asItem(),
				RevampedBlocks.CRIMSON_TILES.asItem(), RevampedBlocks.CRIMSON_TILE_STAIRS.asItem(), RevampedBlocks.CRIMSON_TILE_SLAB.asItem());
		generateNetherWoodChopping(recipeOutput, crimsonWoodInfo);
		generateMosaicSetShaped(recipeOutput, crimsonWoodInfo);
		generateTilesSetShaped(recipeOutput, crimsonWoodInfo);
		generateChiseledNetherWoodShaped(recipeOutput, crimsonWoodInfo);
		
		WoodTypeInfo warpedWoodInfo = new WoodTypeInfo("warped", ItemTags.WARPED_STEMS, RevampedItemTags.NATURAL_WARPED_STEMS, RevampedItemTags.STRIPPED_WARPED_STEMS, Items.WARPED_STEM, 
				Items.WARPED_HYPHAE, Items.STRIPPED_WARPED_STEM, Items.STRIPPED_WARPED_HYPHAE, Items.WARPED_PLANKS, Items.WARPED_SLAB, Items.WARPED_STAIRS, 
				Items.WARPED_DOOR, Items.WARPED_TRAPDOOR, Items.WARPED_SIGN, Items.WARPED_FENCE, Items.WARPED_FENCE_GATE,
				RevampedBlocks.CHISELED_WARPED_HYPHAE.asItem(), RevampedBlocks.WARPED_MOSAIC.asItem(), RevampedBlocks.WARPED_MOSAIC_STAIRS.asItem(), RevampedBlocks.WARPED_MOSAIC_SLAB.asItem(),
				RevampedBlocks.WARPED_TILES.asItem(), RevampedBlocks.WARPED_TILE_STAIRS.asItem(), RevampedBlocks.WARPED_TILE_SLAB.asItem());
		generateNetherWoodChopping(recipeOutput, warpedWoodInfo);
		generateMosaicSetShaped(recipeOutput, warpedWoodInfo);
		generateTilesSetShaped(recipeOutput, warpedWoodInfo);
		generateChiseledNetherWoodShaped(recipeOutput, warpedWoodInfo);
	}
	
	private static SingleItemRecipeBuilder chopping(RecipeCategory category, Ingredient ingredient, ItemLike output, int count) {
		return new SingleItemRecipeBuilder(category, ChoppingRecipe::new, ingredient, output, count);
	}
	
	private void generateWoodChopping(RecipeOutput recipeOutput, WoodTypeInfo woodType) {
		generateChopping(recipeOutput, woodType, "log", "wood");
	}
	
	private void generateNetherWoodChopping(RecipeOutput recipeOutput, WoodTypeInfo woodType) {
		generateChopping(recipeOutput, woodType, "stem", "hyphae");
	}
	
	private void generateChopping(RecipeOutput recipeOutput, WoodTypeInfo woodType, String logName, String woodBlockName) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.logsTag), woodType.planks, 6)
		.unlockedBy("has_log", has(woodType.logsTag))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_planks_from" + woodType.name + "_" + logName + "s_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.logsTag), woodType.woodSlab, 8)
		.unlockedBy("has_log", has(woodType.logsTag))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_slabs_from_" + woodType.name + "_" + logName + "s_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.logsTag), woodType.woodStairs, 4)
		.unlockedBy("has_log", has(woodType.logsTag))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_stairs_from_" + woodType.name + "_" + logName + "s_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.log), woodType.wood, 1)
		.unlockedBy("has_log", has(woodType.log))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_" + woodBlockName + "_from_" + woodType.name + "_" + logName + "_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.wood), woodType.log, 1)
		.unlockedBy("has_log", has(woodType.wood))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_" + logName + "_from_" + woodType.name + "_" + woodBlockName + "_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.naturalLogsTag), woodType.strippedLog, 1)
		.unlockedBy("has_log", has(woodType.naturalLogsTag))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_" + woodType.name + "_" + logName + "_from_natural_" + woodType.name + "_" + logName + "s_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.naturalLogsTag), woodType.strippedWood, 1)
		.unlockedBy("has_log", has(woodType.naturalLogsTag))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_" + woodType.name + "_" + woodBlockName + "_from_natural_" + woodType.name + "_" + logName + "s_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.strippedLog), woodType.strippedWood, 1)
		.unlockedBy("has_log", has(woodType.strippedLog))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_" + woodType.name + "_" + woodBlockName + "_from_stripped_" + woodType.name + "_" + logName + "_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.strippedWood), woodType.strippedLog, 1)
		.unlockedBy("has_log", has(woodType.strippedWood))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_" + woodType.name + "_" + logName + "_from_stripped_" + woodType.name + "_" + woodBlockName + "_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.strippedLogsTag), woodType.chiseledWood, 1)
		.unlockedBy("has_log", has(woodType.strippedLogsTag))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "chiseled_" + woodType.name + "_" + woodBlockName + "_from_stripped_" + woodType.name + "_" + logName + "s_chopping"));

		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.planks), woodType.woodStairs, 1)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_stairs_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.planks), woodType.woodSlab, 2)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_slabs_from_" + woodType.name + "_planks_chopping"));

		chopping(RecipeCategory.REDSTONE, Ingredient.of(woodType.planks), woodType.door, 1)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_door_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.REDSTONE, Ingredient.of(woodType.planks), woodType.trapdoor, 4)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_trapdoors_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.MISC, Ingredient.of(woodType.planks), woodType.sign, 4)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_signs_from_" + woodType.name + "_planks_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(woodType.planks), woodType.fence, 4)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_fences_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.REDSTONE, Ingredient.of(woodType.planks), woodType.fenceGate, 2)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_fence_gates_from_" + woodType.name + "_planks_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.planks), woodType.mosaic, 1)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_mosaic_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.planks), woodType.mosaicStairs, 1)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_mosaic_stairs_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.planks), woodType.mosaicSlab, 2)
		.unlockedBy("has_planks", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_mosaic_slabs_from_" + woodType.name + "_planks_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.mosaic), woodType.mosaicStairs, 1)
		.unlockedBy("has_planks", has(woodType.mosaic))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_mosaic_stairs_from_" + woodType.name + "_mosaic_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.mosaic), woodType.mosaicSlab, 2)
		.unlockedBy("has_planks", has(woodType.mosaic))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_mosaic_slabs_from_" + woodType.name + "_mosaic_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.mosaic), woodType.tiles, 1)
		.unlockedBy("has_planks", has(woodType.mosaic))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_tiles_from_" + woodType.name + "_mosaic_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.mosaic), woodType.tilesStairs, 1)
		.unlockedBy("has_planks", has(woodType.mosaic))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_tile_stairs_from_" + woodType.name + "_mosaic_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.mosaic), woodType.tilesSlab, 2)
		.unlockedBy("has_planks", has(woodType.mosaic))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_tile_slabs_from_" + woodType.name + "_mosaic_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.tiles), woodType.tilesStairs, 1)
		.unlockedBy("has_planks", has(woodType.tiles))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_tile_stairs_from_" + woodType.name + "_tiles_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.tiles), woodType.tilesSlab, 2)
		.unlockedBy("has_planks", has(woodType.tiles))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_tile_slabs_from_" + woodType.name + "_tiles_chopping"));
	}
	
	private void generateBambooChopping(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.BAMBOO_BLOCKS), Items.BAMBOO_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.BAMBOO_BLOCKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_planks_from_bamboo_blocks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.BAMBOO_BLOCKS), Items.BAMBOO_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.BAMBOO_BLOCKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_slabs_from_bamboo_blocks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.BAMBOO_BLOCKS), Items.BAMBOO_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.BAMBOO_BLOCKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_stairs_from_bamboo_blocks_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_BLOCK), Items.STRIPPED_BAMBOO_BLOCK, 1)
		.unlockedBy("has_log", has(Items.BAMBOO_BLOCK))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_bamboo_block_from_bamboo_block_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_BAMBOO_BLOCK), RevampedBlocks.CHISELED_BAMBOO_BLOCK, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_BAMBOO_BLOCK))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "chiseled_bamboo_block_from_stripped_bamboo_block_chopping"));

		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_STAIRS, 1)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_stairs_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_SLAB, 2)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_slabs_from_bamboo_planks_chopping"));
		
		chopping(RecipeCategory.REDSTONE, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_DOOR, 1)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_door_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.REDSTONE, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_TRAPDOOR, 4)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_trapdoors_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_SIGN, 4)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_signs_from_bamboo_planks_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_FENCE, 4)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_fences_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.REDSTONE, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_FENCE_GATE, 2)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_fence_gates_from_bamboo_planks_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_MOSAIC, 1)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_mosaic_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_MOSAIC_STAIRS, 1)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_mosaic_stairs_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_MOSAIC_SLAB, 2)
		.unlockedBy("has_planks", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_mosaic_slabs_from_bamboo_planks_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_MOSAIC), Items.BAMBOO_MOSAIC_STAIRS, 1)
		.unlockedBy("has_planks", has(Items.BAMBOO_MOSAIC))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_mosaic_stairs_from_bamboo_mosaic_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_MOSAIC), Items.BAMBOO_MOSAIC_SLAB, 2)
		.unlockedBy("has_planks", has(Items.BAMBOO_MOSAIC))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_mosaic_slabs_from_bamboo_mosaic_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_MOSAIC), RevampedBlocks.BAMBOO_TILES, 1)
		.unlockedBy("has_planks", has(Items.BAMBOO_MOSAIC))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_tiles_from_bamboo_mosaic_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_MOSAIC), RevampedBlocks.BAMBOO_TILE_STAIRS, 1)
		.unlockedBy("has_planks", has(Items.BAMBOO_MOSAIC))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_tile_stairs_from_bamboo_mosaic_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_MOSAIC), RevampedBlocks.BAMBOO_TILE_SLAB, 2)
		.unlockedBy("has_planks", has(Items.BAMBOO_MOSAIC))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_tile_slabs_from_bamboo_mosaic_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedBlocks.BAMBOO_TILES), RevampedBlocks.BAMBOO_TILE_STAIRS, 1)
		.unlockedBy("has_planks", has(RevampedBlocks.BAMBOO_TILES))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_tile_stairs_from_bamboo_tiles_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedBlocks.BAMBOO_TILES), RevampedBlocks.BAMBOO_TILE_SLAB, 2)
		.unlockedBy("has_planks", has(RevampedBlocks.BAMBOO_TILES))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_tile_slabs_from_bamboo_tiles_chopping"));
	}
	
	private void generateMosaicSetShaped(RecipeOutput recipeOutput, WoodTypeInfo woodType) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, woodType.mosaic)
		.pattern("S")
		.pattern("S")
		.define('S', woodType.woodSlab)
		.unlockedBy("has_slab", has(woodType.woodSlab))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_mosaic"));
		
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, woodType.mosaicStairs, 4)
		.pattern("B  ")
		.pattern("BB ")
		.pattern("BBB")
		.define('B', woodType.mosaic)
		.unlockedBy("has_block", has(woodType.mosaic))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_mosaic_stairs"));
		
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, woodType.mosaicSlab, 6)
		.pattern("BBB")
		.define('B', woodType.mosaic)
		.unlockedBy("has_block", has(woodType.mosaic))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_mosaic_slabs"));
	}
	private void generateTilesSetShaped(RecipeOutput recipeOutput, WoodTypeInfo woodType) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, woodType.tiles)
		.pattern("S")
		.pattern("S")
		.define('S', woodType.mosaicSlab)
		.unlockedBy("has_slab", has(woodType.mosaicSlab))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_tiles"));
		
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, woodType.tilesStairs, 4)
		.pattern("B  ")
		.pattern("BB ")
		.pattern("BBB")
		.define('B', woodType.tiles)
		.unlockedBy("has_block", has(woodType.tiles))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_tile_stairs"));
		
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, woodType.tilesSlab, 6)
		.pattern("BBB")
		.define('B', woodType.tiles)
		.unlockedBy("has_block", has(woodType.tiles))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_tile_slabs"));
	}
	private void generateTilesSetShapedBamboo(RecipeOutput recipeOutput) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RevampedBlocks.BAMBOO_TILES)
		.pattern("S")
		.pattern("S")
		.define('S', Items.BAMBOO_MOSAIC_SLAB)
		.unlockedBy("has_slab", has(Items.BAMBOO_MOSAIC_SLAB))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_tiles"));
		
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RevampedBlocks.BAMBOO_TILE_STAIRS, 4)
		.pattern("B  ")
		.pattern("BB ")
		.pattern("BBB")
		.define('B', RevampedBlocks.BAMBOO_TILES)
		.unlockedBy("has_block", has(RevampedBlocks.BAMBOO_TILES))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_tile_stairs"));
		
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RevampedBlocks.BAMBOO_TILE_SLAB, 6)
		.pattern("BBB")
		.define('B', RevampedBlocks.BAMBOO_TILES)
		.unlockedBy("has_block", has(RevampedBlocks.BAMBOO_TILES))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_tile_slabs"));
	}
	
	private void generateChiseledWoodShaped(RecipeOutput recipeOutput, WoodTypeInfo woodType)
	{
		generateChiseledShaped(recipeOutput, woodType, "wood");
	}
	
	private void generateChiseledNetherWoodShaped(RecipeOutput recipeOutput, WoodTypeInfo woodType)
	{
		generateChiseledShaped(recipeOutput, woodType, "hyphae");
	}
	
	private void generateChiseledShaped(RecipeOutput recipeOutput, WoodTypeInfo woodType, String woodBlockName)
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, woodType.chiseledWood, 4)
		.pattern("WM")
		.pattern("MW")
		.define('W', woodType.strippedLogsTag)
		.define('M', woodType.tiles)
		.unlockedBy("has_block", has(woodType.tiles))
		.unlockedBy("has_log", has(woodType.strippedLogsTag))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "chiseled_" + woodType.name + "_" + woodBlockName));
	}
	private void generateChiseledShapedBamboo(RecipeOutput recipeOutput)
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, RevampedBlocks.CHISELED_BAMBOO_BLOCK, 4)
		.pattern("WM")
		.pattern("MW")
		.define('W', Items.STRIPPED_BAMBOO_BLOCK)
		.define('M', RevampedBlocks.BAMBOO_TILES)
		.unlockedBy("has_block", has(RevampedBlocks.BAMBOO_TILES))
		.unlockedBy("has_log", has(Items.STRIPPED_BAMBOO_BLOCK))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "chiseled_bamboo_block"));
	}
	
	private record WoodTypeInfo(
		    String name, 
		    TagKey<Item> logsTag, 
		    TagKey<Item> naturalLogsTag,
		    TagKey<Item> strippedLogsTag,
		    Item log, 
		    Item wood, 
		    Item strippedLog, 
		    Item strippedWood, 
		    Item planks, 
		    Item woodSlab, 
		    Item woodStairs,
		    Item door,
		    Item trapdoor,
		    Item sign,
		    Item fence,
		    Item fenceGate,
		    Item chiseledWood,
		    Item mosaic,
		    Item mosaicStairs,
		    Item mosaicSlab,
		    Item tiles,
		    Item tilesStairs,
		    Item tilesSlab
	) { }
}
