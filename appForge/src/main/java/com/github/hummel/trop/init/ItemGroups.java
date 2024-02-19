package com.github.hummel.trop.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("WeakerAccess")
public class ItemGroups {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "trop");

	public static final RegistryObject<CreativeModeTab> TAB_RINGS = REGISTRY.register("rings", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.trop.rings")).icon(() -> new ItemStack(Items.RING_NARYA.get())).displayItems((enabledFlags, populator) -> {
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