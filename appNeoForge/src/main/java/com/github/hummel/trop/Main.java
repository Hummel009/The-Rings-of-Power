package com.github.hummel.trop;

import com.github.hummel.trop.init.CreativeTabs;
import com.github.hummel.trop.init.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod("trop")
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	public Main(IEventBus modEventBus) {
		Items.register(modEventBus);
		CreativeTabs.register(modEventBus);
	}
}