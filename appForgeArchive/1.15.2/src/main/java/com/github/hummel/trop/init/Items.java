package com.github.hummel.trop.init;

import com.github.hummel.trop.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings({"WeakerAccess", "unused"})
public class Items {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "trop");

	public static final RegistryObject<Item> RING_GREAT = REGISTRY.register("ring_great", ItemRingGreat::new);

	public static final RegistryObject<Item> RING_NARYA = REGISTRY.register("ring_narya", ItemRingNarya::new);
	public static final RegistryObject<Item> RING_NENYA = REGISTRY.register("ring_nenya", ItemRingNenya::new);
	public static final RegistryObject<Item> RING_VILYA = REGISTRY.register("ring_vilya", ItemRingVilya::new);

	public static final RegistryObject<Item> RING_THROR = REGISTRY.register("ring_thror", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_THULIN = REGISTRY.register("ring_thulin", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_KHIBIL = REGISTRY.register("ring_khibil", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_FARIN = REGISTRY.register("ring_farin", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_KHAIN = REGISTRY.register("ring_khain", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_BARAZ = REGISTRY.register("ring_baraz", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_BURIN = REGISTRY.register("ring_burin", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_MURAZOR = REGISTRY.register("ring_murazor", ItemRingMan::new);
	public static final RegistryObject<Item> RING_HOARMURATH = REGISTRY.register("ring_hoarmurath", ItemRingMan::new);
	public static final RegistryObject<Item> RING_AKHORAHIL = REGISTRY.register("ring_akhorahil", ItemRingMan::new);
	public static final RegistryObject<Item> RING_ADUNAPHEL = REGISTRY.register("ring_adunaphel", ItemRingMan::new);
	public static final RegistryObject<Item> RING_JIINDUR = REGISTRY.register("ring_jiindur", ItemRingMan::new);
	public static final RegistryObject<Item> RING_KHAMUL = REGISTRY.register("ring_khamul", ItemRingMan::new);
	public static final RegistryObject<Item> RING_UVATHA = REGISTRY.register("ring_uvatha", ItemRingMan::new);
	public static final RegistryObject<Item> RING_REN = REGISTRY.register("ring_ren", ItemRingMan::new);
	public static final RegistryObject<Item> RING_DWAR = REGISTRY.register("ring_dwar", ItemRingMan::new);

	private Items() {
	}

	public static void register(IEventBus modEventBus) {
		REGISTRY.register(modEventBus);
	}
}