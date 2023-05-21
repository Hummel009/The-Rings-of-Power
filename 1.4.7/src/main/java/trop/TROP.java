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

@Mod(modid = "trop")
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

		int x = 0;
		int y = 0;

		ringAkhorahil.setIconCoord(x++, y);
		ringBaraz.setIconCoord(x++, y);
		ringBurin.setIconCoord(x++, y);
		ringDvar.setIconCoord(x++, y);
		ringFarin.setIconCoord(x++, y);
		ringGreat.setIconCoord(x++, y);
		ringJiindur.setIconCoord(x++, y);
		ringKhain.setIconCoord(x++, y);
		ringKhamul.setIconCoord(x++, y);
		ringKhibil.setIconCoord(x++, y);
		ringKhommurat.setIconCoord(x++, y);
		ringMorgomir.setIconCoord(x++, y);
		ringMurazor.setIconCoord(x++, y);
		ringNaria.setIconCoord(x++, y);
		ringNenia.setIconCoord(x++, y);

		ringSaita.setIconCoord(x = 0, y++);

		ringThror.setIconCoord(x++, y);
		ringThulin.setIconCoord(x++, y);
		ringUvata.setIconCoord(x++, y);
		ringVilia.setIconCoord(x++, y);

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
	}

	public static void register(Item item, String field) {
		String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
		item.setTextureFile("/assets/trop/textures/items/rings.png");
		item.setItemName(name);
		item.setMaxDamage(0);
		item.setMaxStackSize(1);
		item.setCreativeTab(TROPCreativeTabs.tabRing);
		LanguageRegistry.instance().addNameForObject(item, "en_US", TROPLang.enUS.get("item." + name + ".name"));
		LanguageRegistry.instance().addNameForObject(item, "es_AR", TROPLang.esES.get("item." + name + ".name"));
		LanguageRegistry.instance().addNameForObject(item, "es_ES", TROPLang.esES.get("item." + name + ".name"));
		LanguageRegistry.instance().addNameForObject(item, "es_MX", TROPLang.esES.get("item." + name + ".name"));
		LanguageRegistry.instance().addNameForObject(item, "ru_RU", TROPLang.ruRU.get("item." + name + ".name"));
		LanguageRegistry.instance().addNameForObject(item, "zh_CN", TROPLang.zhCN.get("item." + name + ".name"));
		GameRegistry.registerItem(item, name);
	}
}
