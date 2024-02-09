package trop.init;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import trop.item.*;

@SuppressWarnings("WeakerAccess")
public class Items {
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "trop");

	public static final RegistryObject<Item> RING_GREAT = ITEMS.register("ring_great", ItemRingGreat::new);

	public static final RegistryObject<Item> RING_NARYA = ITEMS.register("ring_narya", ItemRingNarya::new);
	public static final RegistryObject<Item> RING_NENYA = ITEMS.register("ring_nenya", ItemRingNenya::new);
	public static final RegistryObject<Item> RING_VILYA = ITEMS.register("ring_vilya", ItemRingVilya::new);

	public static final RegistryObject<Item> RING_THROR = ITEMS.register("ring_thror", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_THULIN = ITEMS.register("ring_thulin", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_KHIBIL = ITEMS.register("ring_khibil", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_FARIN = ITEMS.register("ring_farin", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_KHAIN = ITEMS.register("ring_khain", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_BARAZ = ITEMS.register("ring_baraz", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_BURIN = ITEMS.register("ring_burin", ItemRingDwarf::new);
	public static final RegistryObject<Item> RING_MURAZOR = ITEMS.register("ring_murazor", ItemRingMan::new);
	public static final RegistryObject<Item> RING_HOARMURATH = ITEMS.register("ring_hoarmurath", ItemRingMan::new);
	public static final RegistryObject<Item> RING_AKHORAHIL = ITEMS.register("ring_akhorahil", ItemRingMan::new);
	public static final RegistryObject<Item> RING_ADUNAPHEL = ITEMS.register("ring_adunaphel", ItemRingMan::new);
	public static final RegistryObject<Item> RING_JIINDUR = ITEMS.register("ring_jiindur", ItemRingMan::new);
	public static final RegistryObject<Item> RING_KHAMUL = ITEMS.register("ring_khamul", ItemRingMan::new);
	public static final RegistryObject<Item> RING_UVATHA = ITEMS.register("ring_uvatha", ItemRingMan::new);
	public static final RegistryObject<Item> RING_REN = ITEMS.register("ring_ren", ItemRingMan::new);
	public static final RegistryObject<Item> RING_DWAR = ITEMS.register("ring_dwar", ItemRingMan::new);

	private Items() {
	}

	public static void register(IEventBus modEventBus) {
		ITEMS.register(modEventBus);
	}
}
