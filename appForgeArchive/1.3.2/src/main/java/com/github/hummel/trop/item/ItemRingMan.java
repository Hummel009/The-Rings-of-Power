package com.github.hummel.trop.item;

import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ItemRingMan extends ItemRing {
	public ItemRingMan(int id) {
		super(id);
	}

	@Override
	public List<PotionEffect> getPotionEffects() {
		List<PotionEffect> potionEffects = new ArrayList<PotionEffect>();
		potionEffects.add(new PotionEffect(Potion.damageBoost.getId(), 20, 1));
		potionEffects.add(new PotionEffect(Potion.nightVision.getId(), 220, 0));
		return potionEffects;
	}
}