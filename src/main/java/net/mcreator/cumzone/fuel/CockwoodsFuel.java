
package net.mcreator.cumzone.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.cumzone.block.CockwoodPlanksBlock;

@Mod.EventBusSubscriber
public class CockwoodsFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == CockwoodPlanksBlock.block.asItem())
			event.setBurnTime(1100);
	}
}
