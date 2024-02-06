package trop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TROPCreativeTabs {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("trop.rings") {
		@Override
		public Item getTabIconItem() {
			return TROP.ringNarya;
		}
	};

	private TROPCreativeTabs() {
	}
}
