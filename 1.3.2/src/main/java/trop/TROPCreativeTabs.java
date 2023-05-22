package trop;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class TROPCreativeTabs {
	public static final CreativeTabs tabRing = new CreativeTabs("ringPower") {
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
