package trop;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.*;

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
	public ItemStack getTabIconItem() {
		return theIcon;
	}

	public static void setupIcons() {
		TROPCreativeTabs.tabRing.theIcon = new ItemStack(TROP.ring_baraz);
	}
}
