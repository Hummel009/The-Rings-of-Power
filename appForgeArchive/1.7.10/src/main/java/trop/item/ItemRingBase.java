package trop.item;

import net.minecraft.item.Item;
import trop.init.CreativeTabs;

public class ItemRingBase extends Item {
	public ItemRingBase() {
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabRings);
	}
}