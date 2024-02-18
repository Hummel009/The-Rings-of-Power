package com.github.hummel.trop.item;

import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ItemRingVilya extends ItemRing {
	public ItemRingVilya(int id) {
		super(id);
	}

	@Override
	public List<PotionEffect> getPotionEffects() {
		List<PotionEffect> potionEffects = new ArrayList<PotionEffect>();
		potionEffects.add(new PotionEffect(Potion.moveSpeed.getId(), 20, 1));
		potionEffects.add(new PotionEffect(Potion.jump.getId(), 20, 1));
		return potionEffects;
	}
}