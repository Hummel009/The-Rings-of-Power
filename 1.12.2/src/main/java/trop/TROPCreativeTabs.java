package trop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs {
	public static final CreativeTabs tabRing = new CreativeTabs("ringPower") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(TROP.ring_baraz);
		}
	};
}
