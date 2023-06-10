package trop;

import com.google.common.base.CaseFormat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

@Mod(modid = "trop", useMetadata = true)
public class TROP {
	public static Item ringGreat;

	public static Item ringNenya;
	public static Item ringNarya;
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

	public static void register(Item item, String field) {
		String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
		item.setTextureFile("/assets/trop/textures/items.png");
		item.setItemName(name);
		item.setMaxDamage(0);
		item.setMaxStackSize(1);
		item.setCreativeTab(TROPCreativeTabs.TAB_RINGS);
		GameRegistry.registerItem(item, name);
	}

	@Init
	public void onInit(FMLInitializationEvent event) {
		ringGreat = new TROPItemRingGreat(TROPConfig.idRingGreat - 256);

		ringNenya = new TROPItemRingNenya(TROPConfig.idRingNenya - 256);
		ringNarya = new TROPItemRingNarya(TROPConfig.idRingNarya - 256);
		ringVilya = new TROPItemRingVilya(TROPConfig.idRingVilya - 256);

		ringThror = new TROPItemRingDwarf(TROPConfig.idRingThror - 256);
		ringThulin = new TROPItemRingDwarf(TROPConfig.idRingThulin - 256);
		ringKhibil = new TROPItemRingDwarf(TROPConfig.idRingKhibil - 256);
		ringFarin = new TROPItemRingDwarf(TROPConfig.idRingFarin - 256);
		ringKhain = new TROPItemRingDwarf(TROPConfig.idRingKhain - 256);
		ringBaraz = new TROPItemRingDwarf(TROPConfig.idRingBaraz - 256);
		ringBurin = new TROPItemRingDwarf(TROPConfig.idRingBurin - 256);

		ringMurazor = new TROPItemRingMan(TROPConfig.idRingMurazor - 256);
		ringHoarmurath = new TROPItemRingMan(TROPConfig.idRingHoarmurath - 256);
		ringAkhorahil = new TROPItemRingMan(TROPConfig.idRingAkhorahil - 256);
		ringAdunaphel = new TROPItemRingMan(TROPConfig.idRingAdunaphel - 256);
		ringJiindur = new TROPItemRingMan(TROPConfig.idRingJiindur - 256);
		ringKhamul = new TROPItemRingMan(TROPConfig.idRingKhamul - 256);
		ringUvatha = new TROPItemRingMan(TROPConfig.idRingUvatha - 256);
		ringRen = new TROPItemRingMan(TROPConfig.idRingRen - 256);
		ringDwar = new TROPItemRingMan(TROPConfig.idRingDwar - 256);

		ringAkhorahil.setIconIndex(0);
		ringBaraz.setIconIndex(1);
		ringBurin.setIconIndex(2);
		ringDwar.setIconIndex(3);
		ringFarin.setIconIndex(4);
		ringGreat.setIconIndex(5);
		ringJiindur.setIconIndex(6);
		ringKhain.setIconIndex(7);
		ringKhamul.setIconIndex(8);
		ringKhibil.setIconIndex(9);
		ringHoarmurath.setIconIndex(10);
		ringAdunaphel.setIconIndex(11);
		ringMurazor.setIconIndex(12);
		ringNarya.setIconIndex(13);
		ringNenya.setIconIndex(14);
		ringRen.setIconIndex(15);
		ringThror.setIconIndex(16);
		ringThulin.setIconIndex(17);
		ringUvatha.setIconIndex(18);
		ringVilya.setIconIndex(19);

		register(ringGreat, "ringGreat");

		register(ringNenya, "ringNenya");
		register(ringNarya, "ringNarya");
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

		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/en_US.lang", "en_US", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_AR.lang", "es_AR", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_ES.lang", "es_ES", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_MX.lang", "es_MX", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/ru_RU.lang", "ru_RU", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/zh_CN.lang", "zh_CN", false);
	}

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		TROPConfig.preInit(event);
	}
}
