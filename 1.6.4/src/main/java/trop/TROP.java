package trop;

import com.google.common.base.CaseFormat;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid = "trop", useMetadata = true)
public class TROP {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "132510062023";
	
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
		item.setTextureName("trop:" + name);
		item.setUnlocalizedName(name);
		item.setMaxDamage(0);
		item.setMaxStackSize(1);
		item.setCreativeTab(TROPCreativeTabs.TAB_RINGS);
		GameRegistry.registerItem(item, name);
	}

	@Mod.EventHandler
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
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		TROPConfig.preInit(event);
	}
}
