package com.thunderworldInteractive.realismmod.datagen;

import com.thunderworldInteractive.realismmod.RealismMod;
import com.thunderworldInteractive.realismmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RealismMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
                simpleItem(ModItems.RAW_BLACK_OPAL);
                simpleItem(ModItems.BLACK_OPAL);

                simpleItem(ModItems.RAW_RUBY);
                simpleItem(ModItems.RUBY);

                simpleItem(ModItems.RAW_SAPPHIRE);
                simpleItem(ModItems.SAPPHIRE);

                simpleItem(ModItems.RAW_PERIDOT);
                simpleItem(ModItems.PERIDOT);

                simpleItem(ModItems.RAW_BLACK_OPAL);
                simpleItem(ModItems.BLACK_OPAL);

                simpleItem(ModItems.RAW_VANADIUM);
                simpleItem(ModItems.VANADIUM);

                simpleItem(ModItems.STEEL_INGOT);

                simpleItem(ModItems.TITANIUM_INGOT);

                simpleItem(ModItems.RAW_PLUTONIUM);
                simpleItem(ModItems.PLUTONIUM_INGOT);

                simpleItem(ModItems.RAW_TIN);
                simpleItem(ModItems.TIN_INGOT);

                simpleItem(ModItems.NICKEL_INGOT);
                simpleItem(ModItems.CHROMIUM_INGOT);

                simpleItem(ModItems.RAW_CHROMIUM);


                simpleItem(ModItems.RAW_ZINC);
                simpleItem(ModItems.ZINC_INGOT);

                simpleItem(ModItems.RAW_ALUMINUM);
                simpleItem(ModItems.ALUMINUM_INGOT);

                simpleItem(ModItems.RAW_JADE);
                simpleItem(ModItems.JADE_INGOT);

                simpleItem(ModItems.RAW_COBALT);
                simpleItem(ModItems.COBALT_INGOT);

                simpleItem(ModItems.RAW_SILVER);
                simpleItem(ModItems.SILVER_INGOT);

                simpleItem(ModItems.DIAMOND_BLUE);
                simpleItem(ModItems.DIAMOND_GREEN);
                simpleItem(ModItems.DIAMOND_ORANGE);
                simpleItem(ModItems.DIAMOND_RED);
                simpleItem(ModItems.DIAMOND_YELLOW);
                simpleItem(ModItems.DIAMOND_PINK);
                simpleItem(ModItems.DIAMOND_PURPLE);

                //Foods
                simpleItem(ModItems.CUCUMBER);
                simpleItem(ModItems.BLUEBERRY);
                simpleItem(ModItems.YELLOW_ONION);
                simpleItem(ModItems.REDPEPPER);
                simpleItem(ModItems.RED_GRAPE);
                simpleItem(ModItems.YELLOWPEPPER);
                simpleItem(ModItems.GREENPEPPER);
                simpleItem(ModItems.TOMATO);
                simpleItem(ModItems.ICEBERG_LETTUCE);
                simpleItem(ModItems.PICKLE);

    }
        private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(RealismMod.MOD_ID,"item/" + item.getId().getPath()));
        }
    }
