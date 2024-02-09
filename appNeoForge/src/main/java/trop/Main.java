package trop;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import trop.init.CreativeTabs;
import trop.init.Items;

@Mod("trop")
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public Main(IEventBus modEventBus) {
		Items.register(modEventBus);
		CreativeTabs.register(modEventBus);
	}
}