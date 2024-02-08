package trop.handler;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import trop.init.Items;

public class ModEventHandler {
	@SubscribeEvent
	public void onCreativeModeTabRegistry(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("trop", "rings"), builder -> builder.title(Component.translatable("itemGroup.trop.rings")).icon(() -> new ItemStack(Items.RING_NARYA.get())).displayItems((enabledFlags, populator) -> {
			for (var item : Items.CONTENT) {
				populator.accept(item);
			}
		}));
	}
}