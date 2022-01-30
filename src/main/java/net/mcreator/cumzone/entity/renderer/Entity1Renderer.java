package net.mcreator.cumzone.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.cumzone.entity.Entity1Entity;

@OnlyIn(Dist.CLIENT)
public class Entity1Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Entity1Entity.entity,
					renderManager -> new MobRenderer(renderManager, new VillagerModel(0), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("cumzone:textures/imported_piskel_-_2021-12-21t025739.270.png");
						}
					});
		}
	}
}
