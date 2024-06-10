package com.thunderworldInteractive.realismmod.worldgen;

import com.sun.jna.platform.win32.WinNT;
import com.thunderworldInteractive.realismmod.RealismMod;
import com.thunderworldInteractive.realismmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLACK_OPAL_ORE_KEY = registerKey("black_opal_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PERIDOT_ORE_KEY = registerKey("peridot_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLUTONIUM_ORE_KEY = registerKey("plutonium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_VANADIUM_ORE_KEY = registerKey("vanadium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NICKEL_ORE_KEY = registerKey("nickel_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_JADE_ORE_KEY = registerKey("jade_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZINC_ORE_KEY = registerKey("zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINUM_ORE_KEY = registerKey("aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHROMIUM_ORE_KEY = registerKey("chromium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_DIAMOND_ORE_KEY = registerKey("red_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLUE_DIAMOND_ORE_KEY = registerKey("blue_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREEN_DIAMOND_ORE_KEY = registerKey("green_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_YELLOW_DIAMOND_ORE_KEY = registerKey("yellow_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORANGE_DIAMOND_ORE_KEY = registerKey("orange_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PINK_DIAMOND_ORE_KEY = registerKey("pink_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PURPLE_DIAMOND_ORE_KEY = registerKey("purple_diamond_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceabeles = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceabeles = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);


        List<OreConfiguration.TargetBlockState> overworldBlackOpalOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_BLACK_OPAL.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_BLACK_OPAL.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_RUBY.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_RUBY.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_SAPPHIRE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_SAPPHIRE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPeridotOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_PERIDOT.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_PERIDOT.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTitaniumOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_TITANIUM.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_TITANIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPlutoniumOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_PLUTONIUM.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_PLUTONIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldVanadiumOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_VANADIUM.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_VANADIUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldNickelOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_NICKEL.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_NICKEL.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCobaltOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_COBALT.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_COBALT.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldJadeOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_JADE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_JADE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldZincOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_ZINC.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_ZINC.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_TIN.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_TIN.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldAluminumOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_ALUMINUM.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_ALUMINUM.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_SILVER.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_SILVER.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldChromiumOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_CHROMIUM.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.ORE_CHROMIUM.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldRedDiamondOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_RED_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_ORE_RED_DIAMOND.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldBlueDiamondOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_BLUE_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldGreenDiamondOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_GREEN_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldYellowDiamondOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_YELLOW_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldOrangeDiamondOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_ORANGE_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPinkDiamondOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_PINK_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPurpleDiamondOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.ORE_PURPLE_DIAMOND.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND.get().defaultBlockState()));


        register(context, OVERWORLD_BLACK_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBlackOpalOres, 6));

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 6));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 6));
        register(context, OVERWORLD_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPeridotOres, 6));
        register(context, OVERWORLD_TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTitaniumOres, 6));
        register(context, OVERWORLD_PLUTONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlutoniumOres, 6));
        register(context, OVERWORLD_VANADIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldVanadiumOres, 6));
        register(context, OVERWORLD_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNickelOres, 6));

        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, 6));
        register(context, OVERWORLD_JADE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldJadeOres, 6));
        register(context, OVERWORLD_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZincOres, 6));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 6));
        register(context, OVERWORLD_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluminumOres, 6));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres, 6));
        register(context, OVERWORLD_CHROMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldChromiumOres, 6));


        register(context, OVERWORLD_RED_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRedDiamondOres, 4));
        register(context, OVERWORLD_BLUE_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBlueDiamondOres, 4));
        register(context, OVERWORLD_GREEN_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGreenDiamondOres, 4));
        register(context, OVERWORLD_YELLOW_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldYellowDiamondOres, 4));
        register(context, OVERWORLD_ORANGE_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOrangeDiamondOres, 4));
        register(context, OVERWORLD_PINK_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPinkDiamondOres, 4));
        register(context, OVERWORLD_PURPLE_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPurpleDiamondOres, 4));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(RealismMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
