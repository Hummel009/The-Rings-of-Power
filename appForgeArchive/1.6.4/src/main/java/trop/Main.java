package trop;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import trop.init.CreativeTabs;
import trop.init.Items;

@Mod(modid = "trop", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		CreativeTabs.onInit();
		Items.onInit();
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.preInit(event);
	}
}
