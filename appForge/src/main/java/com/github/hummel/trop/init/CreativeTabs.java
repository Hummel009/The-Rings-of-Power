package com.github.hummel.trop.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs {
	private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "trop");

	public static final RegistryObject<CreativeModeTab> TAB_RINGS = CREATIVE_TABS.register("rings", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.trop.rings")).icon(() -> new ItemStack(Items.RING_NARYA.get())).displayItems((enabledFlags, populator) -> {
		for (var item : Items.CONTENT) {
			populator.accept(item);
		}
	}).build());

	private CreativeTabs() {
	}

	public static void register(IEventBus modEventBus) {
		CREATIVE_TABS.register(modEventBus);
	}
}
