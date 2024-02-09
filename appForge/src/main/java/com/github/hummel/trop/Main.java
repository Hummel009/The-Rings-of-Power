package com.github.hummel.trop;

import com.github.hummel.trop.handler.ForgeEventHandler;
import com.github.hummel.trop.init.CreativeTabs;
import com.github.hummel.trop.init.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("trop")
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public Main() {
		var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		var forgeEventBus = MinecraftForge.EVENT_BUS;
		var forgeEventHandler = new ForgeEventHandler();
		forgeEventBus.register(forgeEventHandler);

		Items.register(modEventBus);
		CreativeTabs.register(modEventBus);
	}
}