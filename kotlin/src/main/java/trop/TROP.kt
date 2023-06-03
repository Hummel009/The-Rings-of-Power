package trop

import net.minecraft.world.item.Item
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.CreativeModeTabEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import java.*
import java.util.*
import kotlin.reflect.*

@Mod("trop")
class TROP {
	init {
		ITEMS.register(FMLJavaModLoadingContext.get().modEventBus)
		MinecraftForge.EVENT_BUS.register(this)

		FMLJavaModLoadingContext.get().modEventBus.addListener { event: CreativeModeTabEvent.Register ->
			TROPCreativeTabs.addCreativeTab(event)
		}
	}

	companion object {
		var CONTENT: Set<Item> = HashSet()
		val ITEMS: DeferredRegister<Item> = DeferredRegister.create(ForgeRegistries.ITEMS, "trop")
		val RING_GREAT = ITEMS.register("ring_great") { TROPItemRingGreat() }
		val RING_NENIA = ITEMS.register("ring_nenia") { TROPItemRingNenia() }
		val RING_NARIA = ITEMS.register("ring_naria") { TROPItemRingNaria() }
		val RING_VILIA = ITEMS.register("ring_vilia") { TROPItemRingVilia() }
		val RING_THROR = ITEMS.register("ring_thror") { TROPItemRingDwarf() }
		val RING_THULIN = ITEMS.register("ring_thulin") { TROPItemRingDwarf() }
		val RING_KHIBIL = ITEMS.register("ring_khibil") { TROPItemRingDwarf() }
		val RING_FARIN = ITEMS.register("ring_farin") { TROPItemRingDwarf() }
		val RING_KHAIN = ITEMS.register("ring_khain") { TROPItemRingDwarf() }
		val RING_BARAZ = ITEMS.register("ring_baraz") { TROPItemRingDwarf() }
		val RING_BURIN = ITEMS.register("ring_burin") { TROPItemRingDwarf() }
		val RING_MURAZOR = ITEMS.register("ring_murazor") { TROPItemRingMan() }
		val RING_KHOMMURAT = ITEMS.register("ring_khommurat") { TROPItemRingMan() }
		val RING_AKHORAHIL = ITEMS.register("ring_akhorahil") { TROPItemRingMan() }
		val RING_MORGOMIR = ITEMS.register("ring_morgomir") { TROPItemRingMan() }
		val RING_JIINDUR = ITEMS.register("ring_jiindur") { TROPItemRingMan() }
		val RING_KHAMUL = ITEMS.register("ring_khamul") { TROPItemRingMan() }
		val RING_UVATA = ITEMS.register("ring_uvata") { TROPItemRingMan() }
		val RING_SAITA = ITEMS.register("ring_saita") { TROPItemRingMan() }
		val RING_DVAR = ITEMS.register("ring_dvar") { TROPItemRingMan() }
	}
}
