package trop;

import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class TROPItemRingDwarf extends Item {
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
		entity.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 2));
		entity.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 3800, 2));
		return super.onItemRightClick(world, entity, hand);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 2));
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 20, 2));
		}
	}
}
