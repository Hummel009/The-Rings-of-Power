package trop.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {
	public static final CreativeModeTab TAB_RINGS = new CreativeModeTab("trop.rings") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.ringNarya);
		}
	};

	private CreativeTabs() {
	}
}