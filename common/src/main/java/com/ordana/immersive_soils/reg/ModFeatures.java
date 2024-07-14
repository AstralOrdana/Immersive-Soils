package com.ordana.immersive_soils.reg;

import com.ordana.immersive_soils.ImmersiveSoils;
import com.ordana.immersive_soils.PlatformSpecific;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModFeatures {

    public static void init() {

        ResourceKey<PlacedFeature> loam = ResourceKey.create(Registries.PLACED_FEATURE, ImmersiveSoils.res("loam"));
        PlatformSpecific.addFeatureToBiome(GenerationStep.Decoration.RAW_GENERATION, ModTags.HAS_LOAM, loam);

        ResourceKey<PlacedFeature> silt = ResourceKey.create(Registries.PLACED_FEATURE, ImmersiveSoils.res("silt"));
        PlatformSpecific.addFeatureToBiome(GenerationStep.Decoration.RAW_GENERATION, ModTags.HAS_SILT, silt);

        ResourceKey<PlacedFeature> silt_aquifer = ResourceKey.create(Registries.PLACED_FEATURE, ImmersiveSoils.res("silt_aquifer"));
        PlatformSpecific.addFeatureToBiome(GenerationStep.Decoration.RAW_GENERATION, BiomeTags.IS_OVERWORLD, silt_aquifer);

        ResourceKey<PlacedFeature> sandy_dirt = ResourceKey.create(Registries.PLACED_FEATURE, ImmersiveSoils.res("sandy_dirt"));
        PlatformSpecific.addFeatureToBiome(GenerationStep.Decoration.RAW_GENERATION, ModTags.HAS_SANDY_DIRT, sandy_dirt);

        ResourceKey<PlacedFeature> earthen_clay = ResourceKey.create(Registries.PLACED_FEATURE, ImmersiveSoils.res("earthen_clay"));
        PlatformSpecific.addFeatureToBiome(GenerationStep.Decoration.RAW_GENERATION, ModTags.HAS_EARTHEN_CLAY, earthen_clay);

        ResourceKey<PlacedFeature> permafrost = ResourceKey.create(Registries.PLACED_FEATURE, ImmersiveSoils.res("permafrost"));
        PlatformSpecific.addFeatureToBiome(GenerationStep.Decoration.RAW_GENERATION, ModTags.HAS_PERMAFROST, permafrost);

        ResourceKey<PlacedFeature> dry_lakebed = ResourceKey.create(Registries.PLACED_FEATURE, ImmersiveSoils.res("dry_lakebed"));
        PlatformSpecific.addFeatureToBiome(GenerationStep.Decoration.RAW_GENERATION, ModTags.HAS_LAKEBED, dry_lakebed);

        ResourceKey<PlacedFeature> dry_lakebed_large = ResourceKey.create(Registries.PLACED_FEATURE, ImmersiveSoils.res("dry_lakebed_large"));
        PlatformSpecific.addFeatureToBiome(GenerationStep.Decoration.RAW_GENERATION, ModTags.HAS_LAKEBED, dry_lakebed_large);

    }
}
