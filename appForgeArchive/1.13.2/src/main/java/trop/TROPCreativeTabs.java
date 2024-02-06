package trop;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs {
	public static final ItemGroup TAB_RINGS = new ItemGroup("trop.rings") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(TROP.ringNarya);
		}
	};

	private TROPCreativeTabs() {
	}
}
