package trop.handler;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import trop.init.Items;

public class ModEventHandler {
	@SubscribeEvent
	public void onItemRegistry(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.ITEMS, consumer -> Items.register());
	}

	@SubscribeEvent
	public void onCreativeModeTabRegistry(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("trop", "rings"), builder -> builder.title(Component.translatable("itemGroup.trop.rings")).icon(() -> new ItemStack(Items.ringNarya)).displayItems((enabledFlags, populator) -> {
			for (var item : Items.CONTENT) {
				populator.accept(item);
			}
		}));
	}
}