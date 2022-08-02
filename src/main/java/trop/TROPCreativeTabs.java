package trop;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs {
	public static ItemGroup tabRing = new ItemGroup("ringPower") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(TROP.ring_baraz.get());
		}
	};
}
