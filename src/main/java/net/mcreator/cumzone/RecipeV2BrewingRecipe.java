
package net.mcreator.cumzone;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.cumzone.item.Item8Item;
import net.mcreator.cumzone.item.Item89Item;

@CumzoneModElements.ModElement.Tag
public class RecipeV2BrewingRecipe extends CumzoneModElements.ModElement {
	public RecipeV2BrewingRecipe(CumzoneModElements instance) {
		super(instance, 211);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Item89Item.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.EGG;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(Item8Item.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
