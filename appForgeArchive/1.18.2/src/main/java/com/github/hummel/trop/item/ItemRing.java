package com.github.hummel.trop.item;

import com.github.hummel.trop.init.Items;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().durability(0));
		Items.CONTENT.add(this);
	}

	public List<MobEffectInstance> getMobEffectInstances() {
		return new ArrayList<>();
	}

	@Override
	public void appendHoverText(ItemStack itemStack, Level level, List<Component> list, TooltipFlag tooltipFlag) {
		var mobEffectInstances = getMobEffectInstances();
		for (var mobEffectInstance : mobEffectInstances) {
			list.add(new TranslatableComponent(mobEffectInstance.getEffect().getDescriptionId()).withStyle(ChatFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int slot, boolean selected) {
		var mobEffectInstances = getMobEffectInstances();
		if (entity instanceof LivingEntity livingEntity) {
			for (var mobEffectInstance : mobEffectInstances) {
				livingEntity.addEffect(mobEffectInstance);
			}
		}
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
		player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 2));
		player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 2));
		return super.use(level, player, interactionHand);
	}
}