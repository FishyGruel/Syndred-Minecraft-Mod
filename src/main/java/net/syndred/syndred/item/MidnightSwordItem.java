package net.syndred.syndred.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MidnightSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 550, 7f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("syndred:midnight_sword_repair_items")));

	public MidnightSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 2f, -2.4f).fireResistant());
	}
}