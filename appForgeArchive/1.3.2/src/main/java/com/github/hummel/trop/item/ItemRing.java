package com.github.hummel.trop.item;

import com.github.hummel.trop.init.ItemGroups;
import net.minecraft.src.Item;

public class ItemRing extends Item {
	public ItemRing(int id) {
		super(id);
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(ItemGroups.TAB_RINGS);
	}
}