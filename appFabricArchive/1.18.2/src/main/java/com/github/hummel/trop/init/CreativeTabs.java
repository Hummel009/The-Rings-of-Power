package com.github.hummel.trop.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@SuppressWarnings("WeakerAccess")
public class CreativeTabs {
	public static final CreativeModeTab TAB_RINGS = FabricItemGroupBuilder.create(new ResourceLocation("trop", "rings")).icon(() -> new ItemStack(Items.RING_NARYA)).appendItems(populator -> {
		for (var item : Items.CONTENT) {
			populator.add(new ItemStack(item));
		}
	}).build();

	private CreativeTabs() {
	}
}
