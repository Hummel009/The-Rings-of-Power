package com.github.hummel.trop.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingMan extends ItemRing {
	@Override
	public List<MobEffectInstance> getMobEffectInstances() {
		List<MobEffectInstance> uniqueEffects = new ArrayList<>();
		uniqueEffects.add(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1));
		uniqueEffects.add(new MobEffectInstance(MobEffects.NIGHT_VISION, 220));
		return uniqueEffects;
	}
}