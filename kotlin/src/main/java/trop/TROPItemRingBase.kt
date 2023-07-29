package trop

import net.minecraft.world.item.Item

open class TROPItemRingBase : Item(Properties().durability(0)) {
	init {
		initialize()
	}

	private fun initialize() {
		TROP.CONTENT.add(this)
	}
}
