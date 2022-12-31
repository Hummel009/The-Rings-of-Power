package trop;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.RegistryObject;

public class TROPCreativeTabs {
	@SubscribeEvent
	public static void addCreativeTab(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("trop", "troptab"), builder -> builder.title(Component.translatable("itemGroup.ringPower")).icon(() -> new ItemStack(TROP.ring_jiindur.get())).displayItems((enabledFlags, populator, hasPermissions) -> {
			for (RegistryObject<Item> amogus : TROP.sus) {
				populator.accept(amogus.get());
			}
		}));
	}
}
