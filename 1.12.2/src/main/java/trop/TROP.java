package trop;

import java.util.ArrayList;
import java.util.Objects;

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

@Mod(modid = "trop")
public class TROP {
	public static final ArrayList<Item> CONTENT = new ArrayList<>();

	public static Item ringGreat;
	public static Item ringNaria;
	public static Item ringNenia;
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

	@ObjectHolder("trop")
	@Mod.EventBusSubscriber
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onRegistryItem(RegistryEvent.Register<Item> event) {
			ringGreat = new TROPItemRingGreat();
			ringNaria = new TROPItemRingNaria();
			ringNenia = new TROPItemRingNenia();
			ringVilia = new TROPItemRingVilia();
			ringThror = new TROPItemRingDwarf();
			ringThulin = new TROPItemRingDwarf();
			ringKhibil = new TROPItemRingDwarf();
			ringFarin = new TROPItemRingDwarf();
			ringKhain = new TROPItemRingDwarf();
			ringBaraz = new TROPItemRingDwarf();
			ringBurin = new TROPItemRingDwarf();
			ringMurazor = new TROPItemRingMan();
			ringKhommurat = new TROPItemRingMan();
			ringAkhorahil = new TROPItemRingMan();
			ringMorgomir = new TROPItemRingMan();
			ringJiindur = new TROPItemRingMan();
			ringKhamul = new TROPItemRingMan();
			ringUvata = new TROPItemRingMan();
			ringSaita = new TROPItemRingMan();
			ringDvar = new TROPItemRingMan();

			register(ringGreat, "ringGreat");
			register(ringNaria, "ringNaria");
			register(ringNenia, "ringNenia");
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
			CONTENT.add(item);
			String name = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field);
			item.setUnlocalizedName(name);
			item.setRegistryName(name);
			item.setUnlocalizedName(name);
			item.setMaxDamage(0);
			item.setMaxStackSize(1);
			item.setCreativeTab(TROPCreativeTabs.tabRing);
			ForgeRegistries.ITEMS.register(item);
		}
	}
}