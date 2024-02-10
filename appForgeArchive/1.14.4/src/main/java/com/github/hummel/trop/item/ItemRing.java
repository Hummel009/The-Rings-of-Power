package com.github.hummel.trop.item;

import com.github.hummel.trop.init.ItemGroups;
import net.minecraft.item.Item;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().durability(0).tab(ItemGroups.TAB_RINGS));
	}
}
