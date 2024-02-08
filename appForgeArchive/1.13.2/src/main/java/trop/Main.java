package trop;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import trop.handler.EventHandler;

@Mod("trop")
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public Main() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		EventHandler eventHandler = new EventHandler();
		eventBus.register(eventHandler);
	}
}