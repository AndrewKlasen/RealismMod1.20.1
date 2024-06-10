package com.thunderworldInteractive.realismmod.datagen.loot;

import com.thunderworldInteractive.realismmod.block.ModBlocks;
import com.thunderworldInteractive.realismmod.block.custom.RedPepperCropBlock;
import com.thunderworldInteractive.realismmod.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //Diamond Blocks
        this.dropSelf(ModBlocks.BLACK_OPAL_BLOCK.get());
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.PERIDOT_BLOCK.get());
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.NICKEL_BLOCK.get());
        this.dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.VANADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PLUTONIUM_BLOCK.get());

        this.dropSelf(ModBlocks.BLOCK_RED_DIAMOND.get());
        this.dropSelf(ModBlocks.BLOCK_BLUE_DIAMOND.get());
        this.dropSelf(ModBlocks.BLOCK_GREEN_DIAMOND.get());
        this.dropSelf(ModBlocks.BLOCK_YELLOW_DIAMOND.get());
        this.dropSelf(ModBlocks.BLOCK_ORANGE_DIAMOND.get());
        this.dropSelf(ModBlocks.BLOCK_PINK_DIAMOND.get());
        this.dropSelf(ModBlocks.BLOCK_PURPLE_DIAMOND.get());

        this.add(ModBlocks.ORE_BLACK_OPAL.get(),
                block -> createOreDrop(ModBlocks.ORE_BLACK_OPAL.get(), ModItems.RAW_BLACK_OPAL.get()));
        this.add(ModBlocks.ORE_TIN.get(),
                block -> createOreDrop(ModBlocks.ORE_TIN.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.ORE_ALUMINUM.get(),
                block -> createOreDrop(ModBlocks.ORE_ALUMINUM.get(), ModItems.RAW_ALUMINUM.get()));
        this.add(ModBlocks.ORE_JADE.get(),
                block -> createOreDrop(ModBlocks.ORE_JADE.get(), ModItems.RAW_JADE.get()));
        this.add(ModBlocks.ORE_COBALT.get(),
                block -> createOreDrop(ModBlocks.ORE_COBALT.get(), ModItems.RAW_COBALT.get()));
        this.add(ModBlocks.ORE_CHROMIUM.get(),
                block -> createOreDrop(ModBlocks.ORE_CHROMIUM.get(), ModItems.RAW_CHROMIUM.get()));
        this.add(ModBlocks.ORE_BLACK_OPAL.get(),
                block -> createOreDrop(ModBlocks.ORE_BLACK_OPAL.get(), ModItems.RAW_BLACK_OPAL.get()));
        this.add(ModBlocks.ORE_SILVER.get(),
                block -> createOreDrop(ModBlocks.ORE_SILVER.get(), ModItems.RAW_SILVER.get()));

        this.add(ModBlocks.ORE_RUBY.get(),
                block -> createOreDrop(ModBlocks.ORE_RUBY.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.ORE_SAPPHIRE.get(),
                block -> createOreDrop(ModBlocks.ORE_SAPPHIRE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.ORE_PERIDOT.get(),
                block -> createOreDrop(ModBlocks.ORE_PERIDOT.get(), ModItems.RAW_PERIDOT.get()));
        this.add(ModBlocks.ORE_VANADIUM.get(),
                block -> createOreDrop(ModBlocks.ORE_VANADIUM.get(), ModItems.RAW_VANADIUM.get()));
        this.add(ModBlocks.ORE_PLUTONIUM.get(),
                block -> createOreDrop(ModBlocks.ORE_PLUTONIUM.get(), ModItems.RAW_PLUTONIUM.get()));
        this.add(ModBlocks.ORE_ZINC.get(),
                block -> createOreDrop(ModBlocks.ORE_ZINC.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.ORE_NICKEL.get(),
                block -> createOreDrop(ModBlocks.ORE_NICKEL.get(), ModItems.NICKEL_INGOT.get()));
        this.add(ModBlocks.ORE_TITANIUM.get(),
                block -> createOreDrop(ModBlocks.ORE_TITANIUM.get(), ModItems.TITANIUM_INGOT.get()));

        this.add(ModBlocks.ORE_RED_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.ORE_RED_DIAMOND.get(), ModItems.DIAMOND_RED.get()));
        this.add(ModBlocks.ORE_BLUE_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.ORE_BLUE_DIAMOND.get(), ModItems.DIAMOND_BLUE.get()));
        this.add(ModBlocks.ORE_GREEN_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.ORE_GREEN_DIAMOND.get(), ModItems.DIAMOND_GREEN.get()));
        this.add(ModBlocks.ORE_YELLOW_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.ORE_YELLOW_DIAMOND.get(), ModItems.DIAMOND_YELLOW.get()));
        this.add(ModBlocks.ORE_ORANGE_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.ORE_ORANGE_DIAMOND.get(), ModItems.DIAMOND_ORANGE.get()));
        this.add(ModBlocks.ORE_PINK_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.ORE_PINK_DIAMOND.get(), ModItems.DIAMOND_PINK.get()));
        this.add(ModBlocks.ORE_PURPLE_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.ORE_PURPLE_DIAMOND.get(), ModItems.DIAMOND_PURPLE.get()));

        this.add(ModBlocks.DEEPSLATE_ORE_RED_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ORE_RED_DIAMOND.get(), ModItems.DIAMOND_RED.get()));
        this.add(ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND.get(), ModItems.DIAMOND_BLUE.get()));
        this.add(ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND.get(), ModItems.DIAMOND_GREEN.get()));
        this.add(ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND.get(), ModItems.DIAMOND_YELLOW.get()));
        this.add(ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND.get(), ModItems.DIAMOND_ORANGE.get()));
        this.add(ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND.get(), ModItems.DIAMOND_PINK.get()));
        this.add(ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND.get(), ModItems.DIAMOND_PURPLE.get()));

        //Crops
        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.REDPEPPER_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(RedPepperCropBlock.AGE,4));
        this.add(ModBlocks.REDPEPPER_CROP.get(), this.createCropDrops(ModBlocks.REDPEPPER_CROP.get(), ModItems.REDPEPPER.get(), ModItems.REDPEPPER.get(), lootitemcondition$builder1));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
