package net.syndred.syndred.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MidnightAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 550, 7f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("syndred:midnight_axe_repair_items")));

	public MidnightAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, -3f, properties.fireResistant());
	}
}