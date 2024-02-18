package com.github.hummel.trop.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingVilya extends ItemRing {
	@Override
	public List<MobEffectInstance> getMobEffectInstances() {
		List<MobEffectInstance> mobEffectInstances = new ArrayList<>();
		mobEffectInstances.add(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1));
		mobEffectInstances.add(new MobEffectInstance(MobEffects.JUMP, 20, 1));
		return mobEffectInstances;
	}
}