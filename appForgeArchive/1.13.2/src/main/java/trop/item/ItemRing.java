package trop.item;

import net.minecraft.item.Item;
import trop.init.CreativeTabs;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().defaultMaxDamage(0).group(CreativeTabs.TAB_RINGS));
	}
}
