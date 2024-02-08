package trop.init;

import net.minecraft.src.Item;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class CreativeTabs {
	public static net.minecraft.src.CreativeTabs tabRings;

	private CreativeTabs() {
	}

	public static void onInit() {
		tabRings = new net.minecraft.src.CreativeTabs("trop.rings") {
			@Override
			public Item getTabIconItem() {
				return Items.ringNarya;
			}
		};
	}
}