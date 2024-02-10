package com.github.hummel.trop.item;

import com.github.hummel.trop.init.ItemGroups;
import net.minecraft.item.Item;

public class ItemRing extends Item {
	public ItemRing() {
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(ItemGroups.TAB_RINGS);
	}
}