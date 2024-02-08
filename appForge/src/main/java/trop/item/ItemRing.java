package trop.item;

import net.minecraft.world.item.Item;
import trop.init.Items;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().durability(0));
		Items.CONTENT.add(this);
	}
}
