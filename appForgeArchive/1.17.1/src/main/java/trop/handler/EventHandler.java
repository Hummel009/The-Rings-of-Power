package trop.handler;

import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import trop.init.CreativeTabs;
import trop.init.Items;

import java.util.HashMap;
import java.util.Map;

public class EventHandler {
	@SubscribeEvent
	public void onItemRegistry(RegistryEvent.Register<Item> event) {
		CreativeTabs.register();
		Items.register();
	}

	@SubscribeEvent
	public void onMissingMappings(RegistryEvent.MissingMappings<Item> event) {
		Map<String, Item> renamed = new HashMap<>();
		renamed.put("dvar", Items.ringDwar);
		renamed.put("saita", Items.ringRen);
		renamed.put("uvata", Items.ringUvatha);
		renamed.put("nenia", Items.ringNenya);
		renamed.put("naria", Items.ringNarya);
		renamed.put("vilia", Items.ringVilya);
		renamed.put("morgomir", Items.ringAdunaphel);
		renamed.put("khommurat", Items.ringHoarmurath);
		for (var mapping : event.getAllMappings()) {
			for (var entry : renamed.entrySet()) {
				if (mapping.key.getPath().contains(entry.getKey())) {
					mapping.remap(entry.getValue());
					break;
				}
			}
		}
	}
}