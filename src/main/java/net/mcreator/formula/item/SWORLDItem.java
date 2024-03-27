
package net.mcreator.formula.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SWORLDItem extends PickaxeItem {
	public SWORLDItem() {
		super(new Tier() {
			public int getUses() {
				return 9156;
			}

			public float getSpeed() {
				return 90000f;
			}

			public float getAttackDamageBonus() {
				return 90997f;
			}

			public int getLevel() {
				return 100;
			}

			public int getEnchantmentValue() {
				return 90000;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHER_STAR));
			}
		}, 1, 96f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
