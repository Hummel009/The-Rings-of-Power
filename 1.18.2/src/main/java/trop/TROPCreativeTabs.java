package trop;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TROPCreativeTabs {
	public static final CreativeModeTab tabRing = new CreativeModeTab("ringPower") {
		@Override
		public @NotNull ItemStack makeIcon() {
			return new ItemStack(TROP.RING_BARAZ.get());
		}
	};
}
