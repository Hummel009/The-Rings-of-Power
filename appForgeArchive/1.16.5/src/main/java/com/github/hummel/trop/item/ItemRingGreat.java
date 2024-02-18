package com.github.hummel.trop.item;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingGreat extends ItemRing {
	@Override
	public List<EffectInstance> getEffectInstances() {
		List<EffectInstance> uniqueEffects = new ArrayList<>();
		uniqueEffects.add(new EffectInstance(Effects.INVISIBILITY, 20));
		return uniqueEffects;
	}
}