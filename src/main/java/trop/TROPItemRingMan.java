package trop;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.*;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class TROPItemRingMan extends TROPItemRingBase {

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 20, 2));
			((PlayerEntity) entity).addEffect(new EffectInstance(Effects.NIGHT_VISION, 240, 2));
		}
	}

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) {
		entity.addEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		entity.addEffect(new EffectInstance(Effects.HEALTH_BOOST, 3800, 2));
		return super.use(world, entity, hand);
	}
}
