package com.github.hummel.trop.init;

import com.github.hummel.trop.item.*;
import com.google.common.base.CaseFormat;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class Items {
	public static final Collection<Item> CONTENT = new ArrayList<>();

	public static Item ringGreat;

	public static Item ringNarya;
	public static Item ringNenya;
	public static Item ringVilya;

	public static Item ringThror;
	public static Item ringThulin;
	public static Item ringKhibil;
	public static Item ringFarin;
	public static Item ringKhain;
	public static Item ringBaraz;
	public static Item ringBurin;

	public static Item ringMurazor;
	public static Item ringHoarmurath;
	public static Item ringAkhorahil;
	public static Item ringAdunaphel;
	public static Item ringJiindur;
	public static Item ringKhamul;
	public static Item ringUvatha;
	public static Item ringRen;
	public static Item ringDwar;

	private Items() {
	}

	public static void preInit() {
		ringGreat = new ItemRingGreat();

		ringNarya = new ItemRingNarya();
		ringNenya = new ItemRingNenya();
		ringVilya = new ItemRingVilya();

		ringThror = new ItemRingDwarf();
		ringThulin = new ItemRingDwarf();
		ringKhibil = new ItemRingDwarf();
		ringFarin = new ItemRingDwarf();
		ringKhain = new ItemRingDwarf();
		ringBaraz = new ItemRingDwarf();
		ringBurin = new ItemRingDwarf();

		ringMurazor = new ItemRingMan();
		ringHoarmurath = new ItemRingMan();
		ringAkhorahil = new ItemRingMan();
		ringAdunaphel = new ItemRingMan();
		ringJiindur = new ItemRingMan();
		ringKhamul = new ItemRingMan();
		ringUvatha = new ItemRingMan();
		ringRen = new ItemRingMan();
		ringDwar = new ItemRingMan();

		register(ringGreat, "ringGreat");

		register(ringNarya, "ringNarya");
		register(ringNenya, "ringNenya");
		register(ringVilya, "ringVilya");

		register(ringThror, "ringThror");
		register(ringThulin, "ringThulin");
		register(ringKhibil, "ringKhibil");
		register(ringFarin, "ringFarin");
		register(ringKhain, "ringKhain");
		register(ringBaraz, "ringBaraz");
		register(ringBurin, "ringBurin");

		register(ringMurazor, "ringMurazor");
		register(ringHoarmurath, "ringHoarmurath");
		register(ringAkhorahil, "ringAkhorahil");
		register(ringAdunaphel, "ringAdunaphel");
		register(ringJiindur, "ringJiindur");
		register(ringKhamul, "ringKhamul");
		register(ringUvatha, "ringUvatha");
		register(ringRen, "ringRen");
		register(ringDwar, "ringDwar");
	}

	private static void register(Item item, String name) {
		String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
		item.setUnlocalizedName(itemName);
		item.setRegistryName(itemName);
		GameRegistry.registerItem(item);
		CONTENT.add(item);
	}
}