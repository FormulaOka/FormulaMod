
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.formula.item.StikItem;
import net.mcreator.formula.item.StershItem;
import net.mcreator.formula.item.StardItem;
import net.mcreator.formula.item.STARItem;
import net.mcreator.formula.item.PrismItem;
import net.mcreator.formula.item.ParoshokItem;
import net.mcreator.formula.item.ForgItem;
import net.mcreator.formula.item.DaimItem;
import net.mcreator.formula.item.ChargeItem;
import net.mcreator.formula.FormulaMod;

public class FormulaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FormulaMod.MODID);
	public static final RegistryObject<Item> FORG = REGISTRY.register("forg", () -> new ForgItem());
	public static final RegistryObject<Item> STAR_HELMET = REGISTRY.register("star_helmet", () -> new STARItem.Helmet());
	public static final RegistryObject<Item> STAR_CHESTPLATE = REGISTRY.register("star_chestplate", () -> new STARItem.Chestplate());
	public static final RegistryObject<Item> STAR_LEGGINGS = REGISTRY.register("star_leggings", () -> new STARItem.Leggings());
	public static final RegistryObject<Item> STAR_BOOTS = REGISTRY.register("star_boots", () -> new STARItem.Boots());
	public static final RegistryObject<Item> STARD = REGISTRY.register("stard", () -> new StardItem());
	public static final RegistryObject<Item> PRISM = REGISTRY.register("prism", () -> new PrismItem());
	public static final RegistryObject<Item> STERSH = REGISTRY.register("stersh", () -> new StershItem());
	public static final RegistryObject<Item> PAROSHOK = REGISTRY.register("paroshok", () -> new ParoshokItem());
	public static final RegistryObject<Item> STIK = REGISTRY.register("stik", () -> new StikItem());
	public static final RegistryObject<Item> DAIM = REGISTRY.register("daim", () -> new DaimItem());
	public static final RegistryObject<Item> CHARGE = REGISTRY.register("charge", () -> new ChargeItem());
}
