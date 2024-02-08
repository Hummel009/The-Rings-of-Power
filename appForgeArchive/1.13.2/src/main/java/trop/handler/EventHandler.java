package trop.handler;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import trop.init.CreativeTabs;
import trop.init.Items;

public class EventHandler {
	@SubscribeEvent
	public void onItemRegistry(RegistryEvent.Register<Item> event) {
		CreativeTabs.register();
		Items.register();
	}
}