package trop;

import net.fabricmc.api.ModInitializer;
import trop.init.CreativeTabs;
import trop.init.Items;

public class Main implements ModInitializer {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	@Override
	public void onInitialize() {
		Items.register();
		CreativeTabs.register();
	}
}