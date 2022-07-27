package trop;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("trop")
public class TROP {
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

	public TROP() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
	}

	@EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onItemsRegistry(RegistryEvent.Register<Item> event) {
			IForgeRegistry<Item> r = event.getRegistry();
			Properties prop = new Properties();
			prop.tab(TROPCreativeTabs.tabRing);
			prop.durability(0);
			ring_great = new TROPItemRingGreat(prop);
			ring_naria = new TROPItemRingNaria(prop);
			ring_nenia = new TROPItemRingNenia(prop);
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

			register(ring_great, "ring_great", r);
			register(ring_naria, "ring_naria", r);
			register(ring_nenia, "ring_nenia", r);
			register(ring_vilia, "ring_vilia", r);
			register(ring_thror, "ring_thror", r);
			register(ring_thulin, "ring_thulin", r);
			register(ring_khibil, "ring_khibil", r);
			register(ring_farin, "ring_farin", r);
			register(ring_khain, "ring_khain", r);
			register(ring_baraz, "ring_baraz", r);
			register(ring_burin, "ring_burin", r);
			register(ring_murazor, "ring_murazor", r);
			register(ring_khommurat, "ring_khommurat", r);
			register(ring_akhorahil, "ring_akhorahil", r);
			register(ring_morgomir, "ring_morgomir", r);
			register(ring_jiindur, "ring_jiindur", r);
			register(ring_khamul, "ring_khamul", r);
			register(ring_uvata, "ring_uvata", r);
			register(ring_saita, "ring_saita", r);
			register(ring_dvar, "ring_dvar", r);

		}

		private static void register(Item item, String name, IForgeRegistry<Item> r) {
			r.register(item.setRegistryName(name));
		}
	}
}