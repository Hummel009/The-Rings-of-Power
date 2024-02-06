package trop;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("WeakerAccess")
public class TROP implements ModInitializer {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public static final Collection<Item> CONTENT = new ArrayList<>();

	public static final Item RING_GREAT = new TROPItemRingGreat();

	public static final Item RING_NARYA = new TROPItemRingNarya();
	public static final Item RING_NENYA = new TROPItemRingNenya();
	public static final Item RING_VILYA = new TROPItemRingVilya();

	public static final Item RING_THROR = new TROPItemRingDwarf();
	public static final Item RING_THULIN = new TROPItemRingDwarf();
	public static final Item RING_KHIBIL = new TROPItemRingDwarf();
	public static final Item RING_FARIN = new TROPItemRingDwarf();
	public static final Item RING_KHAIN = new TROPItemRingDwarf();
	public static final Item RING_BARAZ = new TROPItemRingDwarf();
	public static final Item RING_BURIN = new TROPItemRingDwarf();
	public static final Item RING_MURAZOR = new TROPItemRingMan();
	public static final Item RING_HOARMURATH = new TROPItemRingMan();
	public static final Item RING_AKHORAHIL = new TROPItemRingMan();
	public static final Item RING_ADUNAPHEL = new TROPItemRingMan();
	public static final Item RING_JIINDUR = new TROPItemRingMan();
	public static final Item RING_KHAMUL = new TROPItemRingMan();
	public static final Item RING_UVATHA = new TROPItemRingMan();
	public static final Item RING_REN = new TROPItemRingMan();
	public static final Item RING_DWAR = new TROPItemRingMan();

	private static final CreativeModeTab TAB_RINGS = FabricItemGroup.builder().icon(() -> new ItemStack(RING_NARYA)).title(Component.translatable("itemGroup.trop.rings")).displayItems((context, populator) -> {
		for (var item : CONTENT) {
			populator.accept(item);
		}
	}).build();

	private static void register(Item item, String name) {
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("trop", name), item);
	}

	@Override
	public void onInitialize() {
		register(RING_GREAT, "ring_great");

		register(RING_NARYA, "ring_narya");
		register(RING_NENYA, "ring_nenya");
		register(RING_VILYA, "ring_vilya");

		register(RING_THROR, "ring_thror");
		register(RING_THULIN, "ring_thulin");
		register(RING_KHIBIL, "ring_khibil");
		register(RING_FARIN, "ring_farin");
		register(RING_KHAIN, "ring_khain");
		register(RING_BARAZ, "ring_baraz");
		register(RING_BURIN, "ring_burin");
		register(RING_MURAZOR, "ring_murazor");
		register(RING_HOARMURATH, "ring_hoarmurath");
		register(RING_AKHORAHIL, "ring_akhorahil");
		register(RING_ADUNAPHEL, "ring_adunaphel");
		register(RING_JIINDUR, "ring_jiindur");
		register(RING_KHAMUL, "ring_khamul");
		register(RING_UVATHA, "ring_uvatha");
		register(RING_REN, "ring_ren");
		register(RING_DWAR, "ring_dwar");

		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation("trop", "rings"), TAB_RINGS);
	}
}