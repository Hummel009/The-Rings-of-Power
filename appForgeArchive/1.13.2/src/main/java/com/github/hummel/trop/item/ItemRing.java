package com.github.hummel.trop.item;

import com.github.hummel.trop.init.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().defaultMaxDamage(0).group(CreativeTabs.TAB_RINGS));
	}
}
