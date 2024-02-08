package trop.init;

import net.minecraft.item.ItemStack;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class CreativeTabs {
	public static net.minecraft.creativetab.CreativeTabs tabRings;

	private CreativeTabs() {
	}

	public static void register() {
		tabRings = new net.minecraft.creativetab.CreativeTabs("trop.rings") {
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.ringNarya);
			}
		};
	}
}