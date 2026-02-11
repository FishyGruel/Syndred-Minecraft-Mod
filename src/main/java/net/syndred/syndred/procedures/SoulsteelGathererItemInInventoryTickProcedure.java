package net.syndred.syndred.procedures;

import net.syndred.syndred.init.SyndredModItems;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

import java.util.Comparator;

public class SoulsteelGathererItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof ItemEntity) {
					if ((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == SyndredModItems.SOULSTEEL_SHARD.get()) {
						if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("syndred_soulsteel_fragment_count", 0) < itemstack.getMaxDamage()) {
							itemstack.setDamageValue((int) (itemstack.getMaxDamage() - itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("syndred_soulsteel_fragment_count", 0)));
							{
								final String _tagName = "syndred_soulsteel_fragment_count";
								final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDoubleOr("syndred_soulsteel_fragment_count", 0) + 1);
								CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
							}
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			}
		}
	}
}