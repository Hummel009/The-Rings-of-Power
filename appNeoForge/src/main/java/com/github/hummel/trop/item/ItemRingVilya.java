package com.github.hummel.trop.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingVilya extends ItemRing {
	@Override
	public List<MobEffectInstance> getUniqueEffects() {
		List<MobEffectInstance> uniqueEffects = new ArrayList<>();
		uniqueEffects.add(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1));
		uniqueEffects.add(new MobEffectInstance(MobEffects.JUMP, 20, 1));
		return uniqueEffects;
	}
}