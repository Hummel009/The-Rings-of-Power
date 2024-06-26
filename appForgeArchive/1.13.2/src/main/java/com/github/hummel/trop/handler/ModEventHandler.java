package com.github.hummel.trop.handler;

import com.github.hummel.trop.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

public class ModEventHandler {
	@SubscribeEvent
	@SuppressWarnings("MethodMayBeStatic")
	public void onItemRegistry(RegistryEvent.Register<Item> event) {
		Items.register();
	}

	@SubscribeEvent
	@SuppressWarnings("MethodMayBeStatic")
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
		for (RegistryEvent.MissingMappings.Mapping<Item> mapping : event.getAllMappings()) {
			for (Map.Entry<String, Item> entry : renamed.entrySet()) {
				if (mapping.key.getPath().contains(entry.getKey())) {
					mapping.remap(entry.getValue());
					break;
				}
			}
		}
	}
}