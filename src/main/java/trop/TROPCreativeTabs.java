package trop;

import net.minecraft.world.item.*;

public class TROPCreativeTabs {
	public static CreativeModeTab tabRing = new CreativeModeTab("ringPower") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(TROP.ring_baraz);
		}
	};
}
