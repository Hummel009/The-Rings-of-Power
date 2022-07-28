package trop;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TROPItemRingNaria extends Item {
	public TROPItemRingNaria(Properties prop) {
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
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 20, 2));
		}
	}
}