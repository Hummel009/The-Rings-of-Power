package trop;

import net.minecraft.item.*;

public class TROPCreativeTabs {
	public static final ItemGroup TAB_RINGS = new ItemGroup("ringPower") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(TROP.RING_BARAZ.get());
		}
	};
}
