package net.daanbanaan.revamped.compat;

import com.mojang.serialization.Codec;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.widgets.IRecipeExtrasBuilder;
import mezz.jei.api.helpers.ICodecHelper;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.IRecipeManager;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.AbstractRecipeCategory;
import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.block.RevampedBlocks;
import net.daanbanaan.revamped.recipe.ChoppingRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;

public class ChoppingRecipeCategory extends AbstractRecipeCategory<RecipeHolder<ChoppingRecipe>> {
	public static final int width = 82;
	public static final int height = 34;

	public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "chopping");
	public static final RecipeType<RecipeHolder<ChoppingRecipe>> CHOPPING_RECIPE_RECIPE_TYPE = RecipeType.createRecipeHolderType(UID);

	public ChoppingRecipeCategory(IGuiHelper guiHelper) {
		super(
			CHOPPING_RECIPE_RECIPE_TYPE,
			Component.translatable("block.revamped.chopping_block"),
			guiHelper.createDrawableItemLike(RevampedBlocks.CHOPPING_BLOCK.get()),
			82,
			34
		);
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, RecipeHolder<ChoppingRecipe> recipeHolder, IFocusGroup focuses) {
		ChoppingRecipe recipe = recipeHolder.value();

		builder.addInputSlot(1, 9)
			.setStandardSlotBackground()
			.addIngredients(recipe.getIngredients().getFirst());

		RegistryAccess registryAccess = Minecraft.getInstance().level.registryAccess();
		builder.addOutputSlot(61,  9)
			.setOutputSlotBackground()
			.addItemStack(recipe.getResultItem(registryAccess));
	}

	@Override
	public void createRecipeExtras(IRecipeExtrasBuilder builder, RecipeHolder<ChoppingRecipe> recipe, IFocusGroup focuses) {
		builder.addRecipeArrow().setPosition(26, 9);
	}

	@Override
	public boolean isHandled(RecipeHolder<ChoppingRecipe> recipeHolder) {
		ChoppingRecipe recipe = recipeHolder.value();
		return !recipe.isSpecial();
	}

	@Override
	public ResourceLocation getRegistryName(RecipeHolder<ChoppingRecipe> recipe) {
		return recipe.id();
	}

	@Override
	public Codec<RecipeHolder<ChoppingRecipe>> getCodec(ICodecHelper codecHelper, IRecipeManager recipeManager) {
		return codecHelper.getRecipeHolderCodec();
	}
}
