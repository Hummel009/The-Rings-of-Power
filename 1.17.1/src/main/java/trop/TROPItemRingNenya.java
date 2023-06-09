package trop;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.*;
import net.minecraft.world.*;
import net.minecraft.world.effect.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.*;

public class TROPItemRingNenya extends TROPItemRingBase {
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Level world, List<Component> info, TooltipFlag flag) {
		for (MobEffect effect: new MobEffect[] { MobEffects.WATER_BREATHING }) {
			MobEffectInstance potioneffect = new MobEffectInstance(effect, 20, 1);
			info.add(new TranslatableComponent(potioneffect.getDescriptionId()).withStyle(ChatFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int par4, boolean par5) {
		if (entity instanceof Player feature) {
			feature.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 20));
		}
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 2));
		entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3800, 2));
		return super.use(world, entity, hand);
	}
}
