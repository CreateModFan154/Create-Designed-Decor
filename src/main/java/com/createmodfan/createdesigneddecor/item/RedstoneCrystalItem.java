
package com.createmodfan.createdesigneddecor.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedstoneCrystalItem extends Item {
	public RedstoneCrystalItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
