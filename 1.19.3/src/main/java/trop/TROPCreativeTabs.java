package trop;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TROPCreativeTabs {
	@SubscribeEvent
	public static void addCreativeTab(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("trop", "troptab"), builder -> builder.title(Component.translatable("itemGroup.ringPower")).icon(() -> new ItemStack(TROP.ring_jiindur.get())).displayItems((enabledFlags, populator, hasPermissions) -> {
			for (Item item : TROP.itemList) {
				populator.accept(item);
			}
		}));
	}
}
