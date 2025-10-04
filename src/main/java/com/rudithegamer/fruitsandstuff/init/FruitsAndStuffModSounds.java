/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rudithegamer.fruitsandstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.rudithegamer.fruitsandstuff.FruitsAndStuffMod;

public class FruitsAndStuffModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, FruitsAndStuffMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> EATING = REGISTRY.register("eating", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fruits_and_stuff", "eating")));
}