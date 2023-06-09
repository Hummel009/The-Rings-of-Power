package trop;

import java.util.List;

import org.jetbrains.annotations.NotNull;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.*;
import net.minecraft.world.effect.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.*;

public class TROPItemRingDwarf extends TROPItemRingBase {
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Level world, List<Component> info, TooltipFlag flag) {
		for (MobEffect effect: new MobEffect[] { MobEffects.DIG_SPEED, MobEffects.DAMAGE_RESISTANCE }) {
			MobEffectInstance potioneffect = new MobEffectInstance(effect, 20, 1);
			info.add(Component.translatable(potioneffect.getDescriptionId()).withStyle(ChatFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(@NotNull ItemStack itemstack, @NotNull Level world, @NotNull Entity entity, int par4, boolean par5) {
		if (entity instanceof Player feature) {
			feature.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1));
			feature.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1));
		}
	}

	@Override
	public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level world, Player entity, @NotNull InteractionHand hand) {
		entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 2));
		entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3800, 2));
		return super.use(world, entity, hand);
	}
}
