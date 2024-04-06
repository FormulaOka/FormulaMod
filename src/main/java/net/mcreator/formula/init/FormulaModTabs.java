
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.formula.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FormulaModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(FormulaModItems.STAR_HELMET.get());
			tabData.accept(FormulaModItems.STAR_CHESTPLATE.get());
			tabData.accept(FormulaModItems.STAR_LEGGINGS.get());
			tabData.accept(FormulaModItems.STAR_BOOTS.get());
			tabData.accept(FormulaModItems.SABLIA.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FormulaModItems.FORMULA_OAK_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FormulaModItems.FORG.get());
			tabData.accept(FormulaModItems.STARD.get());
		}
	}
}
