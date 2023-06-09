package trop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class TROPCreativeTabs {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("ringPower") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(TROP.ringBaraz).getItem();
		}
	};
}
