
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.formula.FormulaMod;

public class FormulaModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, FormulaMod.MODID);
	public static final RegistryObject<Potion> FORMULAS = REGISTRY.register("formulas", () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 69849, 137, false, true), new MobEffectInstance(MobEffects.JUMP, 49006, 3, false, true),
			new MobEffectInstance(MobEffects.POISON, 3636, 20, false, true), new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 6, false, true)));
}
