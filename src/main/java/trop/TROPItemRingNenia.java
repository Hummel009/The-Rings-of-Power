package trop;

import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.world.World;

public class TROPItemRingNenia extends Item {
	public TROPItemRingNenia(Properties prop) {
		super(prop);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).addEffect(new EffectInstance(Effects.HEAL, 20, 2));
			((LivingEntity) entity).addEffect(new EffectInstance(Effects.WATER_BREATHING, 20, 2));
		}
	}

	public boolean onItemUse(ItemStack itemStack, PlayerEntity entity, World world, int i, int j, int k, int l, float a, float b, float c) {
		entity.addEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 20, 2));
		return true;
	}
}
