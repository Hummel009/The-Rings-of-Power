package com.github.hummel.trop.item;

import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ItemRingGreat extends ItemRing {
	public ItemRingGreat(int id) {
		super(id);
	}

	@Override
	public List<PotionEffect> getPotionEffects() {
		List<PotionEffect> potionEffects = new ArrayList<PotionEffect>();
		potionEffects.add(new PotionEffect(Potion.invisibility.getId(), 20, 0));
		return potionEffects;
	}
}