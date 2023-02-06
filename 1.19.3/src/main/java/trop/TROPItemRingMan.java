package trop;

import net.minecraft.world.*;
import net.minecraft.world.effect.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TROPItemRingMan extends TROPItemRingBase {

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int par4, boolean par5) {
		if (entity instanceof Player) {
			((Player) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1));
			((Player) entity).addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 220));
			((Player) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1));
		}
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 2));
		entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3800, 2));
		return super.use(world, entity, hand);
	}
}
