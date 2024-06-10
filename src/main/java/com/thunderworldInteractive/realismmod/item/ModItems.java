package com.thunderworldInteractive.realismmod.item;

import com.thunderworldInteractive.realismmod.RealismMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RealismMod.MOD_ID);

    //Other Gems
    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANADIUM = ITEMS.register("vanadium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_INGOT = ITEMS.register("plutonium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_INGOT = ITEMS.register("jade_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_JADE = ITEMS.register("raw_jade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHROMIUM = ITEMS.register("raw_chromium",
            () -> new Item(new Item.Properties()));

    //Raw Gems

    public static final RegistryObject<Item> RAW_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_VANADIUM = ITEMS.register("raw_vanadium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLUTONIUM = ITEMS.register("raw_plutonium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PERIDOT = ITEMS.register("raw_peridot",
            () -> new Item(new Item.Properties()));

    //Diamonds
    public static final RegistryObject<Item> DIAMOND_RED = ITEMS.register("diamond_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BLUE = ITEMS.register("diamond_blue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORANGE = ITEMS.register("diamond_orange",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GREEN = ITEMS.register("diamond_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_YELLOW = ITEMS.register("diamond_yellow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PURPLE = ITEMS.register("diamond_purple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PINK = ITEMS.register("diamond_pink",
            () -> new Item(new Item.Properties()));



    //Food
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CUCUMBER)));
    public static final RegistryObject<Item> PICKLE = ITEMS.register("pickle",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PICKLE)));
    public static final RegistryObject<Item> REDPEPPER = ITEMS.register("red_pepper",
            () -> new Item(new Item.Properties().food(ModFoodProperties.REDPEPPER)));
    public static final RegistryObject<Item> GREENPEPPER = ITEMS.register("green_pepper",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GREENPEPPER)));
    public static final RegistryObject<Item> YELLOWPEPPER = ITEMS.register("yellow_pepper",
            () -> new Item(new Item.Properties().food(ModFoodProperties.YELLOWPEPPER)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLUEBERRY)));
    public static final RegistryObject<Item> ICEBERG_LETTUCE = ITEMS.register("iceberg_lettuce",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LETTUCE)));
    public static final RegistryObject<Item> YELLOW_ONION = ITEMS.register("yellow_onion",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ONION)));
    public static final RegistryObject<Item> RED_GRAPE = ITEMS.register("red_grape",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GRAPE)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus );
    }
}
