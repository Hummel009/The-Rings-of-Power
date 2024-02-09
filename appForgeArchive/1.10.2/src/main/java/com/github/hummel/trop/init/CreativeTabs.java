package com.github.hummel.trop.init;

import net.minecraft.item.Item;

public class CreativeTabs {
	public static final net.minecraft.creativetab.CreativeTabs TAB_RINGS = new net.minecraft.creativetab.CreativeTabs("trop.rings") {
		@Override
		public Item getTabIconItem() {
			return Items.ringNarya;
		}
	};

	private CreativeTabs() {
	}
}