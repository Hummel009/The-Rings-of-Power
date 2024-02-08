package trop;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trop.init.CreativeTabs;
import trop.init.Items;
import trop.proxy.CommonProxy;

@Mod(modid = "trop", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	@SidedProxy(clientSide = "trop.proxy.ClientProxy", serverSide = "trop.proxy.ServerProxy")
	private static CommonProxy proxy;

	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event) {
		proxy.onInit();
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		CreativeTabs.preInit();
		Items.preInit();
	}
}