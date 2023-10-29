package trop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TROPCreativeTabs {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("ringPower") {
		@Override
		public Item getTabIconItem() {
			return TROP.ringNarya;
		}
	};
}
