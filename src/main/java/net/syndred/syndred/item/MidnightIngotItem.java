package net.syndred.syndred.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class MidnightIngotItem extends Item {
	public MidnightIngotItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}