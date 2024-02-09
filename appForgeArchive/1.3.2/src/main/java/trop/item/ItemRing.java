package trop.item;

import net.minecraft.src.Item;
import trop.init.CreativeTabs;

public class ItemRing extends Item {
	public ItemRing(int id) {
		super(id);
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.TAB_RINGS);
	}
}