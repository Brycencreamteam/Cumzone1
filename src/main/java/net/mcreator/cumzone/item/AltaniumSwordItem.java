
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
public class AltaniumSwordItem extends CumzoneModElements.ModElement {
	@ObjectHolder("cumzone:altanium_sword")
	public static final Item block = null;

	public AltaniumSwordItem(CumzoneModElements instance) {
		super(instance, 95);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AltaniumIngotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("altanium_sword"));
	}
}
