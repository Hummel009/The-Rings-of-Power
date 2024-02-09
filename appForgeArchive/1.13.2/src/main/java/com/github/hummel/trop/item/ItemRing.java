package com.github.hummel.trop.item;

import net.minecraft.item.Item;
import com.github.hummel.trop.init.CreativeTabs;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().defaultMaxDamage(0).group(CreativeTabs.TAB_RINGS));
	}
}
