package trop;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TROPCreativeTabs {
	public static final CreativeModeTab tabRing = new CreativeModeTab("ringPower") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(TROP.ring_baraz.get());
		}
	};
}
