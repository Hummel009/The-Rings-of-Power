package trop;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TROPCreativeTabs {
	public static final CreativeModeTab TAB_RINGS = new CreativeModeTab("ringPower") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(TROP.RING_NARYA.get());
		}
	};

	private TROPCreativeTabs() {
	}
}
