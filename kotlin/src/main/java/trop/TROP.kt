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
		var CONTENT = ArrayList<Item>()
		val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "trop")
		val ring_great = ITEMS.register("ring_great") { TROPItemRingGreat() }
		val ring_nenia = ITEMS.register("ring_nenia") { TROPItemRingNenia() }
		val ring_naria = ITEMS.register("ring_naria") { TROPItemRingNaria() }
		val ring_vilia = ITEMS.register("ring_vilia") { TROPItemRingVilia() }
		val ring_thror = ITEMS.register("ring_thror") { TROPItemRingDwarf() }
		val ring_thulin = ITEMS.register("ring_thulin") { TROPItemRingDwarf() }
		val ring_khibil = ITEMS.register("ring_khibil") { TROPItemRingDwarf() }
		val ring_farin = ITEMS.register("ring_farin") { TROPItemRingDwarf() }
		val ring_khain = ITEMS.register("ring_khain") { TROPItemRingDwarf() }
		val ring_baraz = ITEMS.register("ring_baraz") { TROPItemRingDwarf() }
		val ring_burin = ITEMS.register("ring_burin") { TROPItemRingDwarf() }
		val ring_murazor = ITEMS.register("ring_murazor") { TROPItemRingMan() }
		val ring_khommurat = ITEMS.register("ring_khommurat") { TROPItemRingMan() }
		val ring_akhorahil = ITEMS.register("ring_akhorahil") { TROPItemRingMan() }
		val ring_morgomir = ITEMS.register("ring_morgomir") { TROPItemRingMan() }
		val ring_jiindur = ITEMS.register("ring_jiindur") { TROPItemRingMan() }
		val ring_khamul = ITEMS.register("ring_khamul") { TROPItemRingMan() }
		val ring_uvata = ITEMS.register("ring_uvata") { TROPItemRingMan() }
		val ring_saita = ITEMS.register("ring_saita") { TROPItemRingMan() }
		val ring_dvar = ITEMS.register("ring_dvar") { TROPItemRingMan() }
	}
}
