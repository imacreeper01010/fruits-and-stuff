/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rudithegamer.fruitsandstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.rudithegamer.fruitsandstuff.FruitsAndStuffMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FruitsAndStuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FruitsAndStuffMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(FruitsAndStuffModBlocks.STARCH_SEEDS.get().asItem());
		}
	}
}