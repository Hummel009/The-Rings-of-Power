package com.github.hummel.trop.handler;

import com.github.hummel.trop.init.Items;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

public class ForgeEventHandler {
	@SubscribeEvent
	public void onMissingMappings(MissingMappingsEvent event) {
		Map<String, RegistryObject<Item>> renamed = new HashMap<>();
		renamed.put("dvar", Items.RING_DWAR);
		renamed.put("saita", Items.RING_REN);
		renamed.put("uvata", Items.RING_UVATHA);
		renamed.put("nenia", Items.RING_NENYA);
		renamed.put("naria", Items.RING_NARYA);
		renamed.put("vilia", Items.RING_VILYA);
		renamed.put("morgomir", Items.RING_ADUNAPHEL);
		renamed.put("khommurat", Items.RING_HOARMURATH);
		for (var mapping : event.getAllMappings(ForgeRegistries.Keys.ITEMS)) {
			for (var entry : renamed.entrySet()) {
				if (mapping.getKey().getPath().contains(entry.getKey())) {
					mapping.remap(entry.getValue().get());
					break;
				}
			}
		}
	}
}