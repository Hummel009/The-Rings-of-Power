package com.github.hummel.trop.proxy;

import com.github.hummel.trop.init.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy implements CommonProxy {
	@Override
	public void onInit() {
		for (Item item : Items.CONTENT) {
			String registryName = item.getRegistryName().toString();
			ModelResourceLocation modelResourceLocation = new ModelResourceLocation(registryName, "inventory");
			ModelBakery.registerItemVariants(item, modelResourceLocation);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, modelResourceLocation);
		}
	}
}