package trop;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.world.World;

public class TROPItemRingDwarf extends Item {
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		entity.addPotionEffect(new PotionEffect(Potion.regeneration.id, 3600, 2));
		entity.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, 3800, 2));
		return super.onItemRightClick(itemStack, world, entity);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.nightVision.id, 220, 2));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.digSpeed.id, 20, 2));
		}
	}
}