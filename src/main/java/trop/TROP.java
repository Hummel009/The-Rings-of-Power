package trop;

import java.lang.reflect.*;
import java.util.*;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;

@Mod("trop")
public class TROP {
	public static List<RegistryObject<Item>> sus;
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
		sus = getObjectFieldsOfType(TROP.class, RegistryObject.class);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(TROPCreativeTabs::addCreativeTab);
	}

	private static <E, T> List<T> getObjectFieldsOfType(Class<? extends E> clazz, Class type) {
		ArrayList<Object> list = new ArrayList<>();
		try {
			for (Field field : clazz.getDeclaredFields()) {
				if (field == null) {
					continue;
				}
				Object fieldObj = null;
				if (Modifier.isStatic(field.getModifiers())) {
					fieldObj = field.get(null);
				}
				if (fieldObj == null || !type.isAssignableFrom(fieldObj.getClass())) {
					continue;
				}
				list.add(fieldObj);
			}
		} catch (IllegalAccessException | IllegalArgumentException e) {
		}
		return (List<T>) list;
	}
}