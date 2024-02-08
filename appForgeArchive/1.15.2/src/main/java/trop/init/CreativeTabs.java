package trop.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class CreativeTabs {
	public static ItemGroup tabRings;

	private CreativeTabs() {
	}

	public static void register() {
		tabRings = new ItemGroup("trop.rings") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.ringNarya);
			}
		};
	}
}