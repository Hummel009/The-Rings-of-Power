package trop;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TROPCreativeTabs {
	public static final CreativeModeTab tabRing = new CreativeModeTab("ringPower") {
		@Override
		public @NotNull ItemStack makeIcon() {
			return new ItemStack(TROP.RING_BARAZ.get());
		}
	};
}
