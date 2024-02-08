package trop.handler;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;
import net.minecraftforge.registries.RegistryObject;
import trop.Main;

import java.util.HashMap;
import java.util.Map;

public class ForgeEventHandler {
	@SubscribeEvent
	public void onMissingMappings(MissingMappingsEvent event) {
		Map<String, RegistryObject<Item>> renamed = new HashMap<>();
		renamed.put("dvar", Main.RING_DWAR);
		renamed.put("saita", Main.RING_REN);
		renamed.put("uvata", Main.RING_UVATHA);
		renamed.put("nenia", Main.RING_NENYA);
		renamed.put("naria", Main.RING_NARYA);
		renamed.put("vilia", Main.RING_VILYA);
		renamed.put("morgomir", Main.RING_ADUNAPHEL);
		renamed.put("khommurat", Main.RING_HOARMURATH);
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
