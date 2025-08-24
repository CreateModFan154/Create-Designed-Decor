
package com.createmodfan.createdesigneddecor.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TransistorItem extends Item {
	public TransistorItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
