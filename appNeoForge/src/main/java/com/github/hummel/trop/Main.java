package com.github.hummel.trop;

import com.github.hummel.trop.init.ItemGroups;
import com.github.hummel.trop.init.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod("trop")
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	public Main(IEventBus modEventBus) {
		Items.register(modEventBus);
		ItemGroups.register(modEventBus);
	}
}