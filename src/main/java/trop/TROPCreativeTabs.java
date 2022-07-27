package trop;

import net.minecraft.item.*;

public class TROPCreativeTabs {
	public static ItemGroup tabRing = new ItemGroup("ringPower") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(TROP.ring_baraz);
		}
	};
}
