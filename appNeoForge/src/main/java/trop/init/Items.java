package trop.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import trop.item.*;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("WeakerAccess")
public class Items {
	public static final Collection<Item> CONTENT = new ArrayList<>();

	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, "trop");

	public static final DeferredHolder<Item, Item> RING_GREAT = ITEMS.register("ring_great", ItemRingGreat::new);

	public static final DeferredHolder<Item, Item> RING_NARYA = ITEMS.register("ring_narya", ItemRingNarya::new);
	public static final DeferredHolder<Item, Item> RING_NENYA = ITEMS.register("ring_nenya", ItemRingNenya::new);
	public static final DeferredHolder<Item, Item> RING_VILYA = ITEMS.register("ring_vilya", ItemRingVilya::new);

	public static final DeferredHolder<Item, Item> RING_THROR = ITEMS.register("ring_thror", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_THULIN = ITEMS.register("ring_thulin", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_KHIBIL = ITEMS.register("ring_khibil", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_FARIN = ITEMS.register("ring_farin", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_KHAIN = ITEMS.register("ring_khain", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_BARAZ = ITEMS.register("ring_baraz", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_BURIN = ITEMS.register("ring_burin", ItemRingDwarf::new);
	public static final DeferredHolder<Item, Item> RING_MURAZOR = ITEMS.register("ring_murazor", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_HOARMURATH = ITEMS.register("ring_hoarmurath", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_AKHORAHIL = ITEMS.register("ring_akhorahil", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_ADUNAPHEL = ITEMS.register("ring_adunaphel", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_JIINDUR = ITEMS.register("ring_jiindur", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_KHAMUL = ITEMS.register("ring_khamul", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_UVATHA = ITEMS.register("ring_uvatha", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_REN = ITEMS.register("ring_ren", ItemRingMan::new);
	public static final DeferredHolder<Item, Item> RING_DWAR = ITEMS.register("ring_dwar", ItemRingMan::new);

	private Items() {
	}

	public static void register(IEventBus modEventBus) {
		ITEMS.register(modEventBus);
	}
}
