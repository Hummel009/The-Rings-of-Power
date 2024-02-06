package trop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("trop.rings") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(TROP.ringNarya);
		}
	};

	private TROPCreativeTabs() {
	}
}
