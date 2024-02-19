package com.github.hummel.trop.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@SuppressWarnings("WeakerAccess")
public class ItemGroups {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, "trop");

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB_RINGS = REGISTRY.register("rings", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.trop.rings")).icon(() -> new ItemStack(Items.RING_NARYA.get())).displayItems((enabledFlags, populator) -> {
		for (var item : Items.REGISTRY.getEntries()) {
			populator.accept(item.get());
		}
	}).build());

	private ItemGroups() {
	}

	public static void register(IEventBus modEventBus) {
		REGISTRY.register(modEventBus);
	}
}