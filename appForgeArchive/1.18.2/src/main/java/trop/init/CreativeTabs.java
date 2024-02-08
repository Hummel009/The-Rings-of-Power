package trop.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class CreativeTabs {
	public static CreativeModeTab tabRings;

	private CreativeTabs() {
	}

	public static void register() {
		tabRings = new CreativeModeTab("trop.rings") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.ringNarya);
			}
		};
	}
}