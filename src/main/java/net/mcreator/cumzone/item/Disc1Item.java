
package net.mcreator.cumzone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.cumzone.CumzoneModElements;

@CumzoneModElements.ModElement.Tag
public class Disc1Item extends CumzoneModElements.ModElement {
	@ObjectHolder("cumzone:disc_1")
	public static final Item block = null;

	public Disc1Item(CumzoneModElements instance) {
		super(instance, 337);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, CumzoneModElements.sounds.get(new ResourceLocation("cumzone:untoldstory")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("disc_1");
		}
	}
}
