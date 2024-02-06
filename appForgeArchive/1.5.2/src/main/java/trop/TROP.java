package trop;

import com.google.common.base.CaseFormat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

@SuppressWarnings({"WeakerAccess", "PublicField"})
@Mod(modid = "trop", useMetadata = true)
public class TROP {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "101229102023";

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

	private static void register(Item item, String name) {
		String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
		item.setUnlocalizedName(itemName);
		GameRegistry.registerItem(item, itemName);
	}

	@Mod.Init
	public void onInit(FMLInitializationEvent event) {
		ringGreat = new TROPItemRingGreat(TROPConfig.idRingGreat - 256);

		ringNarya = new TROPItemRingNarya(TROPConfig.idRingNarya - 256);
		ringNenya = new TROPItemRingNenya(TROPConfig.idRingNenya - 256);
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

		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/en_US.lang", "en_US", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_AR.lang", "es_AR", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_ES.lang", "es_ES", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_MX.lang", "es_MX", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_UY.lang", "es_UY", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_VE.lang", "es_VE", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/ru_RU.lang", "ru_RU", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/uk_UA.lang", "uk_UA", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/zh_CN.lang", "zh_CN", false);
	}

	@Mod.PreInit
	public void preInit(FMLPreInitializationEvent event) {
		TROPConfig.preInit(event);
	}
}
