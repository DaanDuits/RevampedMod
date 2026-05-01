package net.daanbanaan.revamped.datagen;

import java.util.concurrent.CompletableFuture;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.daanbanaan.revamped.recipe.ChoppingRecipe;
import net.daanbanaan.revamped.tags.RevampedItemTags;
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
		
		generateWoodChopping(recipeOutput, new WoodTypeInfo("oak", ItemTags.OAK_LOGS, RevampedItemTags.NATURAL_OAK_LOGS, Items.OAK_LOG, 
				Items.OAK_WOOD, Items.STRIPPED_OAK_LOG, Items.STRIPPED_OAK_WOOD, Items.OAK_PLANKS, Items.OAK_SLAB, Items.OAK_STAIRS, 
				Items.OAK_DOOR, Items.OAK_TRAPDOOR, Items.OAK_SIGN, Items.OAK_FENCE, Items.OAK_FENCE_GATE));
		
		generateWoodChopping(recipeOutput, new WoodTypeInfo("birch", ItemTags.BIRCH_LOGS, RevampedItemTags.NATURAL_BIRCH_LOGS, Items.BIRCH_LOG, 
				Items.BIRCH_WOOD, Items.STRIPPED_BIRCH_LOG, Items.STRIPPED_BIRCH_WOOD, Items.BIRCH_PLANKS, Items.BIRCH_SLAB, Items.BIRCH_STAIRS, 
				Items.BIRCH_DOOR, Items.BIRCH_TRAPDOOR, Items.BIRCH_SIGN, Items.BIRCH_FENCE, Items.BIRCH_FENCE_GATE));
		
		generateWoodChopping(recipeOutput, new WoodTypeInfo("spruce", ItemTags.SPRUCE_LOGS, RevampedItemTags.NATURAL_SPRUCE_LOGS, Items.SPRUCE_LOG, 
				Items.SPRUCE_WOOD, Items.STRIPPED_SPRUCE_LOG, Items.STRIPPED_SPRUCE_WOOD, Items.SPRUCE_PLANKS, Items.SPRUCE_SLAB, Items.SPRUCE_STAIRS, 
				Items.SPRUCE_DOOR, Items.SPRUCE_TRAPDOOR, Items.SPRUCE_SIGN, Items.SPRUCE_FENCE, Items.SPRUCE_FENCE_GATE));
		
		generateWoodChopping(recipeOutput, new WoodTypeInfo("jungle", ItemTags.JUNGLE_LOGS, RevampedItemTags.NATURAL_JUNGLE_LOGS, Items.JUNGLE_LOG, 
				Items.JUNGLE_WOOD, Items.STRIPPED_JUNGLE_LOG, Items.STRIPPED_JUNGLE_WOOD, Items.JUNGLE_PLANKS, Items.JUNGLE_SLAB, Items.JUNGLE_STAIRS, 
				Items.JUNGLE_DOOR, Items.JUNGLE_TRAPDOOR, Items.JUNGLE_SIGN, Items.JUNGLE_FENCE, Items.JUNGLE_FENCE_GATE));
		
		generateWoodChopping(recipeOutput, new WoodTypeInfo("acacia", ItemTags.ACACIA_LOGS, RevampedItemTags.NATURAL_ACACIA_LOGS, Items.ACACIA_LOG, 
				Items.ACACIA_WOOD, Items.STRIPPED_ACACIA_LOG, Items.STRIPPED_ACACIA_WOOD, Items.ACACIA_PLANKS, Items.ACACIA_SLAB, Items.ACACIA_STAIRS, 
				Items.ACACIA_DOOR, Items.ACACIA_TRAPDOOR, Items.ACACIA_SIGN, Items.ACACIA_FENCE, Items.ACACIA_FENCE_GATE));
		
		generateWoodChopping(recipeOutput, new WoodTypeInfo("dark_oak", ItemTags.DARK_OAK_LOGS, RevampedItemTags.NATURAL_DARK_OAK_LOGS, Items.DARK_OAK_LOG, 
				Items.DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_WOOD, Items.DARK_OAK_PLANKS, Items.DARK_OAK_SLAB, Items.DARK_OAK_STAIRS, 
				Items.DARK_OAK_DOOR, Items.DARK_OAK_TRAPDOOR, Items.DARK_OAK_SIGN, Items.DARK_OAK_FENCE, Items.DARK_OAK_FENCE_GATE));
		
		generateWoodChopping(recipeOutput, new WoodTypeInfo("mangrove", ItemTags.MANGROVE_LOGS, RevampedItemTags.NATURAL_MANGROVE_LOGS, Items.MANGROVE_LOG, 
				Items.MANGROVE_WOOD, Items.STRIPPED_MANGROVE_LOG, Items.STRIPPED_MANGROVE_WOOD, Items.MANGROVE_PLANKS, Items.MANGROVE_SLAB, Items.MANGROVE_STAIRS, 
				Items.MANGROVE_DOOR, Items.MANGROVE_TRAPDOOR, Items.MANGROVE_SIGN, Items.MANGROVE_FENCE, Items.MANGROVE_FENCE_GATE));
		
		generateWoodChopping(recipeOutput, new WoodTypeInfo("cherry", ItemTags.CHERRY_LOGS, RevampedItemTags.NATURAL_CHERRY_LOGS, Items.CHERRY_LOG, 
				Items.CHERRY_WOOD, Items.STRIPPED_CHERRY_LOG, Items.STRIPPED_CHERRY_WOOD, Items.CHERRY_PLANKS, Items.CHERRY_SLAB, Items.CHERRY_STAIRS, 
				Items.CHERRY_DOOR, Items.CHERRY_TRAPDOOR, Items.CHERRY_SIGN, Items.CHERRY_FENCE, Items.CHERRY_FENCE_GATE));
		
		generateBambooChopping(recipeOutput);
		
		generateNetherWoodChopping(recipeOutput, new WoodTypeInfo("crimson", ItemTags.CRIMSON_STEMS, RevampedItemTags.NATURAL_CRIMSON_STEMS, Items.CRIMSON_STEM, 
				Items.CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_STEM, Items.STRIPPED_CRIMSON_HYPHAE, Items.CRIMSON_PLANKS, Items.CRIMSON_SLAB, Items.CRIMSON_STAIRS, 
				Items.CRIMSON_DOOR, Items.CRIMSON_TRAPDOOR, Items.CRIMSON_SIGN, Items.CRIMSON_FENCE, Items.CRIMSON_FENCE_GATE));
		
		generateNetherWoodChopping(recipeOutput, new WoodTypeInfo("warped", ItemTags.WARPED_STEMS, RevampedItemTags.NATURAL_WARPED_STEMS, Items.WARPED_STEM, 
				Items.WARPED_HYPHAE, Items.STRIPPED_WARPED_STEM, Items.STRIPPED_WARPED_HYPHAE, Items.WARPED_PLANKS, Items.WARPED_SLAB, Items.WARPED_STAIRS, 
				Items.WARPED_DOOR, Items.WARPED_TRAPDOOR, Items.WARPED_SIGN, Items.WARPED_FENCE, Items.WARPED_FENCE_GATE));
	}
	
	private static SingleItemRecipeBuilder chopping(RecipeCategory category, Ingredient ingredient, ItemLike output, int count) {
		return new SingleItemRecipeBuilder(category, ChoppingRecipe::new, ingredient, output, count);
	}
	
	private void generateWoodChopping(RecipeOutput recipeOutput, WoodTypeInfo woodType) {
		generateWoodChoppingRecipes(recipeOutput, woodType, "log", "wood");
	}
	
	private void generateNetherWoodChopping(RecipeOutput recipeOutput, WoodTypeInfo woodType) {
		generateWoodChoppingRecipes(recipeOutput, woodType, "stem", "hyphae");
	}
	
	private void generateWoodChoppingRecipes(RecipeOutput recipeOutput, WoodTypeInfo woodType, String logName, String woodBlockName) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.logsTag), woodType.planks, 6)
		.unlockedBy("has_log", has(woodType.logsTag))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_planks_from" + woodType.name + "_" + logName + "s_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.logsTag), woodType.slab, 8)
		.unlockedBy("has_log", has(woodType.logsTag))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_slabs_from_" + woodType.name + "_" + logName + "s_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.logsTag), woodType.stairs, 4)
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
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.planks), woodType.slab, 2)
		.unlockedBy("has_log", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_slabs_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(woodType.planks), woodType.stairs, 1)
		.unlockedBy("has_log", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_stairs_from_" + woodType.name + "_planks_chopping"));

		chopping(RecipeCategory.REDSTONE, Ingredient.of(woodType.planks), woodType.door, 1)
		.unlockedBy("has_log", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_door_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.REDSTONE, Ingredient.of(woodType.planks), woodType.trapdoor, 4)
		.unlockedBy("has_log", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_trapdoors_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.MISC, Ingredient.of(woodType.planks), woodType.sign, 4)
		.unlockedBy("has_log", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_signs_from_" + woodType.name + "_planks_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(woodType.planks), woodType.fence, 4)
		.unlockedBy("has_log", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_fences_from_" + woodType.name + "_planks_chopping"));
		chopping(RecipeCategory.REDSTONE, Ingredient.of(woodType.planks), woodType.fenceGate, 2)
		.unlockedBy("has_log", has(woodType.planks))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, woodType.name + "_fence_gates_from_" + woodType.name + "_planks_chopping"));
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
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_SLAB, 2)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_slabs_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_STAIRS, 1)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_stairs_from_bamboo_planks_chopping"));
		
		chopping(RecipeCategory.REDSTONE, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_DOOR, 1)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_door_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.REDSTONE, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_TRAPDOOR, 4)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_trapdoors_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_SIGN, 4)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_signs_from_bamboo_planks_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_FENCE, 4)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_fences_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.REDSTONE, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_FENCE_GATE, 2)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_fence_gates_from_bamboo_planks_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_MOSAIC, 1)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_mosaic_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_MOSAIC_STAIRS, 1)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_mosaic_stairs_from_bamboo_planks_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BAMBOO_PLANKS), Items.BAMBOO_MOSAIC_SLAB, 2)
		.unlockedBy("has_log", has(Items.BAMBOO_PLANKS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_mosaic_slabs_from_bamboo_planks_chopping"));
	}
	
	private record WoodTypeInfo(
		    String name, 
		    TagKey<Item> logsTag, 
		    TagKey<Item> naturalLogsTag,
		    Item log, 
		    Item wood, 
		    Item strippedLog, 
		    Item strippedWood, 
		    Item planks, 
		    Item slab, 
		    Item stairs,
		    Item door,
		    Item trapdoor,
		    Item sign,
		    Item fence,
		    Item fenceGate
	) { }
}
