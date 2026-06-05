package net.daanbanaan.revamped.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.village.poi.PoiType;

public class RevampedPoiTypeTags {
	public static final TagKey<PoiType> VILLAGER_PROFESSIONS = TagKey.create(Registries.POINT_OF_INTEREST_TYPE, ResourceLocation.withDefaultNamespace("acquirable_job_site"));
}
