package com.github.hummel.trop.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemRingGreat extends ItemRing {
	@Override
	public void addInformation(ItemStack itemStack, World world, List<ITextComponent> list, ITooltipFlag tooltipFlag) {
		for (Potion potion : new Potion[]{MobEffects.INVISIBILITY}) {
			list.add(new TextComponentTranslation(potion.getName()).applyTextStyle(TextFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20, 2));
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand hand) {
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 2));
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 3600, 2));
		return super.onItemRightClick(world, entityPlayer, hand);
	}
}