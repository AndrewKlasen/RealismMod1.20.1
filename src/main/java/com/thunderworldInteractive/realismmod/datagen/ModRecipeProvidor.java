package com.thunderworldInteractive.realismmod.datagen;

import com.thunderworldInteractive.realismmod.block.ModBlocks;
import com.thunderworldInteractive.realismmod.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.lwjgl.openal.AL;

import javax.swing.text.ComponentView;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvidor extends RecipeProvider implements IConditionBuilder {
    private List<ItemLike> RED_DIAMOND_SMELTABLES = List.of(ModBlocks.ORE_RED_DIAMOND.get(),ModBlocks.DEEPSLATE_ORE_RED_DIAMOND.get());
    private List<ItemLike> BLUE_DIAMOND_SMELTABLES = List.of(ModBlocks.ORE_BLUE_DIAMOND.get(),ModBlocks.DEEPSLATE_ORE_BLUE_DIAMOND.get());
    private List<ItemLike> GREEN_DIAMOND_SMELTABLES = List.of(ModBlocks.ORE_GREEN_DIAMOND.get(),ModBlocks.DEEPSLATE_ORE_GREEN_DIAMOND.get());
    private List<ItemLike> YELLOW_DIAMOND_SMELTABLES = List.of(ModBlocks.ORE_YELLOW_DIAMOND.get(),ModBlocks.DEEPSLATE_ORE_YELLOW_DIAMOND.get());
    private List<ItemLike> ORANGE_DIAMOND_SMELTABLES = List.of(ModBlocks.BLOCK_ORANGE_DIAMOND.get(),ModBlocks.DEEPSLATE_ORE_ORANGE_DIAMOND.get());
    private List<ItemLike> PINK_DIAMOND_SMELTABLES = List.of(ModBlocks.ORE_PINK_DIAMOND.get(),ModBlocks.DEEPSLATE_ORE_PINK_DIAMOND.get());
    private List<ItemLike> PURPLE_DIAMOND_SMELTABLES = List.of(ModBlocks.ORE_PURPLE_DIAMOND.get(),ModBlocks.DEEPSLATE_ORE_PURPLE_DIAMOND.get());

    private List<ItemLike> BLACK_OPAL_SMELTABLES = List.of(ModBlocks.ORE_BLACK_OPAL.get(), ModItems.RAW_BLACK_OPAL.get());
    private List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.ORE_RUBY.get(),ModItems.RAW_RUBY.get());
    private List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModBlocks.ORE_SAPPHIRE.get(), ModItems.RAW_SAPPHIRE.get());
    private List<ItemLike> PERIDOT_SMELTABLES = List.of(ModBlocks.ORE_PERIDOT.get(), ModItems.RAW_PERIDOT.get());
    private List<ItemLike> VANADIUM_SMELTABLES = List.of(ModBlocks.ORE_VANADIUM.get(), ModItems.RAW_VANADIUM.get());
    private List<ItemLike> TITANIUM_SMELTABLES = List.of(ModBlocks.ORE_TITANIUM.get());
    private List<ItemLike> PLUTONIUM_SMELTABLES = List.of(ModBlocks.ORE_PLUTONIUM.get(), ModItems.RAW_PLUTONIUM.get());


    private List<ItemLike> TIN_SMELTABLES = List.of(ModBlocks.ORE_TIN.get(), ModItems.RAW_TIN.get());
    private List<ItemLike> ALUMINUM_SMELTABLES = List.of(ModBlocks.ORE_ALUMINUM.get(),ModItems.RAW_ALUMINUM.get());
    private List<ItemLike> JADE_SMELTABLES = List.of(ModBlocks.ORE_JADE.get(), ModItems.RAW_JADE.get());
    private List<ItemLike> COBALT_SMELTABLES = List.of(ModBlocks.ORE_COBALT.get(), ModItems.RAW_COBALT.get());
    private List<ItemLike> CHROMIUM_SMELTABLES = List.of(ModBlocks.ORE_CHROMIUM.get(), ModItems.RAW_CHROMIUM.get());
    private List<ItemLike> ZINC_SMELTABLES = List.of(ModBlocks.ORE_ZINC.get(), ModItems.RAW_ZINC.get());
    private List<ItemLike> SILVER_SMELTABLES = List.of(ModBlocks.ORE_SILVER.get(), ModItems.RAW_SILVER.get());
    public ModRecipeProvidor(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
     /**   ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_OPAL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BLACK_OPAL.get())
                .unlockedBy("has_blackopal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLACK_OPAL.get()).build()))
                .save(pWriter); **/

     //Diamonds
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_RED.get(), 9).requires(ModBlocks.BLOCK_RED_DIAMOND.get())
                .unlockedBy("has_red_diamond_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_BLUE.get(), 9).requires(ModBlocks.BLOCK_BLUE_DIAMOND.get())
                .unlockedBy("has_blue_diamond_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_GREEN.get(), 9).requires(ModBlocks.BLOCK_GREEN_DIAMOND.get())
                .unlockedBy("has_green_diamond_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_YELLOW.get(), 9).requires(ModBlocks.BLOCK_YELLOW_DIAMOND.get())
                .unlockedBy("has_yellow_diamond_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_ORANGE.get(), 9).requires(ModBlocks.BLOCK_ORANGE_DIAMOND.get())
                .unlockedBy("has_orange_diamond_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_PINK.get(), 9).requires(ModBlocks.BLOCK_PINK_DIAMOND.get())
                .unlockedBy("has_pink_diamond_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_PURPLE.get(), 9).requires(ModBlocks.BLOCK_PURPLE_DIAMOND.get())
                .unlockedBy("has_purple_diamond_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
                .save(pWriter);

        //Otehr Gems
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLACK_OPAL.get(), 9).requires(ModBlocks.BLACK_OPAL_BLOCK.get())
                .unlockedBy("has_blackopal_block", inventoryTrigger(ItemPredicate.Builder.item()
                    .of(ModBlocks.BLACK_OPAL_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9).requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy("has_ruby_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RUBY_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9).requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy("has_sapphire_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.SAPPHIRE_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PERIDOT.get(), 9).requires(ModBlocks.PERIDOT_BLOCK.get())
                .unlockedBy("has_peridot_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PERIDOT_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 9).requires(ModBlocks.TITANIUM_BLOCK.get())
                .unlockedBy("has_titanium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TITANIUM_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLUTONIUM_INGOT.get(), 9).requires(ModBlocks.PLUTONIUM_BLOCK.get())
                .unlockedBy("has_plutonium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PLUTONIUM_BLOCK.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANADIUM.get(), 9).requires(ModBlocks.VANADIUM_BLOCK.get())
                .unlockedBy("has_vanadium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.VANADIUM_BLOCK.get()).build()))
                .save(pWriter);


        //Diamond Blocks
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_RED.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_RED_DIAMOND.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_BLUE.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_BLUE_DIAMOND.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_GREEN.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_GREEN_DIAMOND.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_ORANGE.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_ORANGE_DIAMOND.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_YELLOW.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_YELLOW_DIAMOND.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_PINK.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_PINK_DIAMOND.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_PURPLE.get(), RecipeCategory.MISC,
                ModBlocks.BLOCK_PURPLE_DIAMOND.get());


        //Gem Blocks
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLACK_OPAL.get(), RecipeCategory.MISC,
                ModBlocks.BLACK_OPAL_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(), RecipeCategory.MISC,
                ModBlocks.RUBY_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE.get(), RecipeCategory.MISC,
                ModBlocks.SAPPHIRE_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.PERIDOT.get(), RecipeCategory.MISC,
                ModBlocks.PERIDOT_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.VANADIUM.get(), RecipeCategory.MISC,
                ModBlocks.VANADIUM_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.PLUTONIUM_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.PLUTONIUM_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.TITANIUM_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.NICKEL_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.NICKEL_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.STEEL_BLOCK.get());

        //Diamond Smelting
        oreSmelting(pWriter, RED_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_RED.get(), 1.0F, 100, "red_diamond");
        oreBlasting(pWriter, RED_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_RED.get(), 1.0F, 50, "red_diamond");

        oreSmelting(pWriter, BLUE_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_BLUE.get(), 1.0F, 100, "blue_diamond");
        oreBlasting(pWriter, BLUE_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_BLUE.get(), 1.0F, 50, "blue_diamond");

        oreSmelting(pWriter, GREEN_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_GREEN.get(), 1.0F, 100, "green_diamond");
        oreBlasting(pWriter, GREEN_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_GREEN.get(), 1.0F, 50, "green_diamond");

        oreSmelting(pWriter, YELLOW_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_YELLOW.get(), 1.0F, 100, "yellow_diamond");
        oreBlasting(pWriter, YELLOW_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_YELLOW.get(), 1.0F, 50, "yellow_diamond");

        oreSmelting(pWriter, ORANGE_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_ORANGE.get(), 1.0F, 100, "orange_diamond");
        oreBlasting(pWriter, ORANGE_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_ORANGE.get(), 1.0F, 50, "orange_diamond");

        oreSmelting(pWriter, PINK_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_PINK.get(), 1.0F, 100, "pink_diamond");
        oreBlasting(pWriter, PINK_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_PINK.get(), 1.0F, 50, "pink_diamond");

        oreSmelting(pWriter, PURPLE_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_PURPLE.get(), 1.0F, 100, "purple_diamond");
        oreBlasting(pWriter, PURPLE_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.DIAMOND_PURPLE.get(), 1.0F, 50, "purple_diamond");

        //Other Gems
        oreSmelting(pWriter, BLACK_OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_OPAL.get(), 1.0F, 100, "black_opal");
        oreBlasting(pWriter, BLACK_OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_OPAL.get(), 1.0F, 50, "black_opal");

        oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 1.0F, 100, "ruby");
        oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 1.0F, 50, "ruby");

        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 1.0F, 100, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 1.0F, 50, "sapphire");

        oreSmelting(pWriter, PERIDOT_SMELTABLES, RecipeCategory.MISC, ModItems.PERIDOT.get(), 1.0F, 100, "peridot");
        oreBlasting(pWriter, PERIDOT_SMELTABLES, RecipeCategory.MISC, ModItems.PERIDOT.get(), 1.0F, 50, "peridot");

        oreSmelting(pWriter, VANADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.VANADIUM.get(), 1.0F, 100, "vanadium");
        oreBlasting(pWriter, VANADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.VANADIUM.get(), 1.0F, 50, "vanadium");

        oreSmelting(pWriter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 1.0F, 100, "titanium_ingot");
        oreBlasting(pWriter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 1.0F, 50, "titanium_ingot");

        oreSmelting(pWriter, PLUTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLUTONIUM_INGOT.get(), 1.0F, 100, "plutonium_ingot");
        oreBlasting(pWriter, PLUTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLUTONIUM_INGOT.get(), 1.0F, 50, "plutonium_ingot");



        oreSmelting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 1.0F, 100, "tin");
        oreBlasting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 1.0F, 50, "tin");

        oreSmelting(pWriter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE_INGOT.get(), 1.0F, 100, "jade");
        oreBlasting(pWriter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE_INGOT.get(), 1.0F, 50, "jade");

        oreSmelting(pWriter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 1.0F, 100, "cobalt");
        oreBlasting(pWriter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 1.0F, 50, "cobalt");

        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 100, "silver");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 50, "silver");

        oreSmelting(pWriter, ALUMINUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get(), 1.0F, 100, "aluminum");
        oreBlasting(pWriter, ALUMINUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get(), 1.0F, 50, "aluminum");

        oreSmelting(pWriter, CHROMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get(), 1.0F, 100, "chromium");
        oreBlasting(pWriter, CHROMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get(), 1.0F, 50, "chromium");

        oreSmelting(pWriter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 1.0F, 100, "zinc");
        oreBlasting(pWriter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 1.0F, 50, "zinc");

    }
}
