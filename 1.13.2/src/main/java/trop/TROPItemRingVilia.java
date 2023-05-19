package trop;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class TROPItemRingVilia extends TROPItemRingBase {

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, 20, 1));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 20, 1));
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
		entity.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 2));
		entity.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 3800, 2));
		return super.onItemRightClick(world, entity, hand);
	}
}
