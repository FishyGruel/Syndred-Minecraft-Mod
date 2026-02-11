package net.syndred.syndred.item;

import net.syndred.syndred.procedures.SoulsteelGathererRightclickedProcedure;
import net.syndred.syndred.procedures.SoulsteelGathererItemInInventoryTickProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

public class SoulsteelGathererItem extends Item {
	public SoulsteelGathererItem(Item.Properties properties) {
		super(properties.durability(192));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		SoulsteelGathererRightclickedProcedure.execute(entity, entity.getItemInHand(hand));
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		SoulsteelGathererItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), itemstack);
	}
}