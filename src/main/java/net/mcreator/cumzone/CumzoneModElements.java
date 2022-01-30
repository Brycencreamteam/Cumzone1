/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.cumzone;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class CumzoneModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public CumzoneModElements() {
		sounds.put(new ResourceLocation("cumzone", "piano1"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "piano1")));
		sounds.put(new ResourceLocation("cumzone", "jizzardhurt1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "jizzardhurt1")));
		sounds.put(new ResourceLocation("cumzone", "jizzarddeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "jizzarddeath")));
		sounds.put(new ResourceLocation("cumzone", "jizzardambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "jizzardambient")));
		sounds.put(new ResourceLocation("cumzone", "reneehurt1"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "reneehurt1")));
		sounds.put(new ResourceLocation("cumzone", "reneeambient1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "reneeambient1")));
		sounds.put(new ResourceLocation("cumzone", "reneedeath1"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "reneedeath1")));
		sounds.put(new ResourceLocation("cumzone", "kyrahurt1"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "kyrahurt1")));
		sounds.put(new ResourceLocation("cumzone", "kyraambient1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "kyraambient1")));
		sounds.put(new ResourceLocation("cumzone", "kyradeath1"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "kyradeath1")));
		sounds.put(new ResourceLocation("cumzone", "kittenhurt"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "kittenhurt")));
		sounds.put(new ResourceLocation("cumzone", "kittendeath"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "kittendeath")));
		sounds.put(new ResourceLocation("cumzone", "kittenambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "kittenambient")));
		sounds.put(new ResourceLocation("cumzone", "bullambient"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "bullambient")));
		sounds.put(new ResourceLocation("cumzone", "bulldeath"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "bulldeath")));
		sounds.put(new ResourceLocation("cumzone", "bullhurt"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "bullhurt")));
		sounds.put(new ResourceLocation("cumzone", "sugmahurt"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "sugmahurt")));
		sounds.put(new ResourceLocation("cumzone", "sugmaambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "sugmaambient")));
		sounds.put(new ResourceLocation("cumzone", "sugmadeath"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "sugmadeath")));
		sounds.put(new ResourceLocation("cumzone", "bigballs1"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "bigballs1")));
		sounds.put(new ResourceLocation("cumzone", "blackairforces1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "blackairforces1")));
		sounds.put(new ResourceLocation("cumzone", "aidsmusic1"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "aidsmusic1")));
		sounds.put(new ResourceLocation("cumzone", "untoldstory"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "untoldstory")));
		sounds.put(new ResourceLocation("cumzone", "kiannadeath"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "kiannadeath")));
		sounds.put(new ResourceLocation("cumzone", "kiannahurt"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "kiannahurt")));
		sounds.put(new ResourceLocation("cumzone", "kiannaambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "kiannaambient")));
		sounds.put(new ResourceLocation("cumzone", "retradambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "retradambient")));
		sounds.put(new ResourceLocation("cumzone", "retraddeath"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "retraddeath")));
		sounds.put(new ResourceLocation("cumzone", "retradhurt"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "retradhurt")));
		sounds.put(new ResourceLocation("cumzone", "jeromeambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "jeromeambient")));
		sounds.put(new ResourceLocation("cumzone", "jeromedeath"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "jeromedeath")));
		sounds.put(new ResourceLocation("cumzone", "jeromehurt"), new net.minecraft.util.SoundEvent(new ResourceLocation("cumzone", "jeromehurt")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("cumzone").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == CumzoneModElements.ModElement.class)
						elements.add((CumzoneModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(CumzoneModElements.ModElement::initElements);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		CumzoneMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final CumzoneModElements elements;
		protected final int sortid;

		public ModElement(CumzoneModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
