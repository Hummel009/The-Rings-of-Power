package trop;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import trop.handler.EventHandler;

@Mod(modid = "trop", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public Main() {
		EventBus eventBus = MinecraftForge.EVENT_BUS;
		EventHandler eventHandler = new EventHandler();
		eventBus.register(eventHandler);
	}
}