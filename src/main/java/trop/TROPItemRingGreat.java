package trop;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TROPItemRingGreat extends TROPItemRingBase {

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) {
		entity.addEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		entity.addEffect(new EffectInstance(Effects.HEALTH_BOOST, 3800, 2));
		return super.use(world, entity, hand);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 20, 2));
			((PlayerEntity) entity).addEffect(new EffectInstance(Effects.INVISIBILITY, 20, 2));
		}
	}
}
