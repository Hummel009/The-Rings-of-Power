package com.github.hummel.trop.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {
	public static final ItemGroup TAB_RINGS = new ItemGroup("trop.rings") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.RING_NARYA.get());
		}
	};

	private ItemGroups() {
	}
}