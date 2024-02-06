package trop;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

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
