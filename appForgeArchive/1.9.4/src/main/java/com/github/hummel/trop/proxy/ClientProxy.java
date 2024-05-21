package com.github.hummel.trop.proxy;

import com.github.hummel.trop.init.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy implements CommonProxy {
	@Override
	@SideOnly(Side.CLIENT)
	public void onInit() {
		for (Item item : Items.CONTENT) {
			String registryName = item.getRegistryName().toString();
			ModelResourceLocation modelResourceLocation = new ModelResourceLocation(registryName, "inventory");
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, modelResourceLocation);
		}
	}
}