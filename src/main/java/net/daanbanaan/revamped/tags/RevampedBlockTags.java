package net.daanbanaan.revamped.tags;

import net.daanbanaan.revamped.Revamped;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class RevampedBlockTags {
	public static final TagKey<Block> WOODEN_MOSAIC = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "wooden_mosaic"));
	public static final TagKey<Block> WOODEN_MOSAIC_STAIRS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "wooden_mosaic_stairs"));
	public static final TagKey<Block> WOODEN_MOSAIC_SLABS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Revamped.MOD_ID, "wooden_mosaic_slabs"));
}
