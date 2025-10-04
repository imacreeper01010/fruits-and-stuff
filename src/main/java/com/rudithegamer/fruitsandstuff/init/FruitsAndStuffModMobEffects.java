/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.rudithegamer.fruitsandstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import com.rudithegamer.fruitsandstuff.potion.SugarRushMobEffect;
import com.rudithegamer.fruitsandstuff.FruitsAndStuffMod;

public class FruitsAndStuffModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, FruitsAndStuffMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> SUGAR_RUSH = REGISTRY.register("sugar_rush", () -> new SugarRushMobEffect());
}