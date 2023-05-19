package trop;

import com.google.common.base.CaseFormat;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
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

	private static void register(Item item, String field) {
		String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
		item.setUnlocalizedName(name);
		item.setTextureName("trop:" + name);
		item.setCreativeTab(TROPCreativeTabs.tabRing);
		item.setMaxDamage(0);
		item.setMaxStackSize(1);
		GameRegistry.registerItem(item, name);
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ringGreat = new TROPItemRingGreat();
		
		ringNenia = new TROPItemRingNenia();
		ringNaria = new TROPItemRingNaria();
		ringVilia = new TROPItemRingVilia();
		
		ringThror = new TROPItemRingDwarf();
		ringThulin = new TROPItemRingDwarf();
		ringKhibil = new TROPItemRingDwarf();
		ringFarin = new TROPItemRingDwarf();
		ringKhain = new TROPItemRingDwarf();
		ringBaraz = new TROPItemRingDwarf();
		ringBurin = new TROPItemRingDwarf();
		
		ringMurazor = new TROPItemRingMan();
		ringKhommurat = new TROPItemRingMan();
		ringAkhorahil = new TROPItemRingMan();
		ringMorgomir = new TROPItemRingMan();
		ringJiindur = new TROPItemRingMan();
		ringKhamul = new TROPItemRingMan();
		ringUvata = new TROPItemRingMan();
		ringSaita = new TROPItemRingMan();
		ringDvar = new TROPItemRingMan();

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
}
