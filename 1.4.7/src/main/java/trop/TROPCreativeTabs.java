package trop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TROPCreativeTabs {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("ringPower") {
		public Item d() {
			return getTabIconItem();
		}

		public Item getTabIconItem() {
			return TROP.ringBaraz;
		}
	};
}
