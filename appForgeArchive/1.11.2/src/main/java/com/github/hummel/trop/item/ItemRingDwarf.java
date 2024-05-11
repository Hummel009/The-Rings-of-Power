package com.github.hummel.trop.item;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingDwarf extends ItemRing {
	@Override
	public List<PotionEffect> getPotionEffects() {
		List<PotionEffect> potionEffects = new ArrayList<>();
		potionEffects.add(new PotionEffect(MobEffects.HASTE, 20, 1));
		potionEffects.add(new PotionEffect(MobEffects.RESISTANCE, 20, 1));
		return potionEffects;
	}
}