package com.github.hummel.trop.item;

import com.github.hummel.trop.init.ItemGroups;
import net.minecraft.src.*;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemRing extends Item {
	private static final String DARK_GREEN = "§2";

	protected ItemRing(int id) {
		super(id);
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(ItemGroups.TAB_RINGS);
	}

	protected List<PotionEffect> getPotionEffects() {
		return new ArrayList<PotionEffect>();
	}

	@Override
	public void addInformation(ItemStack itemStack, List list) {
		List<PotionEffect> potionEffects = getPotionEffects();
		for (PotionEffect potionEffect : potionEffects) {
			list.add(DARK_GREEN + StatCollector.translateToLocal(potionEffect.getEffectName()).trim());
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
		List<PotionEffect> potionEffects = getPotionEffects();
		if (entity instanceof EntityLiving) {
			for (PotionEffect potionEffect : potionEffects) {
				((EntityLiving) entity).addPotionEffect(potionEffect);
			}
		}
	}
}