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
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
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
		
		buildChoppingRecipesOak(recipeOutput);
		
		buildChoppingRecipesBirch(recipeOutput);
		
		buildChoppingRecipesSpruce(recipeOutput);
		
		buildChoppingRecipesJungle(recipeOutput);
		
		buildChoppingRecipesAcacia(recipeOutput);
		
		buildChoppingRecipesDarkOak(recipeOutput);
		
		buildChoppingRecipesMangrove(recipeOutput);
		
		buildChoppingRecipesCherry(recipeOutput);
		
		buildChoppingRecipesBamboo(recipeOutput);
		
		buildChoppingRecipesCrimson(recipeOutput);
		
		buildChoppingRecipesWarped(recipeOutput);
	}
	
	private static SingleItemRecipeBuilder chopping(RecipeCategory category, Ingredient ingredient, ItemLike output, int count) {
		return new SingleItemRecipeBuilder(category, ChoppingRecipe::new, ingredient, output, count);
	}

	/* OAK */
	private void buildChoppingRecipesOak(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.OAK_LOGS), Items.OAK_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "oak_planks_from_oak_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.OAK_LOGS), Items.OAK_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "oak_slabs_from_oak_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.OAK_LOGS), Items.OAK_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "oak_stairs_from_oak_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.OAK_LOG), Items.OAK_WOOD, 1)
		.unlockedBy("has_log", has(Items.OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "oak_wood_from_oak_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.OAK_WOOD), Items.OAK_LOG, 1)
		.unlockedBy("has_log", has(Items.OAK_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "oak_log_from_oak_wood_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_OAK_LOGS), Items.STRIPPED_OAK_LOG, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_oak_log_from_natural_oak_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_OAK_LOGS), Items.STRIPPED_OAK_WOOD, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_oak_wood_from_natural_oak_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_OAK_LOG), Items.STRIPPED_OAK_WOOD, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_oak_wood_from_stripped_oak_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_OAK_WOOD), Items.STRIPPED_OAK_LOG, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_OAK_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_oak_log_from_stripped_oak_wood_chopping"));
	}

	/* BIRCH */
	private void buildChoppingRecipesBirch(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.BIRCH_LOGS), Items.BIRCH_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.BIRCH_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "birch_planks_from_birch_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.BIRCH_LOGS), Items.BIRCH_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.BIRCH_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "birch_slabs_from_birch_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.BIRCH_LOGS), Items.BIRCH_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.BIRCH_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "birch_stairs_from_birch_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BIRCH_LOG), Items.BIRCH_WOOD, 1)
		.unlockedBy("has_log", has(Items.BIRCH_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "birch_wood_from_birch_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.BIRCH_WOOD), Items.BIRCH_LOG, 1)
		.unlockedBy("has_log", has(Items.BIRCH_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "birch_log_from_birch_wood_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_BIRCH_LOGS), Items.STRIPPED_BIRCH_LOG, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_BIRCH_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_birch_log_from_natural_birch_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_BIRCH_LOGS), Items.STRIPPED_BIRCH_WOOD, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_BIRCH_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_birch_wood_from_natural_birch_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_BIRCH_LOG), Items.STRIPPED_BIRCH_WOOD, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_BIRCH_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_birch_wood_from_stripped_birch_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_BIRCH_WOOD), Items.STRIPPED_BIRCH_LOG, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_BIRCH_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_birch_log_from_stripped_birch_wood_chopping"));
	}
	
	/* SPRUCE */
	private void buildChoppingRecipesSpruce(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.SPRUCE_LOGS), Items.SPRUCE_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.SPRUCE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "spruce_planks_from_spruce_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.SPRUCE_LOGS), Items.SPRUCE_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.SPRUCE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "spruce_slabs_from_spruce_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.SPRUCE_LOGS), Items.SPRUCE_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.SPRUCE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "spruce_stairs_from_spruce_logs_chopping"));

		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.SPRUCE_LOG), Items.SPRUCE_WOOD, 1)
		.unlockedBy("has_log", has(Items.SPRUCE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "spruce_wood_from_spruce_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.SPRUCE_WOOD), Items.SPRUCE_LOG, 1)
		.unlockedBy("has_log", has(Items.SPRUCE_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "spruce_log_from_spruce_wood_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_SPRUCE_LOGS), Items.STRIPPED_SPRUCE_LOG, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_SPRUCE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_spruce_log_from_natural_spruce_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_SPRUCE_LOGS), Items.STRIPPED_SPRUCE_WOOD, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_SPRUCE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_spruce_wood_from_natural_spruce_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_SPRUCE_LOG), Items.STRIPPED_SPRUCE_WOOD, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_SPRUCE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_spruce_wood_from_stripped_spruce_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_SPRUCE_WOOD), Items.STRIPPED_SPRUCE_LOG, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_SPRUCE_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_spruce_log_from_stripped_spruce_wood_chopping"));
	}

	/* JUNGLE */
	private void buildChoppingRecipesJungle(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.JUNGLE_LOGS), Items.JUNGLE_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.JUNGLE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jungle_planks_from_jungle_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.JUNGLE_LOGS), Items.JUNGLE_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.JUNGLE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jungle_slabs_from_jungle_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.JUNGLE_LOGS), Items.JUNGLE_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.JUNGLE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jungle_stairs_from_jungle_logs_chopping"));

		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.JUNGLE_LOG), Items.JUNGLE_WOOD, 1)
		.unlockedBy("has_log", has(Items.JUNGLE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jungle_wood_from_jungle_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.JUNGLE_WOOD), Items.JUNGLE_LOG, 1)
		.unlockedBy("has_log", has(Items.JUNGLE_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jungle_log_from_jungle_wood_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_JUNGLE_LOGS), Items.STRIPPED_JUNGLE_LOG, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_JUNGLE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_jungle_log_from_natural_jungle_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_JUNGLE_LOGS), Items.STRIPPED_JUNGLE_WOOD, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_JUNGLE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_jungle_wood_from_natural_jungle_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_JUNGLE_LOG), Items.STRIPPED_JUNGLE_WOOD, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_JUNGLE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_jungle_wood_from_stripped_jungle_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_JUNGLE_WOOD), Items.STRIPPED_JUNGLE_LOG, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_JUNGLE_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_jungle_log_from_stripped_jungle_wood_chopping"));
	}

	/* ACACIA */
	private void buildChoppingRecipesAcacia(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.ACACIA_LOGS), Items.ACACIA_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.ACACIA_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "acacia_planks_from_acacia_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.ACACIA_LOGS), Items.ACACIA_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.ACACIA_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "acacia_slabs_from_acacia_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.ACACIA_LOGS), Items.ACACIA_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.ACACIA_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "acacia_stairs_from_acacia_logs_chopping"));

		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.ACACIA_LOG), Items.ACACIA_WOOD, 1)
		.unlockedBy("has_log", has(Items.ACACIA_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "acacia_wood_from_acacia_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.ACACIA_WOOD), Items.ACACIA_LOG, 1)
		.unlockedBy("has_log", has(Items.ACACIA_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "acacia_log_from_acacia_wood_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_ACACIA_LOGS), Items.STRIPPED_ACACIA_LOG, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_ACACIA_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_acacia_log_from_natural_acacia_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_ACACIA_LOGS), Items.STRIPPED_ACACIA_WOOD, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_ACACIA_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_acacia_wood_from_natural_acacia_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_ACACIA_LOG), Items.STRIPPED_ACACIA_WOOD, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_ACACIA_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_acacia_wood_from_stripped_acacia_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_ACACIA_WOOD), Items.STRIPPED_ACACIA_LOG, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_ACACIA_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_acacia_log_from_stripped_acacia_wood_chopping"));
	}

	/* DARK_OAK */
	private void buildChoppingRecipesDarkOak(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.DARK_OAK_LOGS), Items.DARK_OAK_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.DARK_OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "dark_oak_planks_from_dark_oak_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.DARK_OAK_LOGS), Items.DARK_OAK_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.DARK_OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "dark_oak_slabs_from_dark_oak_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.DARK_OAK_LOGS), Items.DARK_OAK_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.DARK_OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "dark_oak_stairs_from_dark_oak_logs_chopping"));

		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.DARK_OAK_LOG), Items.DARK_OAK_WOOD, 1)
		.unlockedBy("has_log", has(Items.DARK_OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "dark_oak_wood_from_dark_oak_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.DARK_OAK_WOOD), Items.DARK_OAK_LOG, 1)
		.unlockedBy("has_log", has(Items.DARK_OAK_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "dark_oak_log_from_dark_oak_wood_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_DARK_OAK_LOGS), Items.STRIPPED_DARK_OAK_LOG, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_DARK_OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_dark_oak_log_from_natural_dark_oak_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_DARK_OAK_LOGS), Items.STRIPPED_DARK_OAK_WOOD, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_DARK_OAK_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_dark_oak_wood_from_natural_dark_oak_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_DARK_OAK_LOG), Items.STRIPPED_DARK_OAK_WOOD, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_DARK_OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_dark_oak_wood_from_stripped_dark_oak_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_DARK_OAK_WOOD), Items.STRIPPED_DARK_OAK_LOG, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_DARK_OAK_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_dark_dark_oak_log_from_stripped_dark_oak_wood_chopping"));
	}

	/* MANGROVE */
	private void buildChoppingRecipesMangrove(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.MANGROVE_LOGS), Items.MANGROVE_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.MANGROVE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "mangrove_planks_from_mangrove_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.MANGROVE_LOGS), Items.MANGROVE_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.MANGROVE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "mangrove_slabs_from_mangrove_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.MANGROVE_LOGS), Items.MANGROVE_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.MANGROVE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "mangrove_stairs_from_mangrove_logs_chopping"));

		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.MANGROVE_LOG), Items.MANGROVE_WOOD, 1)
		.unlockedBy("has_log", has(Items.MANGROVE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "mangrove_wood_from_mangrove_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.MANGROVE_WOOD), Items.MANGROVE_LOG, 1)
		.unlockedBy("has_log", has(Items.MANGROVE_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "mangrove_log_from_mangrove_wood_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_MANGROVE_LOGS), Items.STRIPPED_MANGROVE_LOG, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_MANGROVE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_mangrove_log_from_natural_mangrove_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_MANGROVE_LOGS), Items.STRIPPED_MANGROVE_WOOD, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_MANGROVE_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_mangrove_wood_from_natural_mangrove_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_MANGROVE_LOG), Items.STRIPPED_MANGROVE_WOOD, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_MANGROVE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_mangrove_wood_from_stripped_mangrove_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_MANGROVE_WOOD), Items.STRIPPED_MANGROVE_LOG, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_MANGROVE_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_mangrove_log_from_stripped_mangrove_wood_chopping"));
	}

	/* CHERRY */
	private void buildChoppingRecipesCherry(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.CHERRY_LOGS), Items.CHERRY_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.CHERRY_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "cherry_planks_from_cherry_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.CHERRY_LOGS), Items.CHERRY_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.CHERRY_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "cherry_slabs_from_cherry_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.CHERRY_LOGS), Items.CHERRY_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.CHERRY_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "cherry_stairs_from_cherry_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.CHERRY_LOG), Items.CHERRY_WOOD, 1)
		.unlockedBy("has_log", has(Items.CHERRY_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "cherry_wood_from_cherry_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.CHERRY_WOOD), Items.CHERRY_LOG, 1)
		.unlockedBy("has_log", has(Items.CHERRY_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "cherry_log_from_cherry_wood_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_CHERRY_LOGS), Items.STRIPPED_CHERRY_LOG, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_CHERRY_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_cherry_log_from_natural_cherry_logs_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_CHERRY_LOGS), Items.STRIPPED_CHERRY_WOOD, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_CHERRY_LOGS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_cherry_wood_from_natural_cherry_logs_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_CHERRY_LOG), Items.STRIPPED_CHERRY_WOOD, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_CHERRY_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_cherry_wood_from_stripped_cherry_log_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_CHERRY_WOOD), Items.STRIPPED_CHERRY_LOG, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_CHERRY_WOOD))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_cherry_log_from_stripped_cherry_wood_chopping"));
	}

	/* BAMBOO */
	private void buildChoppingRecipesBamboo(RecipeOutput recipeOutput) {	
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
	}

	/* CRIMSON */
	private void buildChoppingRecipesCrimson(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.CRIMSON_STEMS), Items.CRIMSON_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.CRIMSON_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "crimson_planks_from_crimson_stems_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.CRIMSON_STEMS), Items.CRIMSON_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.CRIMSON_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "crimson_slabs_from_crimson_stems_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.CRIMSON_STEMS), Items.CRIMSON_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.CRIMSON_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "crimson_stairs_from_crimson_stems_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.CRIMSON_STEM), Items.CRIMSON_HYPHAE, 1)
		.unlockedBy("has_log", has(Items.CRIMSON_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "crimson_hyphae_from_crimson_stem_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.CRIMSON_HYPHAE), Items.CRIMSON_STEM, 1)
		.unlockedBy("has_log", has(Items.CRIMSON_HYPHAE))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "crimson_stem_from_crimson_hyphae_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_CRIMSON_STEMS), Items.STRIPPED_CRIMSON_STEM, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_CRIMSON_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_crimson_stem_from_natural_crimson_stems_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_CRIMSON_STEMS), Items.STRIPPED_CRIMSON_HYPHAE, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_CRIMSON_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_crimson_hyphae_from_natural_crimson_stems_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_CRIMSON_STEM), Items.STRIPPED_CRIMSON_HYPHAE, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_CRIMSON_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_crimson_hyphae_from_stripped_crimson_stem_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_CRIMSON_HYPHAE), Items.STRIPPED_CRIMSON_STEM, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_CRIMSON_HYPHAE))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_crimson_stem_from_stripped_crimson_hyphae_chopping"));
	}

	/* WARPED */
	private void buildChoppingRecipesWarped(RecipeOutput recipeOutput) {
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.WARPED_STEMS), Items.WARPED_PLANKS, 6)
		.unlockedBy("has_log", has(ItemTags.WARPED_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "warped_planks_from_warped_stems_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.WARPED_STEMS), Items.WARPED_SLAB, 8)
		.unlockedBy("has_log", has(ItemTags.WARPED_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "warped_slabs_from_warped_stems_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(ItemTags.WARPED_STEMS), Items.WARPED_STAIRS, 4)
		.unlockedBy("has_log", has(ItemTags.WARPED_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "warped_stairs_from_warped_stems_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.WARPED_STEM), Items.WARPED_HYPHAE, 1)
		.unlockedBy("has_log", has(Items.WARPED_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "warped_hyphae_from_warped_stem_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.WARPED_HYPHAE), Items.WARPED_STEM, 1)
		.unlockedBy("has_log", has(Items.WARPED_HYPHAE))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "warped_stem_from_warped_hyphae_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_WARPED_STEMS), Items.STRIPPED_WARPED_STEM, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_WARPED_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_warped_stem_from_natural_warped_stems_chopping"));
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(RevampedItemTags.NATURAL_WARPED_STEMS), Items.STRIPPED_WARPED_HYPHAE, 1)
		.unlockedBy("has_log", has(RevampedItemTags.NATURAL_WARPED_STEMS))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_warped_hyphae_from_natural_warped_stems_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_WARPED_STEM), Items.STRIPPED_WARPED_HYPHAE, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_WARPED_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_warped_hyphae_from_stripped_warped_stem_chopping"));
		
		chopping(RecipeCategory.BUILDING_BLOCKS, Ingredient.of(Items.STRIPPED_WARPED_HYPHAE), Items.STRIPPED_WARPED_STEM, 1)
		.unlockedBy("has_log", has(Items.STRIPPED_WARPED_HYPHAE))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "stripped_warped_stem_from_stripped_warped_hyphae_chopping"));
	}
}
