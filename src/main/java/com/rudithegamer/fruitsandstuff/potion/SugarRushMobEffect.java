package com.rudithegamer.fruitsandstuff.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import com.rudithegamer.fruitsandstuff.procedures.SugarRushEffectStartedappliedProcedure;

public class SugarRushMobEffect extends InstantenousMobEffect {
	public SugarRushMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.explode")));
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		SugarRushEffectStartedappliedProcedure.execute(entity.level(), entity);
	}
}