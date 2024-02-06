package trop;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.Collection;

@Mod("trop")
@SuppressWarnings("WeakerAccess")
public class TROP {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public static final Collection<Item> CONTENT = new ArrayList<>();

	private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("trop");
	private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "trop");

	public static final DeferredItem<Item> RING_GREAT = ITEMS.register("ring_great", TROPItemRingGreat::new);

	public static final DeferredItem<Item> RING_NARYA = ITEMS.register("ring_narya", TROPItemRingNarya::new);
	public static final DeferredItem<Item> RING_NENYA = ITEMS.register("ring_nenya", TROPItemRingNenya::new);
	public static final DeferredItem<Item> RING_VILYA = ITEMS.register("ring_vilya", TROPItemRingVilya::new);

	public static final DeferredItem<Item> RING_THROR = ITEMS.register("ring_thror", TROPItemRingDwarf::new);
	public static final DeferredItem<Item> RING_THULIN = ITEMS.register("ring_thulin", TROPItemRingDwarf::new);
	public static final DeferredItem<Item> RING_KHIBIL = ITEMS.register("ring_khibil", TROPItemRingDwarf::new);
	public static final DeferredItem<Item> RING_FARIN = ITEMS.register("ring_farin", TROPItemRingDwarf::new);
	public static final DeferredItem<Item> RING_KHAIN = ITEMS.register("ring_khain", TROPItemRingDwarf::new);
	public static final DeferredItem<Item> RING_BARAZ = ITEMS.register("ring_baraz", TROPItemRingDwarf::new);
	public static final DeferredItem<Item> RING_BURIN = ITEMS.register("ring_burin", TROPItemRingDwarf::new);
	public static final DeferredItem<Item> RING_MURAZOR = ITEMS.register("ring_murazor", TROPItemRingMan::new);
	public static final DeferredItem<Item> RING_HOARMURATH = ITEMS.register("ring_hoarmurath", TROPItemRingMan::new);
	public static final DeferredItem<Item> RING_AKHORAHIL = ITEMS.register("ring_akhorahil", TROPItemRingMan::new);
	public static final DeferredItem<Item> RING_ADUNAPHEL = ITEMS.register("ring_adunaphel", TROPItemRingMan::new);
	public static final DeferredItem<Item> RING_JIINDUR = ITEMS.register("ring_jiindur", TROPItemRingMan::new);
	public static final DeferredItem<Item> RING_KHAMUL = ITEMS.register("ring_khamul", TROPItemRingMan::new);
	public static final DeferredItem<Item> RING_UVATHA = ITEMS.register("ring_uvatha", TROPItemRingMan::new);
	public static final DeferredItem<Item> RING_REN = ITEMS.register("ring_ren", TROPItemRingMan::new);
	public static final DeferredItem<Item> RING_DWAR = ITEMS.register("ring_dwar", TROPItemRingMan::new);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB_RINGS = CREATIVE_TABS.register("rings", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.trop.rings")).icon(() -> new ItemStack(RING_NARYA.get())).displayItems((enabledFlags, populator) -> {
		for (var item : CONTENT) {
			populator.accept(item);
		}
	}).build());

	public TROP(IEventBus eventBus) {
		ITEMS.register(eventBus);
		CREATIVE_TABS.register(eventBus);
	}
}