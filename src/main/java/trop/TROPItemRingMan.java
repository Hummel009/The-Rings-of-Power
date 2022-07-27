package trop;

import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TROPItemRingMan extends Item {
	public TROPItemRingMan(Properties prop) {
		super(prop);
	}

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) {
		entity.addEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		entity.addEffect(new EffectInstance(Effects.HEALTH_BOOST, 3800, 2));
		return super.use(world, entity, hand);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 20, 2));
			((LivingEntity) entity).addEffect(new EffectInstance(Effects.NIGHT_VISION, 240, 2));
		}
	}
}
