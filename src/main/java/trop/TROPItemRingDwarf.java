package trop;

import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TROPItemRingDwarf extends TROPItemRingBase {
	public TROPItemRingDwarf() {
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(6, 20, 2));
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(3, 20, 2));
		}
	}
}
