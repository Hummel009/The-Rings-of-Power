package trop;

import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TROPCreativeTabs {
	@SubscribeEvent
	public static void addCreativeTab(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == TROP.TAB_RINGS.getKey()) {
			for (Item item : TROP.CONTENT) {
				event.accept(item);
			}
		}
	}
}
