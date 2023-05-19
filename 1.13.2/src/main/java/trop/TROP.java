package trop;

import com.google.common.base.CaseFormat;
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
	public static Item ringGreat;
	public static Item ringNenia;
	public static Item ringNaria;
	public static Item ringVilia;
	public static Item ringThror;
	public static Item ringThulin;
	public static Item ringKhibil;
	public static Item ringFarin;
	public static Item ringKhain;
	public static Item ringBaraz;
	public static Item ringBurin;
	public static Item ringMurazor;
	public static Item ringKhommurat;
	public static Item ringAkhorahil;
	public static Item ringMorgomir;
	public static Item ringJiindur;
	public static Item ringKhamul;
	public static Item ringUvata;
	public static Item ringSaita;
	public static Item ringDvar;

	public TROP() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onItemsRegistry(RegistryEvent.Register<Item> event) {
			Properties prop = new Properties();
			prop.group(TROPCreativeTabs.tabRing);
			prop.defaultMaxDamage(0);
			prop.maxStackSize(0);
			ringGreat = new TROPItemRingGreat(prop);
			ringNenia = new TROPItemRingNenia(prop);
			ringNaria = new TROPItemRingNaria(prop);
			ringVilia = new TROPItemRingVilia(prop);
			ringThror = new TROPItemRingDwarf(prop);
			ringThulin = new TROPItemRingDwarf(prop);
			ringKhibil = new TROPItemRingDwarf(prop);
			ringFarin = new TROPItemRingDwarf(prop);
			ringKhain = new TROPItemRingDwarf(prop);
			ringBaraz = new TROPItemRingDwarf(prop);
			ringBurin = new TROPItemRingDwarf(prop);
			ringMurazor = new TROPItemRingMan(prop);
			ringKhommurat = new TROPItemRingMan(prop);
			ringAkhorahil = new TROPItemRingMan(prop);
			ringMorgomir = new TROPItemRingMan(prop);
			ringJiindur = new TROPItemRingMan(prop);
			ringKhamul = new TROPItemRingMan(prop);
			ringUvata = new TROPItemRingMan(prop);
			ringSaita = new TROPItemRingMan(prop);
			ringDvar = new TROPItemRingMan(prop);

			register(ringGreat, "ringGreat");
			register(ringNenia, "ringNenia");
			register(ringNaria, "ringNaria");
			register(ringVilia, "ringVilia");
			register(ringThror, "ringThror");
			register(ringThulin, "ringThulin");
			register(ringKhibil, "ringKhibil");
			register(ringFarin, "ringFarin");
			register(ringKhain, "ringKhain");
			register(ringBaraz, "ringBaraz");
			register(ringBurin, "ringBurin");
			register(ringMurazor, "ringMurazor");
			register(ringKhommurat, "ringKhommurat");
			register(ringAkhorahil, "ringAkhorahil");
			register(ringMorgomir, "ringMorgomir");
			register(ringJiindur, "ringJiindur");
			register(ringKhamul, "ringKhamul");
			register(ringUvata, "ringUvata");
			register(ringSaita, "ringSaita");
			register(ringDvar, "ringDvar");

		}

		public static void register(Item item, String field) {
			String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
			ForgeRegistries.ITEMS.register(item.setRegistryName(name));
		}
	}
}