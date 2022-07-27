package trop;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("trop")
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

	public TROP() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onItemsRegistry(RegistryEvent.Register<Item> event) {
			Properties prop = new Properties();
			prop.tab(TROPCreativeTabs.tabRing);
			prop.durability(0);
			ring_great = new TROPItemRingGreat(prop);
			ring_nenia = new TROPItemRingNenia(prop);
			ring_naria = new TROPItemRingNaria(prop);
			ring_vilia = new TROPItemRingVilia(prop);
			ring_thror = new TROPItemRingDwarf(prop);
			ring_thulin = new TROPItemRingDwarf(prop);
			ring_khibil = new TROPItemRingDwarf(prop);
			ring_farin = new TROPItemRingDwarf(prop);
			ring_khain = new TROPItemRingDwarf(prop);
			ring_baraz = new TROPItemRingDwarf(prop);
			ring_burin = new TROPItemRingDwarf(prop);
			ring_murazor = new TROPItemRingMan(prop);
			ring_khommurat = new TROPItemRingMan(prop);
			ring_akhorahil = new TROPItemRingMan(prop);
			ring_morgomir = new TROPItemRingMan(prop);
			ring_jiindur = new TROPItemRingMan(prop);
			ring_khamul = new TROPItemRingMan(prop);
			ring_uvata = new TROPItemRingMan(prop);
			ring_saita = new TROPItemRingMan(prop);
			ring_dvar = new TROPItemRingMan(prop);

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

		public static void register(Item item, String name) {
			ForgeRegistries.ITEMS.register(item.setRegistryName(name));
		}
	}
}