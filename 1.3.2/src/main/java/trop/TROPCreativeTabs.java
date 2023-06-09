package trop;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class TROPCreativeTabs {
	public static final CreativeTabs TAB_RINGS = new CreativeTabs("ringPower") {
		@Override
		public Item getTabIconItem() {
			return TROP.ringBaraz;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel() {
			return "Rings of Power";
		}
	};
}
