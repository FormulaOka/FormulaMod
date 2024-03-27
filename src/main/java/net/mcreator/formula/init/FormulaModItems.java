
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.formula.item.YesssssssItem;
import net.mcreator.formula.item.StarligItem;
import net.mcreator.formula.item.SnomItem;
import net.mcreator.formula.item.SWORLDItem;
import net.mcreator.formula.item.PrismItem;
import net.mcreator.formula.item.ForshItem;
import net.mcreator.formula.FormulaMod;

public class FormulaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FormulaMod.MODID);
	public static final RegistryObject<Item> STAR = block(FormulaModBlocks.STAR);
	public static final RegistryObject<Item> SWORLD = REGISTRY.register("sworld", () -> new SWORLDItem());
	public static final RegistryObject<Item> PRISM = REGISTRY.register("prism", () -> new PrismItem());
	public static final RegistryObject<Item> SNOM = REGISTRY.register("snom", () -> new SnomItem());
	public static final RegistryObject<Item> FORSH = REGISTRY.register("forsh", () -> new ForshItem());
	public static final RegistryObject<Item> DCER = block(FormulaModBlocks.DCER);
	public static final RegistryObject<Item> YESSSSSSS = REGISTRY.register("yesssssss", () -> new YesssssssItem());
	public static final RegistryObject<Item> STARLIG = REGISTRY.register("starlig", () -> new StarligItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
