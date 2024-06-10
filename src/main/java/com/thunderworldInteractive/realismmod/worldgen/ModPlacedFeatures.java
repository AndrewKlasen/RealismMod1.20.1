package com.thunderworldInteractive.realismmod.worldgen;

import com.sun.jna.platform.win32.WinBase;
import com.thunderworldInteractive.realismmod.RealismMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

        public static final ResourceKey<PlacedFeature> BLACK_OPAL_ORE_PLACED_KEY = registerKey("black_opal_ore_placed");

        public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
        public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
        public static final ResourceKey<PlacedFeature> PERIDOT_ORE_PLACED_KEY = registerKey("peridot_ore_placed");
        public static final ResourceKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
        public static final ResourceKey<PlacedFeature> PLUTONIUM_ORE_PLACED_KEY = registerKey("plutonium_ore_placed");
        public static final ResourceKey<PlacedFeature> VANADIUM_ORE_PLACED_KEY = registerKey("vanadium_ore_placed");
        public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");

        public static final ResourceKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
        public static final ResourceKey<PlacedFeature> JADE_ORE_PLACED_KEY = registerKey("jade_ore_placed");
        public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");
        public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
        public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
        public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
        public static final ResourceKey<PlacedFeature> CHROMIUM_ORE_PLACED_KEY = registerKey("chromium_ore_placed");


        public static final ResourceKey<PlacedFeature> RED_DIAMOND_ORE_PLACED_KEY = registerKey("red_diamond_ore_placed");
        public static final ResourceKey<PlacedFeature> BLUE_DIAMOND_ORE_PLACED_KEY = registerKey("blue_diamond_ore_placed");
        public static final ResourceKey<PlacedFeature> GREEN_DIAMOND_ORE_PLACED_KEY = registerKey("green_diamond_ore_placed");
        public static final ResourceKey<PlacedFeature> YELLOW_DIAMOND_ORE_PLACED_KEY = registerKey("yellow_diamond_ore_placed");
        public static final ResourceKey<PlacedFeature> ORANGE_DIAMOND_ORE_PLACED_KEY = registerKey("orange_diamond_ore_placed");
        public static final ResourceKey<PlacedFeature> PINK_DIAMOND_ORE_PLACED_KEY = registerKey("pink_diamond_ore_placed");
        public static final ResourceKey<PlacedFeature> PURPLE_DIAMOND_PLACED_KEY = registerKey("purple_diamond_ore_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
            HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

            register(context, BLACK_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_BLACK_OPAL_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

            register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, PERIDOT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PERIDOT_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TITANIUM_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, PLUTONIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLUTONIUM_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, VANADIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_VANADIUM_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_NICKEL_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

            register(context, COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_COBALT_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, JADE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_JADE_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZINC_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4, HeightRangePlacement
                            .triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, ALUMINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ALUMINUM_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4,
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
            register(context, CHROMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CHROMIUM_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4,
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));


            register(context, RED_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RED_DIAMOND_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
            register(context, BLUE_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_BLUE_DIAMOND_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
            register(context, GREEN_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GREEN_DIAMOND_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
            register(context, YELLOW_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_YELLOW_DIAMOND_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
            register(context, ORANGE_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ORANGE_DIAMOND_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
            register(context, PINK_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PINK_DIAMOND_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
            register(context, PURPLE_DIAMOND_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PURPLE_DIAMOND_ORE_KEY),
                    ModOrePlacement.commonOrePlacement(4,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    }


        private static ResourceKey<PlacedFeature> registerKey(String name) {
            return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RealismMod.MOD_ID, name));
        }

        private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                     List<PlacementModifier> modifiers) {
            context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
        }
    }

