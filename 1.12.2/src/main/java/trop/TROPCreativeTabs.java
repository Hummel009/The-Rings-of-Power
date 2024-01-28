package trop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("ringPower") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(TROP.ringNarya);
		}
	};

	private TROPCreativeTabs() {
	}
}
