package trop.handler;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;
import trop.init.Items;

import java.util.HashMap;
import java.util.Map;

public class ForgeEventHandler {
	@SubscribeEvent
	public void onMissingMappings(MissingMappingsEvent event) {
		Map<String, Item> renamed = new HashMap<>();
		renamed.put("dvar", Items.ringDwar);
		renamed.put("saita", Items.ringRen);
		renamed.put("uvata", Items.ringUvatha);
		renamed.put("nenia", Items.ringNenya);
		renamed.put("naria", Items.ringNarya);
		renamed.put("vilia", Items.ringVilya);
		renamed.put("morgomir", Items.ringAdunaphel);
		renamed.put("khommurat", Items.ringHoarmurath);
		for (var mapping : event.getAllMappings(ForgeRegistries.Keys.ITEMS)) {
			for (var entry : renamed.entrySet()) {
				if (mapping.getKey().getPath().contains(entry.getKey())) {
					mapping.remap(entry.getValue());
					break;
				}
			}
		}
	}
}