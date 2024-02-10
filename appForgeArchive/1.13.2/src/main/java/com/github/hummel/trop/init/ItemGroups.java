package com.github.hummel.trop.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {
	public static final ItemGroup TAB_RINGS = new ItemGroup("trop.rings") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Items.ringNarya);
		}
	};

	private ItemGroups() {
	}
}