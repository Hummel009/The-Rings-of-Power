package com.github.hummel.trop.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class ItemRingMan extends ItemRing {
	@Override
	public void appendHoverText(ItemStack itemStack, World world, List<ITextComponent> list, ITooltipFlag tooltipFlag) {
		for (Effect effect : new Effect[]{Effects.DAMAGE_BOOST, Effects.NIGHT_VISION}) {
			list.add(new TranslationTextComponent(effect.getDescriptionId()).withStyle(TextFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 20, 1));
			((LivingEntity) entity).addEffect(new EffectInstance(Effects.NIGHT_VISION, 220));
		}
	}

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
		playerEntity.addEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		playerEntity.addEffect(new EffectInstance(Effects.HEALTH_BOOST, 3600, 2));
		return super.use(world, playerEntity, hand);
	}
}