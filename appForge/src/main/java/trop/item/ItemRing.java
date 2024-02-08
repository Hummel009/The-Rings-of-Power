package trop.item;

import net.minecraft.world.item.Item;
import trop.Main;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().durability(0));
		Main.CONTENT.add(this);
	}
}
