package com.thunderworldInteractive.realismmod.datagen;

import com.thunderworldInteractive.realismmod.RealismMod;
import com.thunderworldInteractive.realismmod.block.ModBlocks;
import com.thunderworldInteractive.realismmod.block.custom.RedPepperCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

import java.util.function.Function;

public class ModBlockStateProvidor extends BlockStateProvider {
    public ModBlockStateProvidor(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RealismMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLACK_OPAL_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.PERIDOT_BLOCK);
        blockWithItem(ModBlocks.NICKEL_BLOCK);
        blockWithItem(ModBlocks.ORE_CHROMIUM);
        blockWithItem(ModBlocks.ORE_RUBY);
        blockWithItem(ModBlocks.ORE_SAPPHIRE);
        blockWithItem(ModBlocks.ORE_PERIDOT);
        blockWithItem(ModBlocks.ORE_SILVER);
        blockWithItem(ModBlocks.PLUTONIUM_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.VANADIUM_BLOCK);
        blockWithItem(ModBlocks.ORE_BLACK_OPAL);
        blockWithItem(ModBlocks.ORE_TITANIUM);
        blockWithItem(ModBlocks.ORE_VANADIUM);
        blockWithItem(ModBlocks.ORE_NICKEL);
        blockWithItem(ModBlocks.ORE_COBALT);
        blockWithItem(ModBlocks.ORE_JADE);
        blockWithItem(ModBlocks.ORE_ZINC);
        blockWithItem(ModBlocks.ORE_TIN);
        blockWithItem(ModBlocks.ORE_ALUMINUM);

        blockWithItem(ModBlocks.ORE_PLUTONIUM);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        
        blockWithItem(ModBlocks.BLOCK_BLUE_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_RED_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_GREEN_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_ORANGE_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_YELLOW_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_PINK_DIAMOND);
        blockWithItem(ModBlocks.BLOCK_PURPLE_DIAMOND);

        blockWithItem(ModBlocks.ORE_BLUE_DIAMOND);
        blockWithItem(ModBlocks.ORE_RED_DIAMOND);
        blockWithItem(ModBlocks.ORE_GREEN_DIAMOND);
        blockWithItem(ModBlocks.ORE_ORANGE_DIAMOND);
        blockWithItem(ModBlocks.ORE_YELLOW_DIAMOND);
        blockWithItem(ModBlocks.ORE_PINK_DIAMOND);
        blockWithItem(ModBlocks.ORE_PURPLE_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_RED_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND);

        makeCrop(((RedPepperCropBlock)ModBlocks.REDPEPPER_CROP.get()), "redpepper_stage_", "redpepper_stage_");
    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((RedPepperCropBlock) block).getAgeProperty()),
                new ResourceLocation(RealismMod.MOD_ID, "block/" + textureName + state.getValue(((RedPepperCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
