package com.github.hummel.trop.item;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingVilya extends ItemRing {
	@Override
	public List<EffectInstance> getEffectInstances() {
		List<EffectInstance> uniqueEffects = new ArrayList<>();
		uniqueEffects.add(new EffectInstance(Effects.MOVEMENT_SPEED, 20, 1));
		uniqueEffects.add(new EffectInstance(Effects.JUMP, 20, 1));
		return uniqueEffects;
	}
}