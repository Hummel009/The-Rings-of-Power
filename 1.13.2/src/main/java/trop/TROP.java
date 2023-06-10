package trop;

import com.google.common.base.CaseFormat;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

@Mod("trop")
public class TROP {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "130110062023";
	
	public static Item ringGreat;

	public static Item ringNarya;
	public static Item ringNenya;
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

	public TROP() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onItemsRegistry(RegistryEvent.Register<Item> event) {
			ringGreat = new TROPItemRingGreat();

			ringNarya = new TROPItemRingNarya();
			ringNenya = new TROPItemRingNenya();
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

			register(ringNarya, "ringNarya");
			register(ringNenya, "ringNenya");
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
			ForgeRegistries.ITEMS.register(item);
		}
	}

	@Mod.EventBusSubscriber
	public static class MissingMappingsDetector {
		@SubscribeEvent
		public static void onMissingMappings(RegistryEvent.MissingMappings<Item> event) {
			Map<String, Item> renamed = new HashMap<>();
			renamed.put("dvar", ringDwar);
			renamed.put("saita", ringRen);
			renamed.put("uvata", ringUvatha);
			renamed.put("nenia", ringNenya);
			renamed.put("naria", ringNarya);
			renamed.put("vilia", ringVilya);
			renamed.put("morgomir", ringAdunaphel);
			renamed.put("khommurat", ringHoarmurath);
			for (RegistryEvent.MissingMappings.Mapping<Item> mapping : event.getAllMappings()) {
				for (Map.Entry<String, Item> entry : renamed.entrySet()) {
					if (mapping.key.getPath().contains(entry.getKey())) {
						mapping.remap(entry.getValue());
						break;
					}
				}
			}
		}
	}
}