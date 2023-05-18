package trop

import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters
import net.minecraft.world.item.ItemStack
import net.minecraftforge.event.CreativeModeTabEvent.Register
import net.minecraftforge.eventbus.api.SubscribeEvent

object TROPCreativeTabs {
    @SubscribeEvent
    fun addCreativeTab(event: Register) {
        event.registerCreativeModeTab(
            ResourceLocation("trop", "troptab")
        ) { builder: CreativeModeTab.Builder ->
            builder.title(Component.translatable("itemGroup.ringPower")).icon {
                ItemStack(
                    TROP.ring_jiindur.get()
                )
            }.displayItems { _: ItemDisplayParameters?, populator: CreativeModeTab.Output ->
                for (item in TROP.itemList) {
                    populator.accept(item)
                }
            }
        }
    }
}

