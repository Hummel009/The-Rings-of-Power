package com.github.hummel.trop.item;

import com.github.hummel.trop.init.ItemGroups;
import com.github.hummel.trop.init.Items;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class ItemRing extends Item {
	public ItemRing() {
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(ItemGroups.TAB_RINGS);
		Items.CONTENT.add(this);
	}

	public List<PotionEffect> getPotionEffects() {
		return new ArrayList<>();
	}

	@Override
	@SuppressWarnings("deprecation")
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean advanced) {
		List<PotionEffect> potionEffects = getPotionEffects();
		for (PotionEffect potionEffect : potionEffects) {
			list.add(ChatFormatting.DARK_GREEN + I18n.translateToLocal(potionEffect.getPotion().getName()).trim());
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer, EnumHand hand) {
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 2));
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer, hand);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
		List<PotionEffect> potionEffects = getPotionEffects();
		if (entity instanceof EntityLivingBase) {
			for (PotionEffect potionEffect : potionEffects) {
				((EntityLivingBase) entity).addPotionEffect(potionEffect);
			}
		}
	}
}