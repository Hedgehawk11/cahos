
package net.mcreator.cahos.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class OhShovelItem extends ShovelItem {
	public OhShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CahosModItems.OH_HO.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
