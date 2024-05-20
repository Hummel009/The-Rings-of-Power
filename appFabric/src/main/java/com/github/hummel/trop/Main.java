package com.github.hummel.trop;

import com.github.hummel.trop.init.ItemGroups;
import com.github.hummel.trop.init.Items;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	@SuppressWarnings("unused")
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	@Override
	public void onInitialize() {
		Items.register();
		ItemGroups.register();
	}
}