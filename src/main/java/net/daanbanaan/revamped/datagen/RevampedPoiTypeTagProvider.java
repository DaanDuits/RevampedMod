package net.daanbanaan.revamped.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup.Provider;
import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.tags.RevampedPoiTypeTags;
import net.daanbanaan.revamped.villager.poi.RevampedPois;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PoiTypeTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class RevampedPoiTypeTagProvider extends PoiTypeTagsProvider{
	
	public RevampedPoiTypeTagProvider(PackOutput output, CompletableFuture<Provider> provider,
			@Nullable ExistingFileHelper existingFileHelper) {
		super(output, provider, Revamped.MOD_ID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {
		tag(RevampedPoiTypeTags.VILLAGER_PROFESSIONS)
		.add(RevampedPois.LUMBERJACK_POI.getKey());
	}


}
