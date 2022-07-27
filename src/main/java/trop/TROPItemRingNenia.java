package trop;

import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TROPItemRingNenia extends TROPItemRingBase {
	public TROPItemRingNenia() {
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c) {
		world.setBlock(i, j + 1, k, Blocks.flowing_water, 0, 2);
		return true;
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(13, 20, 2));
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(6, 20, 2));
		}
	}
}
