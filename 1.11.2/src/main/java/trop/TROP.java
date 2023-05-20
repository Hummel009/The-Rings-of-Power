package trop;

import com.google.common.base.CaseFormat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = "trop")
public class TROP {
	@SidedProxy(serverSide = "trop.TROPCommonProxy", clientSide = "trop.TROPClientProxy")
	public static TROPCommonProxy proxy;

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

	public static void registerRenders() {
		registerRender(ringGreat, "ringGreat");

		registerRender(ringNenia, "ringNenia");
		registerRender(ringNaria, "ringNaria");
		registerRender(ringVilia, "ringVilia");

		registerRender(ringThror, "ringThror");
		registerRender(ringThulin, "ringThulin");
		registerRender(ringKhibil, "ringKhibil");
		registerRender(ringFarin, "ringFarin");
		registerRender(ringKhain, "ringKhain");
		registerRender(ringBaraz, "ringBaraz");
		registerRender(ringBurin, "ringBurin");

		registerRender(ringMurazor, "ringMurazor");
		registerRender(ringKhommurat, "ringKhommurat");
		registerRender(ringAkhorahil, "ringAkhorahil");
		registerRender(ringMorgomir, "ringMorgomir");
		registerRender(ringJiindur, "ringJiindur");
		registerRender(ringKhamul, "ringKhamul");
		registerRender(ringUvata, "ringUvata");
		registerRender(ringSaita, "ringSaita");
		registerRender(ringDvar, "ringDvar");
	}

	public static void registerItem(Item item, String field) {
		String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
		item.setUnlocalizedName(name);
		item.setRegistryName(name);
		item.setMaxDamage(0);
		item.setMaxStackSize(1);
		item.setCreativeTab(TROPCreativeTabs.tabRing);
		ForgeRegistries.ITEMS.register(item);
	}

	public static void registerRender(Item item, String field) {
		String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("trop:" + name, "inventory"));
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

		registerItem(ringGreat, "ringGreat");

		registerItem(ringNenia, "ringNenia");
		registerItem(ringNaria, "ringNaria");
		registerItem(ringVilia, "ringVilia");

		registerItem(ringThror, "ringThror");
		registerItem(ringThulin, "ringThulin");
		registerItem(ringKhibil, "ringKhibil");
		registerItem(ringFarin, "ringFarin");
		registerItem(ringKhain, "ringKhain");
		registerItem(ringBaraz, "ringBaraz");
		registerItem(ringBurin, "ringBurin");

		registerItem(ringMurazor, "ringMurazor");
		registerItem(ringKhommurat, "ringKhommurat");
		registerItem(ringAkhorahil, "ringAkhorahil");
		registerItem(ringMorgomir, "ringMorgomir");
		registerItem(ringJiindur, "ringJiindur");
		registerItem(ringKhamul, "ringKhamul");
		registerItem(ringUvata, "ringUvata");
		registerItem(ringSaita, "ringSaita");
		registerItem(ringDvar, "ringDvar");
	}

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.registerRenders();
	}
}
