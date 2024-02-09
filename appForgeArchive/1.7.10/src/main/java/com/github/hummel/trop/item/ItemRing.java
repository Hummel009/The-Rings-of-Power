package com.github.hummel.trop.item;

import net.minecraft.item.Item;
import com.github.hummel.trop.init.CreativeTabs;

public class ItemRing extends Item {
	public ItemRing() {
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.TAB_RINGS);
	}
}