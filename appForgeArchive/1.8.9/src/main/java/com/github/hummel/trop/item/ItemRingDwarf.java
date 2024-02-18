package com.github.hummel.trop.item;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ItemRingDwarf extends ItemRing {
	@Override
	public List<PotionEffect> getPotionEffects() {
		List<PotionEffect> potionEffects = new ArrayList<>();
		potionEffects.add(new PotionEffect(Potion.moveSpeed.getId(), 20, 1));
		potionEffects.add(new PotionEffect(Potion.resistance.getId(), 20, 1));
		return potionEffects;
	}
}