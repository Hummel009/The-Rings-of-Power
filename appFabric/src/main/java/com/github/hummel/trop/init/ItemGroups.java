package com.github.hummel.trop.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@SuppressWarnings("WeakerAccess")
public class ItemGroups {
	public static final CreativeModeTab TAB_RINGS = FabricItemGroup.builder().icon(() -> new ItemStack(Items.RING_NARYA)).title(Component.translatable("itemGroup.trop.rings")).displayItems((context, populator) -> {
		for (var item : Items.CONTENT) {
			populator.accept(item);
		}
	}).build();

	private ItemGroups() {
	}

	public static void register() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath("trop", "rings"), TAB_RINGS);
	}
}