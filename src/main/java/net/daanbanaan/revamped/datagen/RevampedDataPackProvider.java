package net.daanbanaan.revamped.datagen;

import net.daanbanaan.revamped.Revamped;
import net.daanbanaan.revamped.worldgen.RevampedBiomeModifiers;
import net.daanbanaan.revamped.worldgen.RevampedConfiguredFeatures;
import net.daanbanaan.revamped.worldgen.RevampedPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class RevampedDataPackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, RevampedConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, RevampedPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, RevampedBiomeModifiers::bootstrap);

    public RevampedDataPackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider, BUILDER, Set.of(Revamped.MOD_ID));
    }
}
