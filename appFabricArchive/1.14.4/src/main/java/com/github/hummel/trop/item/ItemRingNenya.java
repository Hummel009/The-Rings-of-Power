package com.github.hummel.trop.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class ItemRingNenya extends ItemRing {
	@Override
	public void appendHoverText(ItemStack itemStack, Level level, List<Component> list, TooltipFlag tooltipFlag) {
		for (MobEffect mobEffect : new MobEffect[]{MobEffects.WATER_BREATHING}) {
			list.add(new TranslatableComponent(mobEffect.getDescriptionId()).withStyle(ChatFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int slot, boolean selected) {
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 20));
		}
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
		player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 2));
		player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 2));
		return super.use(level, player, interactionHand);
	}
}
