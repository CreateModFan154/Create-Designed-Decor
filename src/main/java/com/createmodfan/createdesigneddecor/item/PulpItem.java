
package com.createmodfan.createdesigneddecor.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PulpItem extends Item {
	public PulpItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
