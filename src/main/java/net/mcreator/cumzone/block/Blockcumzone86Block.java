
package net.mcreator.cumzone.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.cumzone.CumzoneModElements;

import java.util.List;
import java.util.Collections;

@CumzoneModElements.ModElement.Tag
public class Blockcumzone86Block extends CumzoneModElements.ModElement {
	@ObjectHolder("cumzone:blockcumzone_86")
	public static final Block block = null;

	public Blockcumzone86Block(CumzoneModElements instance) {
		super(instance, 278);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.9999999999999998f, 10f)
					.setLightLevel(s -> 0).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()).getDefaultState(),
					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.9999999999999998f, 10f)
							.setLightLevel(s -> 0).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("blockcumzone_86");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
