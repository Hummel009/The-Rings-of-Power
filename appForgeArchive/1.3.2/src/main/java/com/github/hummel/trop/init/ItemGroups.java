package com.github.hummel.trop.init;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemGroups {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("trop.rings") {
		@Override
		public Item getTabIconItem() {
			return Items.ringNarya;
		}
	};

	private ItemGroups() {
	}
}