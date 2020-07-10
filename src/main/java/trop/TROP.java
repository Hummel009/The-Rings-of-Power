package trop;

import com.google.common.base.CaseFormat;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid=TROP.MODID, version=TROP.VERSION)
public class TROP {
    public static final String MODID = "trop";
    public static final String VERSION = "3.0";
    
	public static Item ring_great;
	public static Item ring_naria;
	public static Item ring_nenia;
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
    public void preInit(FMLPreInitializationEvent event) {
    	ring_great = new TROPItemRingGreat();
    	ring_naria = new TROPItemRingNaria();
    	ring_nenia = new TROPItemRingNenia();
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
    	
    	this.register(ring_great, "ring_great");
    	this.register(ring_naria, "ring_naria");
    	this.register(ring_nenia, "ring_nenia");
    	this.register(ring_vilia, "ring_vilia");
    	this.register(ring_thror, "ring_thror");
    	this.register(ring_thulin, "ring_thulin");
    	this.register(ring_khibil, "ring_khibil");
    	this.register(ring_farin, "ring_farin");
    	this.register(ring_khain, "ring_khain");
    	this.register(ring_baraz, "ring_baraz");
    	this.register(ring_burin, "ring_burin");
    	this.register(ring_murazor, "ring_murazor");
    	this.register(ring_khommurat, "ring_khommurat");
    	this.register(ring_akhorahil, "ring_akhorahil");
    	this.register(ring_morgomir, "ring_morgomir");
    	this.register(ring_jiindur, "ring_jiindur");
    	this.register(ring_khamul, "ring_khamul");
    	this.register(ring_uvata, "ring_uvata");
    	this.register(ring_saita, "ring_saita");
    	this.register(ring_dvar, "ring_dvar");
    }
    
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
    	TROPCreativeTabs.setupIcons();
    }
    
    private static void register(Item item, String name) {
        String lowerUnderscoreName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        item.setUnlocalizedName(name);
        item.setTextureName("trop:" + lowerUnderscoreName);
        GameRegistry.registerItem(item, lowerUnderscoreName);
   }
}