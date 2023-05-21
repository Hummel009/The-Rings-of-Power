package trop;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs {
	public static final CreativeTabs tabRing = new CreativeTabs("Rings of Power") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(TROP.ringBaraz).getItem();
		}

		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel() {
			return "Rings of Power";
		}
	};
}
