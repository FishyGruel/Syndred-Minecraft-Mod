package net.syndred.syndred.procedures;

import net.syndred.syndred.init.SyndredModItems;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

public class SoulsteelGathererRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("syndred_soulsteel_fragment_count", 0) > 0) {
			if (entity.isShiftKeyDown()) {
				{
					final String _tagName = "syndred_soulsteel_fragment_count";
					final double _tagValue = 0;
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SyndredModItems.SOULSTEEL_SHARD.get()).copy();
					_setstack.setCount((int) itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("syndred_soulsteel_fragment_count", 0));
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				{
					final String _tagName = "syndred_soulsteel_fragment_count";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("syndred_soulsteel_fragment_count", 0) - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(SyndredModItems.SOULSTEEL_SHARD.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}