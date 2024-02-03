package trop;

import net.minecraft.item.Item;

public class TROPItemRingBase extends Item {
	public TROPItemRingBase() {
		super(new Settings().maxDamage(0));
		TROP.CONTENT.add(this);
	}
}
