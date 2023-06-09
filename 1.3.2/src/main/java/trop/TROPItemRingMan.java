package trop;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

import java.util.List;

import static trop.TROPObfuscationHelper.addPotionEffect;

public class TROPItemRingMan extends TROPItemRingBase {
	public TROPItemRingMan(int id) {
		super(id);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, List list) {
		for (Potion potion : new Potion[]{Potion.damageBoost, Potion.nightVision}) {
			list.add("\u00A72" + StatCollector.translateToLocal(potion.getName()).trim());
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		addPotionEffect(entityPlayer, new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		if (entity instanceof EntityPlayer) {
			addPotionEffect((EntityPlayer) entity, new PotionEffect(Potion.damageBoost.getId(), 20, 1));
			addPotionEffect((EntityPlayer) entity, new PotionEffect(Potion.nightVision.getId(), 220, 0));
		}
	}
}
