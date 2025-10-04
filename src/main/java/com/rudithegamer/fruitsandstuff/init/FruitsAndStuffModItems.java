/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rudithegamer.fruitsandstuff.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.rudithegamer.fruitsandstuff.item.StarchItem;
import com.rudithegamer.fruitsandstuff.item.CandyCaneItem;
import com.rudithegamer.fruitsandstuff.item.BananaItem;
import com.rudithegamer.fruitsandstuff.FruitsAndStuffMod;

public class FruitsAndStuffModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FruitsAndStuffMod.MODID);
	public static final DeferredItem<Item> BANANA = REGISTRY.register("banana", BananaItem::new);
	public static final DeferredItem<Item> CANDY_CANE = REGISTRY.register("candy_cane", CandyCaneItem::new);
	public static final DeferredItem<Item> STARCH = REGISTRY.register("starch", StarchItem::new);
	public static final DeferredItem<Item> STARCH_SEEDS = block(FruitsAndStuffModBlocks.STARCH_SEEDS);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}