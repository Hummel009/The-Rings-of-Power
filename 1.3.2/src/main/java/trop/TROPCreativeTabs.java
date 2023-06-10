package trop;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class TROPCreativeTabs {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("ringPower") {
		public Item getTabIconItem() {
			return TROP.ringBaraz;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public String getTranslatedTabLabel() {
			return "Rings of Power";
		}
	};
}
