package trop;

import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.world.World;

public class TROPItemRingGreat extends Item {
	public TROPItemRingGreat(Properties prop) {
		super(prop);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 20, 2));
			((LivingEntity) entity).addEffect(new EffectInstance(Effects.INVISIBILITY, 20, 2));
		}
	}
}
