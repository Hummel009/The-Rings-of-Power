package com.github.hummel.trop.item;

import com.github.hummel.trop.init.Items;
import net.minecraft.world.item.Item;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().durability(0));
		Items.CONTENT.add(this);
	}
}
