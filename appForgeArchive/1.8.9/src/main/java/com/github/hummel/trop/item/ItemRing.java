package com.github.hummel.trop.item;

import com.github.hummel.trop.init.ItemGroups;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemRing extends Item {
	protected ItemRing() {
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(ItemGroups.TAB_RINGS);
	}

	protected List<PotionEffect> getPotionEffects() {
		return new ArrayList<>();
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean advanced) {
		List<PotionEffect> potionEffects = getPotionEffects();
		for (PotionEffect potionEffect : potionEffects) {
			list.add(ChatFormatting.DARK_GREEN + StatCollector.translateToLocal(potionEffect.getEffectName()).trim());
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		entityPlayer.addPotionEffect(new PotionEffect(Potion.healthBoost.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer);
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