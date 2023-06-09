package trop;

import java.util.*;

import com.google.common.base.CaseFormat;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = "trop")
public class TROP {
	public static final Set<Item> CONTENT = new HashSet<>();
	@SidedProxy(serverSide = "trop.TROPCommonProxy", clientSide = "trop.TROPClientProxy")
	public static TROPCommonProxy proxy;
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

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.registerRenders();
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ringGreat = new TROPItemRingGreat();

		ringNenya = new TROPItemRingNenya();
		ringNarya = new TROPItemRingNarya();
		ringVilya = new TROPItemRingVilya();

		ringThror = new TROPItemRingDwarf();
		ringThulin = new TROPItemRingDwarf();
		ringKhibil = new TROPItemRingDwarf();
		ringFarin = new TROPItemRingDwarf();
		ringKhain = new TROPItemRingDwarf();
		ringBaraz = new TROPItemRingDwarf();
		ringBurin = new TROPItemRingDwarf();

		ringMurazor = new TROPItemRingMan();
		ringHoarmurath = new TROPItemRingMan();
		ringAkhorahil = new TROPItemRingMan();
		ringAdunaphel = new TROPItemRingMan();
		ringJiindur = new TROPItemRingMan();
		ringKhamul = new TROPItemRingMan();
		ringUvatha = new TROPItemRingMan();
		ringRen = new TROPItemRingMan();
		ringDwar = new TROPItemRingMan();

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

	public static void register(Item item, String field) {
		String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
		item.setRegistryName(name);
		item.setUnlocalizedName(name);
		item.setMaxDamage(0);
		item.setMaxStackSize(1);
		item.setCreativeTab(TROPCreativeTabs.TAB_RINGS);
		GameRegistry.registerItem(item, name);
		CONTENT.add(item);
	}
}
