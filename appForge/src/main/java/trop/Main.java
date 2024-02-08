package trop;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import trop.handler.ForgeEventHandler;
import trop.item.*;

import java.util.ArrayList;
import java.util.Collection;

@Mod("trop")
@SuppressWarnings("WeakerAccess")
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public static final Collection<Item> CONTENT = new ArrayList<>();

	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "trop");
	private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "trop");

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

	public static final RegistryObject<CreativeModeTab> TAB_RINGS = CREATIVE_TABS.register("rings", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.trop.rings")).icon(() -> new ItemStack(RING_NARYA.get())).displayItems((enabledFlags, populator) -> {
		for (var item : CONTENT) {
			populator.accept(item);
		}
	}).build());

	public Main() {
		var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ITEMS.register(modEventBus);
		CREATIVE_TABS.register(modEventBus);

		var forgeEventBus = MinecraftForge.EVENT_BUS;
		var forgeEventHandler = new ForgeEventHandler();
		forgeEventBus.register(forgeEventHandler);
	}
}