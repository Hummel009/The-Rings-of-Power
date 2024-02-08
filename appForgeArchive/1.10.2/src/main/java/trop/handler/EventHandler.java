package trop.handler;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trop.init.CreativeTabs;
import trop.init.Items;

public class EventHandler {
	@SubscribeEvent
	public void onItemRegistry(RegistryEvent.Register<Item> event) {
		CreativeTabs.register();
		Items.register();
	}

	@SubscribeEvent
	public void onModelRegistry(ModelRegistryEvent event) {
		for (Item item : Items.CONTENT) {
			ResourceLocation registryName = item.getRegistryName();
			ModelResourceLocation modelResourceLocation = new ModelResourceLocation(registryName, "inventory");
			ModelBakery.registerItemVariants(item, modelResourceLocation);
			ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
		}
	}
}