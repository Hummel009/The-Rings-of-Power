package com.github.hummel.trop.init;

import com.github.hummel.trop.Config;
import com.github.hummel.trop.item.*;
import com.google.common.base.CaseFormat;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class Items {
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

	@SuppressWarnings("ValueOfIncrementOrDecrementUsed")
	public static void preInit() {
		ringGreat = new ItemRingGreat(Config.idRingGreat - 256);

		ringNarya = new ItemRingNarya(Config.idRingNarya - 256);
		ringNenya = new ItemRingNenya(Config.idRingNenya - 256);
		ringVilya = new ItemRingVilya(Config.idRingVilya - 256);

		ringThror = new ItemRingDwarf(Config.idRingThror - 256);
		ringThulin = new ItemRingDwarf(Config.idRingThulin - 256);
		ringKhibil = new ItemRingDwarf(Config.idRingKhibil - 256);
		ringFarin = new ItemRingDwarf(Config.idRingFarin - 256);
		ringKhain = new ItemRingDwarf(Config.idRingKhain - 256);
		ringBaraz = new ItemRingDwarf(Config.idRingBaraz - 256);
		ringBurin = new ItemRingDwarf(Config.idRingBurin - 256);

		ringMurazor = new ItemRingMan(Config.idRingMurazor - 256);
		ringHoarmurath = new ItemRingMan(Config.idRingHoarmurath - 256);
		ringAkhorahil = new ItemRingMan(Config.idRingAkhorahil - 256);
		ringAdunaphel = new ItemRingMan(Config.idRingAdunaphel - 256);
		ringJiindur = new ItemRingMan(Config.idRingJiindur - 256);
		ringKhamul = new ItemRingMan(Config.idRingKhamul - 256);
		ringUvatha = new ItemRingMan(Config.idRingUvatha - 256);
		ringRen = new ItemRingMan(Config.idRingRen - 256);
		ringDwar = new ItemRingMan(Config.idRingDwar - 256);

		int id = 0;
		ringAdunaphel.setIconIndex(id++);
		ringAkhorahil.setIconIndex(id++);
		ringBaraz.setIconIndex(id++);
		ringBurin.setIconIndex(id++);
		ringDwar.setIconIndex(id++);
		ringFarin.setIconIndex(id++);
		ringGreat.setIconIndex(id++);
		ringHoarmurath.setIconIndex(id++);
		ringJiindur.setIconIndex(id++);
		ringKhain.setIconIndex(id++);
		ringKhamul.setIconIndex(id++);
		ringKhibil.setIconIndex(id++);
		ringMurazor.setIconIndex(id++);
		ringNarya.setIconIndex(id++);
		ringNenya.setIconIndex(id++);
		ringRen.setIconIndex(id++);
		ringThror.setIconIndex(id++);
		ringThulin.setIconIndex(id++);
		ringUvatha.setIconIndex(id++);
		ringVilya.setIconIndex(id);

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
		item.setTextureFile("/assets/trop/textures/items/sprite.png");
		item.setItemName(itemName);
		GameRegistry.registerItem(item, itemName);
	}
}