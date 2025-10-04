/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rudithegamer.fruitsandstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import com.rudithegamer.fruitsandstuff.block.StarchSeedsBlock;
import com.rudithegamer.fruitsandstuff.FruitsAndStuffMod;

public class FruitsAndStuffModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FruitsAndStuffMod.MODID);
	public static final DeferredBlock<Block> STARCH_SEEDS = REGISTRY.register("starch_seeds", StarchSeedsBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}