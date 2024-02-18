package com.github.hummel.trop.item;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ItemRingNarya extends ItemRing {
	public ItemRingNarya(int id) {
		super(id);
	}

	@Override
	public List<PotionEffect> getPotionEffects() {
		List<PotionEffect> potionEffects = new ArrayList<PotionEffect>();
		potionEffects.add(new PotionEffect(Potion.fireResistance.getId(), 20));
		return potionEffects;
	}
}