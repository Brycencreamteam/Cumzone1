
package net.mcreator.cumzone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.cumzone.CumzoneModElements;

@CumzoneModElements.ModElement.Tag
public class StraightPrideAxeItem extends CumzoneModElements.ModElement {
	@ObjectHolder("cumzone:straight_pride_axe")
	public static final Item block = null;

	public StraightPrideAxeItem(CumzoneModElements instance) {
		super(instance, 253);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 99999;
			}

			public float getEfficiency() {
				return 50f;
			}

			public float getAttackDamage() {
				return 28f;
			}

			public int getHarvestLevel() {
				return 30;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Item10Item.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("straight_pride_axe"));
	}
}
