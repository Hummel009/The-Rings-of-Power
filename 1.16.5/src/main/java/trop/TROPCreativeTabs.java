package trop;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs {
	public static final ItemGroup TAB_RINGS = new ItemGroup("ringPower") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(TROP.RING_NARYA.get());
		}
	};

	private TROPCreativeTabs() {
	}
}
