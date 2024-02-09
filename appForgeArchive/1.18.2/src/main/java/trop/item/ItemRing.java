package trop.item;

import net.minecraft.world.item.Item;
import trop.init.CreativeTabs;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().durability(0).tab(CreativeTabs.TAB_RINGS));
	}
}
