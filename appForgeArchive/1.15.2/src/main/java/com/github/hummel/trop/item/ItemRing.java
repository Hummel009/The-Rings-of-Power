package com.github.hummel.trop.item;

import com.github.hummel.trop.init.ItemGroups;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().durability(0).tab(ItemGroups.TAB_RINGS));
	}

	public List<EffectInstance> getEffectInstances() {
		return new ArrayList<>();
	}

	@Override
	public void appendHoverText(ItemStack itemStack, World world, List<ITextComponent> list, ITooltipFlag tooltipFlag) {
		List<EffectInstance> effectInstances = getEffectInstances();
		for (EffectInstance effectInstance : effectInstances) {
			list.add(new TranslationTextComponent(effectInstance.getEffect().getDescriptionId()).withStyle(TextFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
		List<EffectInstance> effectInstances = getEffectInstances();
		if (entity instanceof LivingEntity) {
			for (EffectInstance effectInstance : effectInstances) {
				((LivingEntity) entity).addEffect(effectInstance);
			}
		}
	}

	@Override
	public ActionResult<ItemStack> use(World level, PlayerEntity player, Hand hand) {
		player.addEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		player.addEffect(new EffectInstance(Effects.HEALTH_BOOST, 3600, 2));
		return super.use(level, player, hand);
	}
}