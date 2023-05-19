package trop;

import java.util.ArrayList;
import java.util.Objects;

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

	public static Item ring_great;
	public static Item ring_naria;
	public static Item ring_nenia;
	public static Item ring_vilia;
	public static Item ring_thror;
	public static Item ring_thulin;
	public static Item ring_khibil;
	public static Item ring_farin;
	public static Item ring_khain;
	public static Item ring_baraz;
	public static Item ring_burin;
	public static Item ring_murazor;
	public static Item ring_khommurat;
	public static Item ring_akhorahil;
	public static Item ring_morgomir;
	public static Item ring_jiindur;
	public static Item ring_khamul;
	public static Item ring_uvata;
	public static Item ring_saita;
	public static Item ring_dvar;

	@ObjectHolder("trop")
	@Mod.EventBusSubscriber
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onRegistryItem(RegistryEvent.Register<Item> event) {
			ring_great = new TROPItemRingGreat();
			ring_naria = new TROPItemRingNaria();
			ring_nenia = new TROPItemRingNenia();
			ring_vilia = new TROPItemRingVilia();
			ring_thror = new TROPItemRingDwarf();
			ring_thulin = new TROPItemRingDwarf();
			ring_khibil = new TROPItemRingDwarf();
			ring_farin = new TROPItemRingDwarf();
			ring_khain = new TROPItemRingDwarf();
			ring_baraz = new TROPItemRingDwarf();
			ring_burin = new TROPItemRingDwarf();
			ring_murazor = new TROPItemRingMan();
			ring_khommurat = new TROPItemRingMan();
			ring_akhorahil = new TROPItemRingMan();
			ring_morgomir = new TROPItemRingMan();
			ring_jiindur = new TROPItemRingMan();
			ring_khamul = new TROPItemRingMan();
			ring_uvata = new TROPItemRingMan();
			ring_saita = new TROPItemRingMan();
			ring_dvar = new TROPItemRingMan();

			register(ring_great, "ring_great");
			register(ring_naria, "ring_naria");
			register(ring_nenia, "ring_nenia");
			register(ring_vilia, "ring_vilia");
			register(ring_thror, "ring_thror");
			register(ring_thulin, "ring_thulin");
			register(ring_khibil, "ring_khibil");
			register(ring_farin, "ring_farin");
			register(ring_khain, "ring_khain");
			register(ring_baraz, "ring_baraz");
			register(ring_burin, "ring_burin");
			register(ring_murazor, "ring_murazor");
			register(ring_khommurat, "ring_khommurat");
			register(ring_akhorahil, "ring_akhorahil");
			register(ring_morgomir, "ring_morgomir");
			register(ring_jiindur, "ring_jiindur");
			register(ring_khamul, "ring_khamul");
			register(ring_uvata, "ring_uvata");
			register(ring_saita, "ring_saita");
			register(ring_dvar, "ring_dvar");
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

		public static void register(Item item, String name) {
			CONTENT.add(item);
			item.setRegistryName(name);
			item.setUnlocalizedName(name);
			item.setMaxDamage(0);
			item.setMaxStackSize(1);
			item.setCreativeTab(TROPCreativeTabs.tabRing);
			ForgeRegistries.ITEMS.register(item);
		}
	}
}