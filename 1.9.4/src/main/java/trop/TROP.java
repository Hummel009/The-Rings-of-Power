package trop;

import com.google.common.base.CaseFormat;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mod(modid = "trop", useMetadata = true)
public class TROP {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "213313062023";

	public static final List<Item> CONTENT = new ArrayList<>();

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

	public static void register(Item item, String name) {
		String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
		item.setRegistryName(itemName);
		item.setUnlocalizedName(itemName);
		item.setMaxDamage(0);
		item.setMaxStackSize(1);
		item.setCreativeTab(TROPCreativeTabs.TAB_RINGS);
		ForgeRegistries.ITEMS.register(item);
		CONTENT.add(item);
	}

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit();
	}

	@Mod.EventHandler
	public void onMissingMappings(FMLMissingMappingsEvent event) {
		Map<String, Item> renamed = new HashMap<>();
		renamed.put("dvar", ringDwar);
		renamed.put("saita", ringRen);
		renamed.put("uvata", ringUvatha);
		renamed.put("nenia", ringNenya);
		renamed.put("naria", ringNarya);
		renamed.put("vilia", ringVilya);
		renamed.put("morgomir", ringAdunaphel);
		renamed.put("khommurat", ringHoarmurath);
		for (FMLMissingMappingsEvent.MissingMapping mapping : event.get()) {
			if (mapping.type == GameRegistry.Type.ITEM) {
				for (Map.Entry<String, Item> entry : renamed.entrySet()) {
					if (mapping.name.contains(entry.getKey())) {
						mapping.remap(entry.getValue());
						break;
					}
				}
			}
		}
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
}
