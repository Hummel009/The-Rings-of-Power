package com.github.hummel.trop.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.ArrayList;
import java.util.List;

public class ItemRingGreat extends ItemRing {
	@Override
	public List<MobEffectInstance> getMobEffectInstances() {
		List<MobEffectInstance> uniqueEffects = new ArrayList<>();
		uniqueEffects.add(new MobEffectInstance(MobEffects.INVISIBILITY, 20));
		return uniqueEffects;
	}
}