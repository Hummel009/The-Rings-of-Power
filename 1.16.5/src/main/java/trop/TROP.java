package trop;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;

@Mod("trop")
public class TROP {
	public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "trop");
	public static RegistryObject<Item> ring_great = ITEMS.register("ring_great", TROPItemRingGreat::new);
	public static RegistryObject<Item> ring_nenia = ITEMS.register("ring_nenia", TROPItemRingNenia::new);
	public static RegistryObject<Item> ring_naria = ITEMS.register("ring_naria", TROPItemRingNaria::new);
	public static RegistryObject<Item> ring_vilia = ITEMS.register("ring_vilia", TROPItemRingVilia::new);
	public static RegistryObject<Item> ring_thror = ITEMS.register("ring_thror", TROPItemRingDwarf::new);
	public static RegistryObject<Item> ring_thulin = ITEMS.register("ring_thulin", TROPItemRingDwarf::new);
	public static RegistryObject<Item> ring_khibil = ITEMS.register("ring_khibil", TROPItemRingDwarf::new);
	public static RegistryObject<Item> ring_farin = ITEMS.register("ring_farin", TROPItemRingDwarf::new);
	public static RegistryObject<Item> ring_khain = ITEMS.register("ring_khain", TROPItemRingDwarf::new);
	public static RegistryObject<Item> ring_baraz = ITEMS.register("ring_baraz", TROPItemRingDwarf::new);
	public static RegistryObject<Item> ring_burin = ITEMS.register("ring_burin", TROPItemRingDwarf::new);
	public static RegistryObject<Item> ring_murazor = ITEMS.register("ring_murazor", TROPItemRingMan::new);
	public static RegistryObject<Item> ring_khommurat = ITEMS.register("ring_khommurat", TROPItemRingMan::new);
	public static RegistryObject<Item> ring_akhorahil = ITEMS.register("ring_akhorahil", TROPItemRingMan::new);
	public static RegistryObject<Item> ring_morgomir = ITEMS.register("ring_morgomir", TROPItemRingMan::new);
	public static RegistryObject<Item> ring_jiindur = ITEMS.register("ring_jiindur", TROPItemRingMan::new);
	public static RegistryObject<Item> ring_khamul = ITEMS.register("ring_khamul", TROPItemRingMan::new);
	public static RegistryObject<Item> ring_uvata = ITEMS.register("ring_uvata", TROPItemRingMan::new);
	public static RegistryObject<Item> ring_saita = ITEMS.register("ring_saita", TROPItemRingMan::new);
	public static RegistryObject<Item> ring_dvar = ITEMS.register("ring_dvar", TROPItemRingMan::new);

	public TROP() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		MinecraftForge.EVENT_BUS.register(this);
	}
}