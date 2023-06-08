package trop;

import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class TROPConfig {
	public static Configuration configuration;

	public static boolean loaded;

	public static int idRingGreat;

	public static int idRingNenia;
	public static int idRingNaria;
	public static int idRingVilia;

	public static int idRingThror;
	public static int idRingThulin;
	public static int idRingKhibil;
	public static int idRingFarin;
	public static int idRingKhain;
	public static int idRingBaraz;
	public static int idRingBurin;

	public static int idRingMurazor;
	public static int idRingKhommurat;
	public static int idRingAkhorahil;
	public static int idRingMorgomir;
	public static int idRingJiindur;
	public static int idRingKhamul;
	public static int idRingUvata;
	public static int idRingSaita;
	public static int idRingDvar;

	private static void setDefaultValues() {
		try {
			configuration.load();
			idRingGreat = configuration.get("item", "Ring Great", 890).getInt(890);
			idRingNenia = configuration.get("item", "Ring Nenia", 891).getInt(891);
			idRingNaria = configuration.get("item", "Ring Naria", 892).getInt(892);
			idRingVilia = configuration.get("item", "Ring Vilia", 893).getInt(893);
			idRingThror = configuration.get("item", "Ring Thror", 894).getInt(894);
			idRingThulin = configuration.get("item", "Ring Thulin", 895).getInt(895);
			idRingKhibil = configuration.get("item", "Ring Khibil", 896).getInt(896);
			idRingFarin = configuration.get("item", "Ring Farin", 897).getInt(897);
			idRingKhain = configuration.get("item", "Ring Khain", 898).getInt(898);
			idRingBaraz = configuration.get("item", "Ring Baraz", 899).getInt(899);
			idRingBurin = configuration.get("item", "Ring Burin", 900).getInt(900);
			idRingMurazor = configuration.get("item", "Ring Murazor", 901).getInt(901);
			idRingKhommurat = configuration.get("item", "Ring Khommurat", 902).getInt(902);
			idRingAkhorahil = configuration.get("item", "Ring Akhorahil", 903).getInt(903);
			idRingMorgomir = configuration.get("item", "Ring Morgomir", 904).getInt(904);
			idRingJiindur = configuration.get("item", "Ring Jiindur", 905).getInt(905);
			idRingKhamul = configuration.get("item", "Ring Khamul", 906).getInt(906);
			idRingUvata = configuration.get("item", "Ring Uvata", 907).getInt(907);
			idRingSaita = configuration.get("item", "Ring Saita", 908).getInt(908);
			idRingDvar = configuration.get("item", "Ring Dvar", 909).getInt(909);
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "TROP has a problem loading it's configuration");
		} finally {
			configuration.save();
			loaded = true;
		}
	}

	public static void preInit(FMLPreInitializationEvent event) {
		if (!loaded) {
			configuration = new Configuration(event.getSuggestedConfigurationFile());
			setDefaultValues();
		}
	}
}