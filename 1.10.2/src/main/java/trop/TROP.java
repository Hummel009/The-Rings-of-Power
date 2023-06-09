package trop;

import com.google.common.base.CaseFormat;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Mod(modid = "trop")
public class TROP {
	public static final Set<Item> CONTENT = new HashSet<>();

	public static Item ringGreat;

	public static Item ringNarya;
	public static Item ringNenya;
	public static Item ringVilya;

	public static Item ringThror;
	public static Item ringThulin;
	public static Item ringKhibil;
	public static Item ringFarin;
	public static Item ringKhain;
	public static Item ringBaraz;
	public static Item ringBurin;

	public static Item ringMurazor;
	public static Item ringHoarmurath;
	public static Item ringAkhorahil;
	public static Item ringAdunaphel;
	public static Item ringJiindur;
	public static Item ringKhamul;
	public static Item ringUvatha;
	public static Item ringRen;
	public static Item ringDwar;

	@ObjectHolder("trop")
	@Mod.EventBusSubscriber
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onRegistryItem(RegistryEvent.Register<Item> event) {
			ringGreat = new TROPItemRingGreat();

			ringNarya = new TROPItemRingNarya();
			ringNenya = new TROPItemRingNenya();
			ringVilya = new TROPItemRingVilya();

			ringThror = new TROPItemRingDwarf();
			ringThulin = new TROPItemRingDwarf();
			ringKhibil = new TROPItemRingDwarf();
			ringFarin = new TROPItemRingDwarf();
			ringKhain = new TROPItemRingDwarf();
			ringBaraz = new TROPItemRingDwarf();
			ringBurin = new TROPItemRingDwarf();

			ringMurazor = new TROPItemRingMan();
			ringHoarmurath = new TROPItemRingMan();
			ringAkhorahil = new TROPItemRingMan();
			ringAdunaphel = new TROPItemRingMan();
			ringJiindur = new TROPItemRingMan();
			ringKhamul = new TROPItemRingMan();
			ringUvatha = new TROPItemRingMan();
			ringRen = new TROPItemRingMan();
			ringDwar = new TROPItemRingMan();

			register(ringGreat, "ringGreat");

			register(ringNarya, "ringNarya");
			register(ringNenya, "ringNenya");
			register(ringVilya, "ringVilya");

			register(ringThror, "ringThror");
			register(ringThulin, "ringThulin");
			register(ringKhibil, "ringKhibil");
			register(ringFarin, "ringFarin");
			register(ringKhain, "ringKhain");
			register(ringBaraz, "ringBaraz");
			register(ringBurin, "ringBurin");

			register(ringMurazor, "ringMurazor");
			register(ringHoarmurath, "ringHoarmurath");
			register(ringAkhorahil, "ringAkhorahil");
			register(ringAdunaphel, "ringAdunaphel");
			register(ringJiindur, "ringJiindur");
			register(ringKhamul, "ringKhamul");
			register(ringUvatha, "ringUvatha");
			register(ringRen, "ringRen");
			register(ringDwar, "ringDwar");
		}

		@SubscribeEvent
		@SideOnly(Side.CLIENT)
		public static void onRegistryModel(ModelRegistryEvent event) {
			for (Item item : CONTENT) {
				ResourceLocation regName = item.getRegistryName();
				ModelResourceLocation mrl = new ModelResourceLocation(Objects.requireNonNull(regName), "inventory");
				ModelBakery.registerItemVariants(item, mrl);
				ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
			}
		}

		public static void register(Item item, String field) {
			String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
			item.setRegistryName(name);
			item.setUnlocalizedName(name);
			item.setMaxDamage(0);
			item.setMaxStackSize(1);
			item.setCreativeTab(TROPCreativeTabs.TAB_RINGS);
			ForgeRegistries.ITEMS.register(item);
			CONTENT.add(item);
		}
	}
}