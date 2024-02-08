package trop.item;

import net.minecraft.src.Item;
import trop.init.CreativeTabs;

public class ItemRingBase extends Item {
	public ItemRingBase(int id) {
		super(id);
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabRings);
	}
}