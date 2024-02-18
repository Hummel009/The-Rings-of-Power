package com.github.hummel.trop.init;

import com.github.hummel.trop.item.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("WeakerAccess")
public class Items {
	public static final Collection<Item> CONTENT = new ArrayList<>();

	public static final Item RING_GREAT = new ItemRingGreat();

	public static final Item RING_NARYA = new ItemRingNarya();
	public static final Item RING_NENYA = new ItemRingNenya();
	public static final Item RING_VILYA = new ItemRingVilya();

	public static final Item RING_THROR = new ItemRingDwarf();
	public static final Item RING_THULIN = new ItemRingDwarf();
	public static final Item RING_KHIBIL = new ItemRingDwarf();
	public static final Item RING_FARIN = new ItemRingDwarf();
	public static final Item RING_KHAIN = new ItemRingDwarf();
	public static final Item RING_BARAZ = new ItemRingDwarf();
	public static final Item RING_BURIN = new ItemRingDwarf();
	public static final Item RING_MURAZOR = new ItemRingMan();
	public static final Item RING_HOARMURATH = new ItemRingMan();
	public static final Item RING_AKHORAHIL = new ItemRingMan();
	public static final Item RING_ADUNAPHEL = new ItemRingMan();
	public static final Item RING_JIINDUR = new ItemRingMan();
	public static final Item RING_KHAMUL = new ItemRingMan();
	public static final Item RING_UVATHA = new ItemRingMan();
	public static final Item RING_REN = new ItemRingMan();
	public static final Item RING_DWAR = new ItemRingMan();

	private Items() {
	}

	public static void register() {
		register(RING_GREAT, "ring_great");

		register(RING_NARYA, "ring_narya");
		register(RING_NENYA, "ring_nenya");
		register(RING_VILYA, "ring_vilya");

		register(RING_THROR, "ring_thror");
		register(RING_THULIN, "ring_thulin");
		register(RING_KHIBIL, "ring_khibil");
		register(RING_FARIN, "ring_farin");
		register(RING_KHAIN, "ring_khain");
		register(RING_BARAZ, "ring_baraz");
		register(RING_BURIN, "ring_burin");
		register(RING_MURAZOR, "ring_murazor");
		register(RING_HOARMURATH, "ring_hoarmurath");
		register(RING_AKHORAHIL, "ring_akhorahil");
		register(RING_ADUNAPHEL, "ring_adunaphel");
		register(RING_JIINDUR, "ring_jiindur");
		register(RING_KHAMUL, "ring_khamul");
		register(RING_UVATHA, "ring_uvatha");
		register(RING_REN, "ring_ren");
		register(RING_DWAR, "ring_dwar");
	}

	private static void register(Item item, String name) {
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("trop", name), item);
	}
}