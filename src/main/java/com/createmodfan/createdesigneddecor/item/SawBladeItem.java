
package com.createmodfan.createdesigneddecor.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SawBladeItem extends Item {
	public SawBladeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
