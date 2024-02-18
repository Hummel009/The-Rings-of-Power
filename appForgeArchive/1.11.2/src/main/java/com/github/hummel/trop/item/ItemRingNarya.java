package com.github.hummel.trop.item;

import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ItemRingNarya extends ItemRing {
	@Override
	public List<PotionEffect> getPotionEffects() {
		List<PotionEffect> potionEffects = new ArrayList<>();
		potionEffects.add(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20));
		return potionEffects;
	}
}