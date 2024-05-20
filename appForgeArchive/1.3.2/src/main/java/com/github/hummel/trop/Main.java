package com.github.hummel.trop;

import com.github.hummel.trop.init.Items;
import com.github.hummel.trop.init.Langs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "trop", useMetadata = true)
public class Main {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	@Mod.PreInit
	@SuppressWarnings("MethodMayBeStatic")
	public void preInit(FMLPreInitializationEvent event) {
		Config.preInit(event);

		Items.preInit();
		Langs.preInit();
	}
}