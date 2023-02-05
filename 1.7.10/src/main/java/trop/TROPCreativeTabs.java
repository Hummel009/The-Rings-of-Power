package trop;

import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class TROPCreativeTabs extends CreativeTabs {
	public static TROPCreativeTabs tabRing = new TROPCreativeTabs("ringPower");
	public ItemStack theIcon;

	public TROPCreativeTabs(String label) {
		super(label);
	}

	@Override
	public ItemStack getIconItemStack() {
		return theIcon;
	}

	@Override
	@SideOnly(value = Side.CLIENT)
	public Item getTabIconItem() {
		return theIcon.getItem();
	}

	public static void setupIcons() {
		TROPCreativeTabs.tabRing.theIcon = new ItemStack(TROP.ring_baraz);
	}
}
