package trop;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class TROPCreativeTabs {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("ringPower") {
		@Override
		public Item getTabIconItem() {
			return TROP.ringBaraz;
		}
	};
}
