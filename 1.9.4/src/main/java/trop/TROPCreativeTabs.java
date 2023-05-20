package trop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs {
	public static final CreativeTabs tabRing = new CreativeTabs("ringPower") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(TROP.ringBaraz).getItem();
		}
	};
}
