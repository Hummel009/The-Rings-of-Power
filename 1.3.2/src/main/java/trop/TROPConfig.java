package trop;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

import java.util.logging.Level;

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
			idRingGreat = configuration.get("item", "Ring Great", 772).getInt(772);
			idRingNenia = configuration.get("item", "Ring Nenia", 773).getInt(773);
			idRingNaria = configuration.get("item", "Ring Naria", 774).getInt(774);
			idRingVilia = configuration.get("item", "Ring Vilia", 775).getInt(775);
			idRingThror = configuration.get("item", "Ring Thror", 776).getInt(776);
			idRingThulin = configuration.get("item", "Ring Thulin", 777).getInt(777);
			idRingKhibil = configuration.get("item", "Ring Khibil", 778).getInt(778);
			idRingFarin = configuration.get("item", "Ring Farin", 779).getInt(779);
			idRingKhain = configuration.get("item", "Ring Khain", 780).getInt(780);
			idRingBaraz = configuration.get("item", "Ring Baraz", 781).getInt(781);
			idRingBurin = configuration.get("item", "Ring Burin", 782).getInt(782);
			idRingMurazor = configuration.get("item", "Ring Murazor", 783).getInt(783);
			idRingKhommurat = configuration.get("item", "Ring Khommurat", 784).getInt(784);
			idRingAkhorahil = configuration.get("item", "Ring Akhorahil", 785).getInt(785);
			idRingMorgomir = configuration.get("item", "Ring Morgomir", 786).getInt(786);
			idRingJiindur = configuration.get("item", "Ring Jiindur", 787).getInt(787);
			idRingKhamul = configuration.get("item", "Ring Khamul", 788).getInt(788);
			idRingUvata = configuration.get("item", "Ring Uvata", 789).getInt(789);
			idRingSaita = configuration.get("item", "Ring Saita", 790).getInt(790);
			idRingDvar = configuration.get("item", "Ring Dvar", 791).getInt(791);
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