
package net.mcreator.cumzone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.cumzone.CumzoneModElements;

@CumzoneModElements.ModElement.Tag
public class StraightPrideHoeItem extends CumzoneModElements.ModElement {
	@ObjectHolder("cumzone:straight_pride_hoe")
	public static final Item block = null;

	public StraightPrideHoeItem(CumzoneModElements instance) {
		super(instance, 256);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 99999;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Item10Item.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("straight_pride_hoe"));
	}
}
