package trop.item;

import net.minecraft.item.Item;
import trop.init.CreativeTabs;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().durability(0).tab(CreativeTabs.tabRings));
	}
}
