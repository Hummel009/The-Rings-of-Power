package trop.item;

import net.minecraft.item.Item;
import trop.init.CreativeTabs;

public class ItemRingBase extends Item {
	public ItemRingBase() {
		super(new Properties().defaultMaxDamage(0).group(CreativeTabs.tabRings));
	}
}
