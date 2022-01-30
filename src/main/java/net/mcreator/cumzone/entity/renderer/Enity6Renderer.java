package net.mcreator.cumzone.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.ChickenModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.cumzone.entity.Enity6Entity;

@OnlyIn(Dist.CLIENT)
public class Enity6Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Enity6Entity.entity,
					renderManager -> new MobRenderer(renderManager, new ChickenModel(), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("cumzone:textures/imported_piskel_-_2021-12-24t235504.913.png");
						}
					});
		}
	}
}
