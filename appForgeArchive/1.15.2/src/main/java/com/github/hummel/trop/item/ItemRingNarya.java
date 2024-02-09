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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class ItemRingNarya extends ItemRing {
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemStack, World world, List<ITextComponent> list, ITooltipFlag tooltipFlag) {
		for (Effect effect : new Effect[]{Effects.FIRE_RESISTANCE}) {
			list.add(new TranslationTextComponent(effect.getDescriptionId()).withStyle(TextFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 20));
		}
	}

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
		playerEntity.addEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		playerEntity.addEffect(new EffectInstance(Effects.HEALTH_BOOST, 3600, 2));
		return super.use(world, playerEntity, hand);
	}
}