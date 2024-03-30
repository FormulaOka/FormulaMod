
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.formula.enchantment.ObzhoghEnchantment;
import net.mcreator.formula.FormulaMod;

public class FormulaModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, FormulaMod.MODID);
	public static final RegistryObject<Enchantment> OBZHOGH = REGISTRY.register("obzhogh", () -> new ObzhoghEnchantment());
}
