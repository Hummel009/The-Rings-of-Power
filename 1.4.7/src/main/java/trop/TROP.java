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

import static trop.TROPObfuscationHelper.*;

@Mod(modid = "trop", useMetadata = true)
public class TROP {
	public static Item ringGreat;

	public static Item ringNenia;
	public static Item ringNaria;
	public static Item ringVilia;

	public static Item ringThror;
	public static Item ringThulin;
	public static Item ringKhibil;
	public static Item ringFarin;
	public static Item ringKhain;
	public static Item ringBaraz;
	public static Item ringBurin;

	public static Item ringMurazor;
	public static Item ringKhommurat;
	public static Item ringAkhorahil;
	public static Item ringMorgomir;
	public static Item ringJiindur;
	public static Item ringKhamul;
	public static Item ringUvata;
	public static Item ringSaita;
	public static Item ringDvar;

	public static void register(Item item, String field) {
		String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
		item.setTextureFile("/assets/trop/textures/items.png");
		setItemName(item, name);
		setMaxDamage(item, 0);
		setMaxStackSize(item, 1);
		setCreativeTab(item, TROPCreativeTabs.TAB_RINGS);
		GameRegistry.registerItem(item, name);
	}

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		TROPConfig.preInit(event);
	}

	@Init
	public void onInit(FMLInitializationEvent event) {
		ringGreat = new TROPItemRingGreat(TROPConfig.idRingGreat - 256);

		ringNenia = new TROPItemRingNenia(TROPConfig.idRingNenia - 256);
		ringNaria = new TROPItemRingNaria(TROPConfig.idRingNaria - 256);
		ringVilia = new TROPItemRingVilia(TROPConfig.idRingVilia - 256);

		ringThror = new TROPItemRingDwarf(TROPConfig.idRingThror - 256);
		ringThulin = new TROPItemRingDwarf(TROPConfig.idRingThulin - 256);
		ringKhibil = new TROPItemRingDwarf(TROPConfig.idRingKhibil - 256);
		ringFarin = new TROPItemRingDwarf(TROPConfig.idRingFarin - 256);
		ringKhain = new TROPItemRingDwarf(TROPConfig.idRingKhain - 256);
		ringBaraz = new TROPItemRingDwarf(TROPConfig.idRingBaraz - 256);
		ringBurin = new TROPItemRingDwarf(TROPConfig.idRingBurin - 256);

		ringMurazor = new TROPItemRingMan(TROPConfig.idRingMurazor - 256);
		ringKhommurat = new TROPItemRingMan(TROPConfig.idRingKhommurat - 256);
		ringAkhorahil = new TROPItemRingMan(TROPConfig.idRingAkhorahil - 256);
		ringMorgomir = new TROPItemRingMan(TROPConfig.idRingMorgomir - 256);
		ringJiindur = new TROPItemRingMan(TROPConfig.idRingJiindur - 256);
		ringKhamul = new TROPItemRingMan(TROPConfig.idRingKhamul - 256);
		ringUvata = new TROPItemRingMan(TROPConfig.idRingUvata - 256);
		ringSaita = new TROPItemRingMan(TROPConfig.idRingSaita - 256);
		ringDvar = new TROPItemRingMan(TROPConfig.idRingDvar - 256);

		setIconIndex(ringAkhorahil, 0);
		setIconIndex(ringBaraz, 1);
		setIconIndex(ringBurin, 2);
		setIconIndex(ringDvar, 3);
		setIconIndex(ringFarin, 4);
		setIconIndex(ringGreat, 5);
		setIconIndex(ringJiindur, 6);
		setIconIndex(ringKhain, 7);
		setIconIndex(ringKhamul, 8);
		setIconIndex(ringKhibil, 9);
		setIconIndex(ringKhommurat, 10);
		setIconIndex(ringMorgomir, 11);
		setIconIndex(ringMurazor, 12);
		setIconIndex(ringNaria, 13);
		setIconIndex(ringNenia, 14);
		setIconIndex(ringSaita, 15);
		setIconIndex(ringThror, 16);
		setIconIndex(ringThulin, 17);
		setIconIndex(ringUvata, 18);
		setIconIndex(ringVilia, 19);

		register(ringGreat, "ringGreat");

		register(ringNenia, "ringNenia");
		register(ringNaria, "ringNaria");
		register(ringVilia, "ringVilia");

		register(ringThror, "ringThror");
		register(ringThulin, "ringThulin");
		register(ringKhibil, "ringKhibil");
		register(ringFarin, "ringFarin");
		register(ringKhain, "ringKhain");
		register(ringBaraz, "ringBaraz");
		register(ringBurin, "ringBurin");

		register(ringMurazor, "ringMurazor");
		register(ringKhommurat, "ringKhommurat");
		register(ringAkhorahil, "ringAkhorahil");
		register(ringMorgomir, "ringMorgomir");
		register(ringJiindur, "ringJiindur");
		register(ringKhamul, "ringKhamul");
		register(ringUvata, "ringUvata");
		register(ringSaita, "ringSaita");
		register(ringDvar, "ringDvar");

		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/en_US.lang", "en_US", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_AR.lang", "es_AR", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_ES.lang", "es_ES", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/es_MX.lang", "es_MX", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/ru_RU.lang", "ru_RU", false);
		LanguageRegistry.instance().loadLocalization("/assets/trop/lang/zh_CN.lang", "zh_CN", false);
	}
}
