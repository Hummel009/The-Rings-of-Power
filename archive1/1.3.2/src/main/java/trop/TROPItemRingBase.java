package trop;

import net.minecraft.src.Item;

public class TROPItemRingBase extends Item {
	public TROPItemRingBase(int id) {
		super(id);
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(TROPCreativeTabs.TAB_RINGS);
	}
}