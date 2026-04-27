package net.daanbanaan.revamped.datagen;

import java.util.concurrent.CompletableFuture;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.daanbanaan.revamped.recipe.ChoppingRecipe;
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

public class RevampedRecipeProvider extends RecipeProvider implements IConditionBuilder 
{

	public RevampedRecipeProvider(PackOutput output, CompletableFuture<Provider> registries) 
	{
		super(output, registries);
	}
	
	private static SingleItemRecipeBuilder chopping(RecipeCategory category, Ingredient ingredient, ItemLike output, int count)
	{
		return new SingleItemRecipeBuilder(category, ChoppingRecipe::new, ingredient, output, count);
	}

	/* OAK */
	private void buildChoppingRecipesOak(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.OAK_LOG), Items.OAK_WOOD, 1)
		.unlockedBy("has_log", has(Items.OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "oak_wood_from_oak_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.OAK_LOG), Items.OAK_PLANKS, 6)
		.unlockedBy("has_log", has(Items.OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "oak_planks_from_oak_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.OAK_LOG), Items.OAK_SLAB, 8)
		.unlockedBy("has_log", has(Items.OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "oak_slabs_from_oak_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.OAK_LOG), Items.OAK_STAIRS, 4)
		.unlockedBy("has_log", has(Items.OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "oak_stairs_from_oak_log_chopping"));
	}

	/* BIRCH */
	private void buildChoppingRecipesBirch(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BIRCH_LOG), Items.BIRCH_WOOD, 1)
		.unlockedBy("has_log", has(Items.BIRCH_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "birch_wood_from_birch_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BIRCH_LOG), Items.BIRCH_PLANKS, 6)
		.unlockedBy("has_log", has(Items.BIRCH_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "birch_planks_from_birch_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BIRCH_LOG), Items.BIRCH_SLAB, 8)
		.unlockedBy("has_log", has(Items.BIRCH_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "birch_slabs_from_birch_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BIRCH_LOG), Items.BIRCH_STAIRS, 4)
		.unlockedBy("has_log", has(Items.BIRCH_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "birch_stairs_from_birch_log_chopping"));
	}
	
	/* SPRUCE */
	private void buildChoppingRecipesSpruce(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.SPRUCE_LOG), Items.SPRUCE_WOOD, 1)
		.unlockedBy("has_log", has(Items.SPRUCE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "spruce_wood_from_spruce_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.SPRUCE_LOG), Items.SPRUCE_PLANKS, 6)
		.unlockedBy("has_log", has(Items.SPRUCE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "spruce_planks_from_spruce_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.SPRUCE_LOG), Items.SPRUCE_SLAB, 8)
		.unlockedBy("has_log", has(Items.SPRUCE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "spruce_slabs_from_spruce_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.SPRUCE_LOG), Items.SPRUCE_STAIRS, 4)
		.unlockedBy("has_log", has(Items.SPRUCE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "spruce_stairs_from_spruce_log_chopping"));
	}

	/* JUNGLE */
	private void buildChoppingRecipesJungle(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.JUNGLE_LOG), Items.JUNGLE_WOOD, 1)
		.unlockedBy("has_log", has(Items.JUNGLE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jungle_wood_from_jungle_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.JUNGLE_LOG), Items.JUNGLE_PLANKS, 6)
		.unlockedBy("has_log", has(Items.JUNGLE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jungle_planks_from_jungle_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.JUNGLE_LOG), Items.JUNGLE_SLAB, 8)
		.unlockedBy("has_log", has(Items.JUNGLE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jungle_slabs_from_jungle_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.JUNGLE_LOG), Items.JUNGLE_STAIRS, 4)
		.unlockedBy("has_log", has(Items.JUNGLE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jungle_stairs_from_jungle_log_chopping"));
	}

	/* ACACIA */
	private void buildChoppingRecipesAcacia(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.ACACIA_LOG), Items.ACACIA_WOOD, 1)
		.unlockedBy("has_log", has(Items.ACACIA_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "acacia_wood_from_acacia_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.ACACIA_LOG), Items.ACACIA_PLANKS, 6)
		.unlockedBy("has_log", has(Items.ACACIA_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "acacia_planks_from_acacia_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.ACACIA_LOG), Items.ACACIA_SLAB, 8)
		.unlockedBy("has_log", has(Items.ACACIA_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "acacia_slabs_from_acacia_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.ACACIA_LOG), Items.ACACIA_STAIRS, 4)
		.unlockedBy("has_log", has(Items.ACACIA_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "acacia_stairs_from_acacia_log_chopping"));
	}

	/* DARK_OAK */
	private void buildChoppingRecipesDarkOak(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.DARK_OAK_LOG), Items.DARK_OAK_WOOD, 1)
		.unlockedBy("has_log", has(Items.DARK_OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "dark_oak_wood_from_dark_oak_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.DARK_OAK_LOG), Items.DARK_OAK_PLANKS, 6)
		.unlockedBy("has_log", has(Items.DARK_OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "dark_oak_planks_from_dark_oak_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.DARK_OAK_LOG), Items.DARK_OAK_SLAB, 8)
		.unlockedBy("has_log", has(Items.DARK_OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "dark_oak_slabs_from_dark_oak_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.DARK_OAK_LOG), Items.DARK_OAK_STAIRS, 4)
		.unlockedBy("has_log", has(Items.DARK_OAK_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "dark_oak_stairs_from_dark_oak_log_chopping"));
	}

	/* MANGROVE */
	private void buildChoppingRecipesMangrove(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.MANGROVE_LOG), Items.MANGROVE_WOOD, 1)
		.unlockedBy("has_log", has(Items.MANGROVE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "mangrove_wood_from_mangrove_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.MANGROVE_LOG), Items.MANGROVE_PLANKS, 6)
		.unlockedBy("has_log", has(Items.MANGROVE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "mangrove_planks_from_mangrove_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.MANGROVE_LOG), Items.MANGROVE_SLAB, 8)
		.unlockedBy("has_log", has(Items.MANGROVE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "mangrove_slabs_from_mangrove_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.MANGROVE_LOG), Items.MANGROVE_STAIRS, 4)
		.unlockedBy("has_log", has(Items.MANGROVE_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "mangrove_stairs_from_mangrove_log_chopping"));
	}

	/* CHERRY */
	private void buildChoppingRecipesCherry(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.CHERRY_LOG), Items.CHERRY_WOOD, 1)
		.unlockedBy("has_log", has(Items.CHERRY_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "cherry_wood_from_cherry_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.CHERRY_LOG), Items.CHERRY_PLANKS, 6)
		.unlockedBy("has_log", has(Items.CHERRY_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "cherry_planks_from_cherry_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.CHERRY_LOG), Items.CHERRY_SLAB, 8)
		.unlockedBy("has_log", has(Items.CHERRY_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "cherry_slab_from_cherry_log_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.CHERRY_LOG), Items.CHERRY_STAIRS, 4)
		.unlockedBy("has_log", has(Items.CHERRY_LOG))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "cherry_stairs_from_cherry_log_chopping"));
	}

	/* BAMBOO */
	private void buildChoppingRecipesBamboo(RecipeOutput recipeOutput)
	{	
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BAMBOO_BLOCK), Items.BAMBOO_PLANKS, 6)
		.unlockedBy("has_log", has(Items.BAMBOO_BLOCK))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_planks_from_bamboo_block_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BAMBOO_BLOCK), Items.BAMBOO_SLAB, 8)
		.unlockedBy("has_log", has(Items.BAMBOO_BLOCK))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_slabs_from_bamboo_block_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.BAMBOO_BLOCK), Items.BAMBOO_STAIRS, 4)
		.unlockedBy("has_log", has(Items.BAMBOO_BLOCK))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "bamboo_stairs_from_bamboo_block_chopping"));
	}

	/* CRIMSON */
	private void buildChoppingRecipesCrimson(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.CRIMSON_STEM), Items.CRIMSON_HYPHAE, 1)
		.unlockedBy("has_log", has(Items.CRIMSON_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "crimson_hyphae_from_crimson_stem_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.CRIMSON_STEM), Items.CRIMSON_PLANKS, 6)
		.unlockedBy("has_log", has(Items.CRIMSON_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "crimson_planks_from_crimson_stem_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.CRIMSON_STEM), Items.CRIMSON_SLAB, 8)
		.unlockedBy("has_log", has(Items.CRIMSON_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "crimson_slabs_from_crimson_stem_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.CRIMSON_STEM), Items.CRIMSON_STAIRS, 4)
		.unlockedBy("has_log", has(Items.CRIMSON_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "crimson_stairs_from_crimson_stem_chopping"));
	}

	/* WARPED */
	private void buildChoppingRecipesWarped(RecipeOutput recipeOutput)
	{
		chopping(RecipeCategory.MISC, Ingredient.of(Items.WARPED_STEM), Items.WARPED_HYPHAE, 1)
		.unlockedBy("has_log", has(Items.WARPED_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "warped_hyphae_from_warped_stem_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.WARPED_STEM), Items.WARPED_PLANKS, 6)
		.unlockedBy("has_log", has(Items.WARPED_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "warped_planks_from_warped_stem_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.WARPED_STEM), Items.WARPED_SLAB, 8)
		.unlockedBy("has_log", has(Items.WARPED_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "warped_slabs_from_warped_stem_chopping"));
		
		chopping(RecipeCategory.MISC, Ingredient.of(Items.WARPED_STEM), Items.WARPED_STAIRS, 4)
		.unlockedBy("has_log", has(Items.WARPED_STEM))
		.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "warped_stairs_from_warped_stem_chopping"));
	}
	
	@Override
	protected void buildRecipes(RecipeOutput recipeOutput) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RevampedBlocks.CHOPPING_BLOCK.get())
		.pattern("LL").define('L', ItemTags.LOGS)
		.unlockedBy("has_log", has(ItemTags.LOGS))
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
}
