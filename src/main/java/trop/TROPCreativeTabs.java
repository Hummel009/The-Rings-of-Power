package trop;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TROPCreativeTabs
extends CreativeTabs {
    public static TROPCreativeTabs tabRing = new TROPCreativeTabs("ringPower");
    public ItemStack theIcon;

    public TROPCreativeTabs(String label) {
        super(label);
    }

    public static void setupIcons() {
        TROPCreativeTabs.tabRing.theIcon = new ItemStack(TROP.ring_baraz);
    }

    @SideOnly(value=Side.CLIENT)
    public Item getTabIconItem() {
        return this.theIcon.getItem();
    }

    public ItemStack getIconItemStack() {
        return this.theIcon;
    }
}

