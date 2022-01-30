
package net.mcreator.cumzone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.cumzone.CumzoneModElements;

@CumzoneModElements.ModElement.Tag
public class StraightPrideSwordItem extends CumzoneModElements.ModElement {
	@ObjectHolder("cumzone:straight_pride_sword")
	public static final Item block = null;

	public StraightPrideSwordItem(CumzoneModElements instance) {
		super(instance, 254);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 99999;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 23f;
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
		}, 3, -1.5f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("straight_pride_sword"));
	}
}
