package com.github.hummel.trop.item;

import net.minecraft.world.item.Item;
import com.github.hummel.trop.init.CreativeTabs;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().durability(0).tab(CreativeTabs.TAB_RINGS));
	}
}
