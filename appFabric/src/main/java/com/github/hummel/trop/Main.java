package com.github.hummel.trop;

import net.fabricmc.api.ModInitializer;
import com.github.hummel.trop.init.CreativeTabs;
import com.github.hummel.trop.init.Items;

public class Main implements ModInitializer {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	@Override
	public void onInitialize() {
		Items.register();
		CreativeTabs.register();
	}
}