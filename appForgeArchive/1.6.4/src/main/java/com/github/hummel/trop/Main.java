package com.github.hummel.trop;

import com.github.hummel.trop.init.Items;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "trop", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.preInit(event);

		Items.preInit();
	}
}