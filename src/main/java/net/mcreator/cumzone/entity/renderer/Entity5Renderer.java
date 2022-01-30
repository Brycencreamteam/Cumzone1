package net.mcreator.cumzone.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.cumzone.entity.Entity5Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Entity5Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Entity5Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbull(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("cumzone:textures/bull2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbull extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer leg4;

		public Modelbull() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 4.0F, -8.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(22, 0).addBox(4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 32).addBox(5.0F, -6.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 32).addBox(6.0F, -9.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 32).addBox(-7.0F, -9.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 32).addBox(-6.0F, -10.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 32).addBox(5.0F, -10.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(22, 0).addBox(-5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(8, 32).addBox(-6.0F, -6.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 5.0F, 2.0F);
			setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
			body.setTextureOffset(18, 4).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(24, 32).addBox(-2.0F, 4.0F, -10.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(16, 32).addBox(-1.0F, -2.0F, -10.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(4.0F, 12.0F, 7.0F);
			leg1.setTextureOffset(0, 16).addBox(-10.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(-4.0F, 12.0F, 7.0F);
			leg2.setTextureOffset(0, 16).addBox(6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(4.0F, 12.0F, -6.0F);
			leg3.setTextureOffset(0, 16).addBox(-10.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(-4.0F, 12.0F, -6.0F);
			leg4.setTextureOffset(0, 16).addBox(6.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			leg3.render(matrixStack, buffer, packedLight, packedOverlay);
			leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
