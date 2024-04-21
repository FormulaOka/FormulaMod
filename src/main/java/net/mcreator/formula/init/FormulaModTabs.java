
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FormulaModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("formula", "formulax"),
				builder -> builder.title(Component.translatable("item_group.formula.formulax")).icon(() -> new ItemStack(FormulaModItems.DIMAIND.get())).displayItems((parameters, tabData) -> {
					tabData.accept(FormulaModItems.STAR_X_HELMET.get());
					tabData.accept(FormulaModItems.STAR_X_CHESTPLATE.get());
					tabData.accept(FormulaModItems.STAR_X_LEGGINGS.get());
					tabData.accept(FormulaModItems.STAR_X_BOOTS.get());
					tabData.accept(FormulaModItems.SWORDX.get());
				}).withSearchBar());
	}
}
