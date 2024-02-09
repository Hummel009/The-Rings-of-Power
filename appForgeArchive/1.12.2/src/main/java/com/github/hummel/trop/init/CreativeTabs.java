package com.github.hummel.trop.init;

import net.minecraft.item.ItemStack;

public class CreativeTabs {
	public static final net.minecraft.creativetab.CreativeTabs TAB_RINGS = new net.minecraft.creativetab.CreativeTabs("trop.rings") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Items.ringNarya);
		}
	};

	private CreativeTabs() {
	}
}