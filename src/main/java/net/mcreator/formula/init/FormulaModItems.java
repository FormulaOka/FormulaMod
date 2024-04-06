
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.formula.item.StardItem;
import net.mcreator.formula.item.SabliaItem;
import net.mcreator.formula.item.STARItem;
import net.mcreator.formula.item.ForgItem;
import net.mcreator.formula.item.DaimItem;
import net.mcreator.formula.FormulaMod;

public class FormulaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FormulaMod.MODID);
	public static final RegistryObject<Item> FORG = REGISTRY.register("forg", () -> new ForgItem());
	public static final RegistryObject<Item> STAR_HELMET = REGISTRY.register("star_helmet", () -> new STARItem.Helmet());
	public static final RegistryObject<Item> STAR_CHESTPLATE = REGISTRY.register("star_chestplate", () -> new STARItem.Chestplate());
	public static final RegistryObject<Item> STAR_LEGGINGS = REGISTRY.register("star_leggings", () -> new STARItem.Leggings());
	public static final RegistryObject<Item> STAR_BOOTS = REGISTRY.register("star_boots", () -> new STARItem.Boots());
	public static final RegistryObject<Item> STARD = REGISTRY.register("stard", () -> new StardItem());
	public static final RegistryObject<Item> DAIM = REGISTRY.register("daim", () -> new DaimItem());
	public static final RegistryObject<Item> FORMULA_OAK_SPAWN_EGG = REGISTRY.register("formula_oak_spawn_egg", () -> new ForgeSpawnEggItem(FormulaModEntities.FORMULA_OAK, -39424, -52480, new Item.Properties()));
	public static final RegistryObject<Item> SABLIA = REGISTRY.register("sablia", () -> new SabliaItem());
}
