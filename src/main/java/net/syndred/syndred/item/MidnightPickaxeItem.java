package net.syndred.syndred.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MidnightPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 550, 7f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("syndred:midnight_pickaxe_repair_items")));

	public MidnightPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 0.5f, -2.8f).fireResistant());
	}
}