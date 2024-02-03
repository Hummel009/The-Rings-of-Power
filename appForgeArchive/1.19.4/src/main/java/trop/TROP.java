package trop;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Mod("trop")
@SuppressWarnings("WeakerAccess")
public class TROP {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "101229102023";
	public static final Collection<Item> CONTENT = new ArrayList<>();

	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "trop");

	public static final RegistryObject<Item> RING_GREAT = ITEMS.register("ring_great", TROPItemRingGreat::new);

	public static final RegistryObject<Item> RING_NENYA = ITEMS.register("ring_nenya", TROPItemRingNenya::new);
	public static final RegistryObject<Item> RING_NARYA = ITEMS.register("ring_narya", TROPItemRingNarya::new);
	public static final RegistryObject<Item> RING_VILYA = ITEMS.register("ring_vilya", TROPItemRingVilya::new);

	public static final RegistryObject<Item> RING_THROR = ITEMS.register("ring_thror", TROPItemRingDwarf::new);
	public static final RegistryObject<Item> RING_THULIN = ITEMS.register("ring_thulin", TROPItemRingDwarf::new);
	public static final RegistryObject<Item> RING_KHIBIL = ITEMS.register("ring_khibil", TROPItemRingDwarf::new);
	public static final RegistryObject<Item> RING_FARIN = ITEMS.register("ring_farin", TROPItemRingDwarf::new);
	public static final RegistryObject<Item> RING_KHAIN = ITEMS.register("ring_khain", TROPItemRingDwarf::new);
	public static final RegistryObject<Item> RING_BARAZ = ITEMS.register("ring_baraz", TROPItemRingDwarf::new);
	public static final RegistryObject<Item> RING_BURIN = ITEMS.register("ring_burin", TROPItemRingDwarf::new);

	public static final RegistryObject<Item> RING_MURAZOR = ITEMS.register("ring_murazor", TROPItemRingMan::new);
	public static final RegistryObject<Item> RING_HOARMURATH = ITEMS.register("ring_hoarmurath", TROPItemRingMan::new);
	public static final RegistryObject<Item> RING_AKHORAHIL = ITEMS.register("ring_akhorahil", TROPItemRingMan::new);
	public static final RegistryObject<Item> RING_ADUNAPHEL = ITEMS.register("ring_adunaphel", TROPItemRingMan::new);
	public static final RegistryObject<Item> RING_JIINDUR = ITEMS.register("ring_jiindur", TROPItemRingMan::new);
	public static final RegistryObject<Item> RING_KHAMUL = ITEMS.register("ring_khamul", TROPItemRingMan::new);
	public static final RegistryObject<Item> RING_UVATHA = ITEMS.register("ring_uvatha", TROPItemRingMan::new);
	public static final RegistryObject<Item> RING_REN = ITEMS.register("ring_ren", TROPItemRingMan::new);
	public static final RegistryObject<Item> RING_DWAR = ITEMS.register("ring_dwar", TROPItemRingMan::new);

	public TROP() {
		var fmlBus = FMLJavaModLoadingContext.get().getModEventBus();
		ITEMS.register(fmlBus);
		fmlBus.addListener(TROPCreativeTabs::addCreativeTab);
	}

	@Mod.EventBusSubscriber
	public static class MissingMappingsDetector {
		private MissingMappingsDetector() {
		}

		@SubscribeEvent
		public static void onMissingMappings(MissingMappingsEvent event) {
			Map<String, RegistryObject<Item>> renamed = new HashMap<>();
			renamed.put("dvar", RING_DWAR);
			renamed.put("saita", RING_REN);
			renamed.put("uvata", RING_UVATHA);
			renamed.put("nenia", RING_NENYA);
			renamed.put("naria", RING_NARYA);
			renamed.put("vilia", RING_VILYA);
			renamed.put("morgomir", RING_ADUNAPHEL);
			renamed.put("khommurat", RING_HOARMURATH);
			for (var mapping : event.getAllMappings(ForgeRegistries.Keys.ITEMS)) {
				for (var entry : renamed.entrySet()) {
					if (mapping.getKey().getPath().contains(entry.getKey())) {
						mapping.remap(entry.getValue().get());
						break;
					}
				}
			}
		}
	}
}