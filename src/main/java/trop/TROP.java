package trop;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid = "trop", version = "4.0")
public class TROP {
	public static Item ring_great;
	public static Item ring_nenia;
	public static Item ring_naria;
	public static Item ring_vilia;
	public static Item ring_thror;
	public static Item ring_thulin;
	public static Item ring_khibil;
	public static Item ring_farin;
	public static Item ring_khain;
	public static Item ring_baraz;
	public static Item ring_burin;
	public static Item ring_murazor;
	public static Item ring_khommurat;
	public static Item ring_akhorahil;
	public static Item ring_morgomir;
	public static Item ring_jiindur;
	public static Item ring_khamul;
	public static Item ring_uvata;
	public static Item ring_saita;
	public static Item ring_dvar;

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		TROPCreativeTabs.setupIcons();
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ring_great = new TROPItemRingGreat();
		ring_nenia = new TROPItemRingNenia();
		ring_naria = new TROPItemRingNaria();
		ring_vilia = new TROPItemRingVilia();
		ring_thror = new TROPItemRingDwarf();
		ring_thulin = new TROPItemRingDwarf();
		ring_khibil = new TROPItemRingDwarf();
		ring_farin = new TROPItemRingDwarf();
		ring_khain = new TROPItemRingDwarf();
		ring_baraz = new TROPItemRingDwarf();
		ring_burin = new TROPItemRingDwarf();
		ring_murazor = new TROPItemRingMan();
		ring_khommurat = new TROPItemRingMan();
		ring_akhorahil = new TROPItemRingMan();
		ring_morgomir = new TROPItemRingMan();
		ring_jiindur = new TROPItemRingMan();
		ring_khamul = new TROPItemRingMan();
		ring_uvata = new TROPItemRingMan();
		ring_saita = new TROPItemRingMan();
		ring_dvar = new TROPItemRingMan();

		register(ring_great, "ring_great");
		register(ring_nenia, "ring_nenia");
		register(ring_naria, "ring_naria");
		register(ring_vilia, "ring_vilia");
		register(ring_thror, "ring_thror");
		register(ring_thulin, "ring_thulin");
		register(ring_khibil, "ring_khibil");
		register(ring_farin, "ring_farin");
		register(ring_khain, "ring_khain");
		register(ring_baraz, "ring_baraz");
		register(ring_burin, "ring_burin");
		register(ring_murazor, "ring_murazor");
		register(ring_khommurat, "ring_khommurat");
		register(ring_akhorahil, "ring_akhorahil");
		register(ring_morgomir, "ring_morgomir");
		register(ring_jiindur, "ring_jiindur");
		register(ring_khamul, "ring_khamul");
		register(ring_uvata, "ring_uvata");
		register(ring_saita, "ring_saita");
		register(ring_dvar, "ring_dvar");
	}

	private static void register(Item item, String name) {
		item.setUnlocalizedName(name);
		item.setTextureName("trop:" + name);
		item.setCreativeTab(TROPCreativeTabs.tabRing);
		item.setMaxDamage(0);
		item.setMaxStackSize(1);
		GameRegistry.registerItem(item, name);
	}
}