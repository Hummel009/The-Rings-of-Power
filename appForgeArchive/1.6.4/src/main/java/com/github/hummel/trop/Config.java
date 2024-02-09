package com.github.hummel.trop;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

import java.util.logging.Level;

@SuppressWarnings("PublicField")
public class Config {
	private static Configuration configuration;

	private static boolean loaded;

	public static int idRingGreat;

	public static int idRingNenya;
	public static int idRingNarya;
	public static int idRingVilya;

	public static int idRingThror;
	public static int idRingThulin;
	public static int idRingKhibil;
	public static int idRingFarin;
	public static int idRingKhain;
	public static int idRingBaraz;
	public static int idRingBurin;

	public static int idRingMurazor;
	public static int idRingHoarmurath;
	public static int idRingAkhorahil;
	public static int idRingAdunaphel;
	public static int idRingJiindur;
	public static int idRingKhamul;
	public static int idRingUvatha;
	public static int idRingRen;
	public static int idRingDwar;

	private Config() {
	}

	public static void preInit(FMLPreInitializationEvent event) {
		if (!loaded) {
			configuration = new Configuration(event.getSuggestedConfigurationFile());
			setDefaultValues();
		}
	}

	private static void setDefaultValues() {
		try {
			configuration.load();
			idRingGreat = configuration.get("item", "Ring Great", 890).getInt(890);
			idRingNarya = configuration.get("item", "Ring Narya", 891).getInt(891);
			idRingNenya = configuration.get("item", "Ring Nenya", 892).getInt(892);
			idRingVilya = configuration.get("item", "Ring Vilya", 893).getInt(893);
			idRingThror = configuration.get("item", "Ring Thror", 894).getInt(894);
			idRingThulin = configuration.get("item", "Ring Thulin", 895).getInt(895);
			idRingKhibil = configuration.get("item", "Ring Khibil", 896).getInt(896);
			idRingFarin = configuration.get("item", "Ring Farin", 897).getInt(897);
			idRingKhain = configuration.get("item", "Ring Khain", 898).getInt(898);
			idRingBaraz = configuration.get("item", "Ring Baraz", 899).getInt(899);
			idRingBurin = configuration.get("item", "Ring Burin", 900).getInt(900);
			idRingMurazor = configuration.get("item", "Ring Murazor", 901).getInt(901);
			idRingHoarmurath = configuration.get("item", "Ring Hoarmurath", 902).getInt(902);
			idRingAkhorahil = configuration.get("item", "Ring Akhorahil", 903).getInt(903);
			idRingAdunaphel = configuration.get("item", "Ring Adunaphel", 904).getInt(904);
			idRingJiindur = configuration.get("item", "Ring Jiindur", 905).getInt(905);
			idRingKhamul = configuration.get("item", "Ring Khamul", 906).getInt(906);
			idRingUvatha = configuration.get("item", "Ring Uvatha", 907).getInt(907);
			idRingRen = configuration.get("item", "Ring Ren", 908).getInt(908);
			idRingDwar = configuration.get("item", "Ring Dwar", 909).getInt(909);
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "TROP has a problem loading it's configuration");
		} finally {
			configuration.save();
			loaded = true;
		}
	}
}