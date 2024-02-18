package com.github.hummel.trop.item;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingNarya extends ItemRing {
	@Override
	public List<EffectInstance> getEffectInstances() {
		List<EffectInstance> effectInstances = new ArrayList<>();
		effectInstances.add(new EffectInstance(Effects.FIRE_RESISTANCE, 20));
		return effectInstances;
	}
}