package trop;

import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TROPItemRingVilia extends Item {
	public TROPItemRingVilia(Properties prop) {
		super(prop);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
		entity.addPotionEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		entity.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 3800, 2));
		return super.onItemRightClick(world, entity, hand);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, 20, 2));
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 20, 2));
		}
	}
}
