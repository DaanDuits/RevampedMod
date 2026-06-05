package net.daanbanaan.revamped.datagen;

import net.daanbanaan.revamped.Revamped;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class RevampedItemModelProvider extends ItemModelProvider {

	public RevampedItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, Revamped.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		
	}

}
