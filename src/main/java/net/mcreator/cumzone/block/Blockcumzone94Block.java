
package net.mcreator.cumzone.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@CumzoneModElements.ModElement.Tag
public class Blockcumzone94Block extends CumzoneModElements.ModElement {

	@ObjectHolder("cumzone:blockcumzone_94")
	public static final Block block = null;

	public Blockcumzone94Block(CumzoneModElements instance) {
		super(instance, 344);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0).harvestLevel(3)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());

			setRegistryName("blockcumzone_94");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
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
