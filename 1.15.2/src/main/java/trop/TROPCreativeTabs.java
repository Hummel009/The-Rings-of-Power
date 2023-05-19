package trop;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs {
	public static final ItemGroup tabRing = new ItemGroup("ringPower") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(TROP.RING_BARAZ.get());
		}
	};
}
