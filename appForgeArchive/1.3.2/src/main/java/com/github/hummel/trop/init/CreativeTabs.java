package com.github.hummel.trop.init;

import net.minecraft.src.Item;

public class CreativeTabs {
	public static final net.minecraft.src.CreativeTabs TAB_RINGS = new net.minecraft.src.CreativeTabs("trop.rings") {
		@Override
		public Item getTabIconItem() {
			return Items.ringNarya;
		}
	};

	private CreativeTabs() {
	}
}