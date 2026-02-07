package net.mcreator.syndred.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class SyndredModBrewingRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("syndred:brewing_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiBrewingRecipe> brewingRecipes = new ArrayList<>();
		ItemStack potion = new ItemStack(Items.POTION);
		ItemStack potion2 = new ItemStack(Items.POTION);
		List<ItemStack> ingredientStack = new ArrayList<>();
		List<ItemStack> inputStack = new ArrayList<>();
		registration.addRecipes(RecipeTypes.BREWING, brewingRecipes);
	}
}