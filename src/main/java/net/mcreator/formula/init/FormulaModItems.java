
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.formula.item.AVTOSTARGItem;
import net.mcreator.formula.FormulaMod;

public class FormulaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FormulaMod.MODID);
	public static final RegistryObject<Item> AVTOSTARG = REGISTRY.register("avtostarg", () -> new AVTOSTARGItem());
}
