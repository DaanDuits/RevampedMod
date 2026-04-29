package net.daanbanaan.revamped.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;

public record ChoppingRecipeInput(ItemStack input) implements RecipeInput{

	@Override
	public ItemStack getItem(int index) {
		return input;
	}

	@Override
	public int size() {
		return 1;
	}
	
}
