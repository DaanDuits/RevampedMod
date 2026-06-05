package net.daanbanaan.revamped.compat;

import java.util.List;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.recipe.ChoppingRecipe;
import net.daanbanaan.revamped.recipe.RevampedRecipes;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;

@JeiPlugin
public class JEIRevampedPlugin implements IModPlugin {

	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "jei_plugin");
	}
	
	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ChoppingRecipeCategory(
				registration.getJeiHelpers().getGuiHelper()));
	}
	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
		
		List<RecipeHolder<ChoppingRecipe>> choppingRecipes = recipeManager
				.getAllRecipesFor(RevampedRecipes.CHOPPING_TYPE.get());
		registration.addRecipes(ChoppingRecipeCategory.CHOPPING_RECIPE_RECIPE_TYPE, choppingRecipes);
	}

}
