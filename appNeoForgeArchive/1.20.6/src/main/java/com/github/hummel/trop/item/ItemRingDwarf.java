package com.github.hummel.trop.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingDwarf extends ItemRing {
	@Override
	public List<MobEffectInstance> getMobEffectInstances() {
		var mobEffectInstances = new ArrayList<MobEffectInstance>();
		mobEffectInstances.add(new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1));
		mobEffectInstances.add(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1));
		return mobEffectInstances;
	}
}