package com.github.hummel.trop.init;

import com.github.hummel.trop.item.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@SuppressWarnings("WeakerAccess")
public class Items {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, "trop");

	public static final DeferredHolder<Item, Item> RING_GREAT = REGISTRY.register("ring_great", ItemRingGreat::new);

	public static final DeferredHolder<Item, Item> RING_NARYA = REGISTRY.register("ring_narya", ItemRingNarya::new);
	public static final DeferredHolder<Item, Item> RING_NENYA = REGISTRY.register("ring_nenya", ItemRingNenya::new);
	public static final DeferredHolder<Item, Item> RING_VILYA = REGISTRY.register("ring_vilya", ItemRingVilya::new);

	public static final DeferredHolder<Item, Item> RING_THROR = REGISTRY.register("ring_thror", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_THULIN = REGISTRY.register("ring_thulin", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_KHIBIL = REGISTRY.register("ring_khibil", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_FARIN = REGISTRY.register("ring_farin", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_KHAIN = REGISTRY.register("ring_khain", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_BARAZ = REGISTRY.register("ring_baraz", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_BURIN = REGISTRY.register("ring_burin", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_MURAZOR = REGISTRY.register("ring_murazor", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_HOARMURATH = REGISTRY.register("ring_hoarmurath", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_AKHORAHIL = REGISTRY.register("ring_akhorahil", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_ADUNAPHEL = REGISTRY.register("ring_adunaphel", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_JIINDUR = REGISTRY.register("ring_jiindur", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_KHAMUL = REGISTRY.register("ring_khamul", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_UVATHA = REGISTRY.register("ring_uvatha", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_REN = REGISTRY.register("ring_ren", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_DWAR = REGISTRY.register("ring_dwar", ItemRingMan::new);

	private Items() {
	}

	public static void register(IEventBus modEventBus) {
		REGISTRY.register(modEventBus);
	}
}