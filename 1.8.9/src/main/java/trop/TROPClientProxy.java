package trop;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class TROPClientProxy extends TROPCommonProxy {

	@Override
	public void registerRenders() {
		for (Item item : TROP.CONTENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("trop:" + item.getUnlocalizedName().substring(5), "inventory"));
		}
	}
}
