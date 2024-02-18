package com.github.hummel.trop.item;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingDwarf extends ItemRing {
	@Override
	public List<EffectInstance> getEffectInstances() {
		List<EffectInstance> effectInstances = new ArrayList<>();
		effectInstances.add(new EffectInstance(Effects.DIG_SPEED, 20, 1));
		effectInstances.add(new EffectInstance(Effects.DAMAGE_RESISTANCE, 20, 1));
		return effectInstances;
	}
}