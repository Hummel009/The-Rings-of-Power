package com.github.hummel.trop.item;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

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
		potionEffects.add(new PotionEffect(Potion.nightVision.getId(), 220));
		return potionEffects;
	}
}