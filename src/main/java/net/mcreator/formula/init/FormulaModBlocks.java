
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.formula.block.StarBlock;
import net.mcreator.formula.FormulaMod;

public class FormulaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FormulaMod.MODID);
	public static final RegistryObject<Block> STAR = REGISTRY.register("star", () -> new StarBlock());
}
