
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.formula.item.SwordxItem;
import net.mcreator.formula.item.StarXItem;
import net.mcreator.formula.item.DimaindItem;
import net.mcreator.formula.FormulaMod;

public class FormulaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FormulaMod.MODID);
	public static final RegistryObject<Item> STAR_X_HELMET = REGISTRY.register("star_x_helmet", () -> new StarXItem.Helmet());
	public static final RegistryObject<Item> STAR_X_CHESTPLATE = REGISTRY.register("star_x_chestplate", () -> new StarXItem.Chestplate());
	public static final RegistryObject<Item> STAR_X_LEGGINGS = REGISTRY.register("star_x_leggings", () -> new StarXItem.Leggings());
	public static final RegistryObject<Item> STAR_X_BOOTS = REGISTRY.register("star_x_boots", () -> new StarXItem.Boots());
	public static final RegistryObject<Item> DIMAIND = REGISTRY.register("dimaind", () -> new DimaindItem());
	public static final RegistryObject<Item> SWORDX = REGISTRY.register("swordx", () -> new SwordxItem());
}
