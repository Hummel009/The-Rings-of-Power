package trop;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.*;

public class TROPClientProxy extends TROPCommonProxy {

	@Override
	@SideOnly(Side.CLIENT)
	public void registerRenders() {
		for (Item item : TROP.CONTENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("trop:" + item.getUnlocalizedName().substring(5), "inventory"));
		}
	}
}
