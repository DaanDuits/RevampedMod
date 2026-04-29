package net.daanbanaan.revamped.recipe;

import net.daanbanaan.revamped.Revamped;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RevampedRecipes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, Revamped.MOD_ID);
	public static final DeferredRegister<RecipeType<?>> TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, Revamped.MOD_ID);
	
	public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<?>> CHOPPING_SERIALIZER = 
		    SERIALIZERS.register("chopping", () -> new ChoppingRecipe.Serializer<>(ChoppingRecipe::new));
	public static final DeferredHolder<RecipeType<?>, RecipeType<ChoppingRecipe>> CHOPPING_TYPE = TYPES.register("chopping", () -> new RecipeType<ChoppingRecipe>() {
		@Override
		public String toString() {
			return "chopping";
		}
	});
	
	public static void register(IEventBus eventBus) {
		SERIALIZERS.register(eventBus);
		TYPES.register(eventBus);
	}
}
