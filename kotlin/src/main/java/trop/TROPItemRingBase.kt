package trop

import net.minecraft.world.item.Item

open class TROPItemRingBase : Item(Properties().durability(0)) {
    init {
        initialize()
    }

    private fun initialize() {
        TROP.itemList.add(this)
    }
}
