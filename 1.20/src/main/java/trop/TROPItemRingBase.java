package trop;

import net.minecraft.world.item.Item;

public class TROPItemRingBase extends Item {
	public TROPItemRingBase() {
		super(new Properties().durability(0));
		initialize();
	}

	private void initialize() {
		TROP.CONTENT.add(this);
	}
}
