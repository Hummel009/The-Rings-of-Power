package com.github.hummel.trop.item;

import com.github.hummel.trop.init.CreativeTabs;
import net.minecraft.src.Item;

public class ItemRing extends Item {
	public ItemRing(int id) {
		super(id);
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.TAB_RINGS);
	}
}