package trop;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TROPCreativeTabs {
	@SubscribeEvent
	public static void addCreativeTab(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("trop", "troptab"), builder -> builder.title(Component.translatable("itemGroup.ringPower")).icon(() -> new ItemStack(TROP.RING_NARYA.get())).displayItems((enabledFlags, populator) -> {
			for (Item item : TROP.CONTENT) {
				populator.accept(item);
			}
		}));
	}
}
