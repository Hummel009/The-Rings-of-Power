package com.github.hummel.trop;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.github.hummel.trop.init.Items;
import com.github.hummel.trop.init.Langs;

@Mod(modid = "trop", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	@Mod.PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Config.preInit(event);
		Items.preInit();
		Langs.preInit();
	}
}
