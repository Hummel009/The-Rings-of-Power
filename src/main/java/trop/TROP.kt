package trop

import net.minecraft.world.item.Item
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.CreativeModeTabEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
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
        var sus = ArrayList<Item>()
        val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "trop")
        val ring_great: RegistryObject<Item> = ITEMS.register("ring_great") { TROPItemRingGreat() }
        val ring_nenia: RegistryObject<Item> = ITEMS.register("ring_nenia") { TROPItemRingNenia() }
        val ring_naria: RegistryObject<Item> = ITEMS.register("ring_naria") { TROPItemRingNaria() }
        val ring_vilia: RegistryObject<Item> = ITEMS.register("ring_vilia") { TROPItemRingVilia() }
        val ring_thror: RegistryObject<Item> = ITEMS.register("ring_thror") { TROPItemRingDwarf() }
        val ring_thulin: RegistryObject<Item> = ITEMS.register("ring_thulin") { TROPItemRingDwarf() }
        val ring_khibil: RegistryObject<Item> = ITEMS.register("ring_khibil") { TROPItemRingDwarf() }
        val ring_farin: RegistryObject<Item> = ITEMS.register("ring_farin") { TROPItemRingDwarf() }
        val ring_khain: RegistryObject<Item> = ITEMS.register("ring_khain") { TROPItemRingDwarf() }
        val ring_baraz: RegistryObject<Item> = ITEMS.register("ring_baraz") { TROPItemRingDwarf() }
        val ring_burin: RegistryObject<Item> = ITEMS.register("ring_burin") { TROPItemRingDwarf() }
        val ring_murazor: RegistryObject<Item> = ITEMS.register("ring_murazor") { TROPItemRingMan() }
        val ring_khommurat: RegistryObject<Item> = ITEMS.register("ring_khommurat") { TROPItemRingMan() }
        val ring_akhorahil: RegistryObject<Item> = ITEMS.register("ring_akhorahil") { TROPItemRingMan() }
        val ring_morgomir: RegistryObject<Item> = ITEMS.register("ring_morgomir") { TROPItemRingMan() }
        val ring_jiindur: RegistryObject<Item> = ITEMS.register("ring_jiindur") { TROPItemRingMan() }
        val ring_khamul: RegistryObject<Item> = ITEMS.register("ring_khamul") { TROPItemRingMan() }
        val ring_uvata: RegistryObject<Item> = ITEMS.register("ring_uvata") { TROPItemRingMan() }
        val ring_saita: RegistryObject<Item> = ITEMS.register("ring_saita") { TROPItemRingMan() }
        val ring_dvar: RegistryObject<Item> = ITEMS.register("ring_dvar") { TROPItemRingMan() }
    }
}
