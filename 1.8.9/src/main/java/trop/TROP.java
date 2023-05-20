package trop;

import java.util.ArrayList;

import com.google.common.base.CaseFormat;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = "trop")
public class TROP {
	@SidedProxy(serverSide = "trop.TROPCommonProxy", clientSide = "trop.TROPClientProxy")
	public static TROPCommonProxy proxy;

	public static final ArrayList<Item> CONTENT = new ArrayList<>();

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
		CONTENT.add(item);
		String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
		item.setUnlocalizedName(name);
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

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.registerRenders();
	}
}
