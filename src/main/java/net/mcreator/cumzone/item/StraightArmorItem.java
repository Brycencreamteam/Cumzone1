
package net.mcreator.cumzone.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.cumzone.CumzoneModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@CumzoneModElements.ModElement.Tag
public class StraightArmorItem extends CumzoneModElements.ModElement {
	@ObjectHolder("cumzone:straight_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("cumzone:straight_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("cumzone:straight_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("cumzone:straight_armor_boots")
	public static final Item boots = null;

	public StraightArmorItem(CumzoneModElements instance) {
		super(instance, 245);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{1000, 1000, 1000, 1000}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 90;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Item10Item.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "straight_armor";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		};
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
					@Override
					@OnlyIn(Dist.CLIENT)
					public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
						BipedModel armorModel = new BipedModel(1);
						armorModel.bipedHead = new Modelcz_straighthelm().Head;
						armorModel.isSneak = living.isSneaking();
						armorModel.isSitting = defaultModel.isSitting;
						armorModel.isChild = living.isChild();
						return armorModel;
					}

					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "cumzone:textures/cz_straighthelm1.png";
					}
				}.setRegistryName("straight_armor_helmet"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "cumzone:textures/models/armor/jerk__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("straight_armor_chestplate"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "cumzone:textures/models/armor/jerk__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("straight_armor_leggings"));
		elements.items
				.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
					@Override
					public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
						return "cumzone:textures/models/armor/jerk__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
					}
				}.setRegistryName("straight_armor_boots"));
	}

	// Made with Blockbench 4.1.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcz_straighthelm extends EntityModel<Entity> {
		private final ModelRenderer Head;

		public Modelcz_straighthelm() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(4.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(1.0F, -8.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-6.0F, -10.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(5.0F, -10.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(6.0F, -9.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-7.0F, -9.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-8.0F, -14.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-7.0F, -16.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(6.0F, -14.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-6.0F, -18.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(5.0F, -18.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(6.0F, -16.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
