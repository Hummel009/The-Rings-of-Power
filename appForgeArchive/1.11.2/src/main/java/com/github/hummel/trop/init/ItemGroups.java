package com.github.hummel.trop.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemGroups {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("trop.rings") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.ringNarya);
		}
	};

	private ItemGroups() {
	}
}