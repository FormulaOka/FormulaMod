
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.formula.item.StarItem;
import net.mcreator.formula.item.SolniechnyswordItem;
import net.mcreator.formula.FormulaMod;

public class FormulaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FormulaMod.MODID);
	public static final RegistryObject<Item> SOLNIECHNYSWORD = REGISTRY.register("solniechnysword", () -> new SolniechnyswordItem());
	public static final RegistryObject<Item> STAR = REGISTRY.register("star", () -> new StarItem());
	public static final RegistryObject<Item> ELIK_SPAWN_EGG = REGISTRY.register("elik_spawn_egg", () -> new ForgeSpawnEggItem(FormulaModEntities.ELIK, -1, -1, new Item.Properties()));
}
