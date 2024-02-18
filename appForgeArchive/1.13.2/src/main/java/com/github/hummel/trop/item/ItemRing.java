package com.github.hummel.trop.item;

import com.github.hummel.trop.init.ItemGroups;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class ItemRing extends Item {
	public ItemRing() {
		super(new Properties().defaultMaxDamage(0).group(ItemGroups.TAB_RINGS));
	}

	public List<PotionEffect> getPotionEffects() {
		return new ArrayList<>();
	}

	@Override
	public void addInformation(ItemStack itemStack, World world, List<ITextComponent> list, ITooltipFlag tooltipFlag) {
		List<PotionEffect> potionEffects = getPotionEffects();
		for (PotionEffect potionEffect : potionEffects) {
			list.add(new TextComponentTranslation(potionEffect.getPotion().getName()).applyTextStyle(TextFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
		List<PotionEffect> potionEffects = getPotionEffects();
		if (entity instanceof EntityLivingBase) {
			for (PotionEffect potionEffect : potionEffects) {
				((EntityLivingBase) entity).addPotionEffect(potionEffect);
			}
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand hand) {
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 2));
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 3600, 2));
		return super.onItemRightClick(world, entityPlayer, hand);
	}
}