package com.github.hummel.trop.handler;

import com.github.hummel.trop.init.Items;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.HashMap;
import java.util.Map;

public class ModEventHandler {
	@SubscribeEvent
	@SuppressWarnings("MethodMayBeStatic")
	public void onMissingMappings(RegistryEvent.MissingMappings<Item> event) {
		Map<String, RegistryObject<Item>> renamed = new HashMap<>();
		renamed.put("dvar", Items.RING_DWAR);
		renamed.put("saita", Items.RING_REN);
		renamed.put("uvata", Items.RING_UVATHA);
		renamed.put("nenia", Items.RING_NENYA);
		renamed.put("naria", Items.RING_NARYA);
		renamed.put("vilia", Items.RING_VILYA);
		renamed.put("morgomir", Items.RING_ADUNAPHEL);
		renamed.put("khommurat", Items.RING_HOARMURATH);
		for (var mapping : event.getAllMappings()) {
			for (var entry : renamed.entrySet()) {
				if (mapping.key.getPath().contains(entry.getKey())) {
					mapping.remap(entry.getValue().get());
					break;
				}
			}
		}
	}
}