package trop;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TROPClientProxy extends TROPCommonProxy {
	@Override
	@SideOnly(Side.CLIENT)
	public void onInit() {
		for (Item item : TROP.CONTENT) {
			String itemName = item.getUnlocalizedName().substring(5);
			ModelResourceLocation mrl = new ModelResourceLocation("trop:" + itemName, "inventory");
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, mrl);
		}
	}
}
