package trop.init;

import net.minecraft.item.Item;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class CreativeTabs {
	public static net.minecraft.creativetab.CreativeTabs tabRings;

	private CreativeTabs() {
	}

	public static void preInit() {
		tabRings = new net.minecraft.creativetab.CreativeTabs("trop.rings") {
			@Override
			public Item getTabIconItem() {
				return Items.ringNarya;
			}
		};
	}
}