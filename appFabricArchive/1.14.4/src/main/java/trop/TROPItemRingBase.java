package trop;

import net.minecraft.item.Item;

public class TROPItemRingBase extends Item {
	public TROPItemRingBase() {
		super(new Settings().maxDamage(0).group(TROP.TAB_RINGS));
		TROP.CONTENT.add(this);
	}
}
