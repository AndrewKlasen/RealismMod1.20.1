package com.thunderworldInteractive.realismmod.item;


import com.thunderworldInteractive.realismmod.RealismMod;
import com.thunderworldInteractive.realismmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RealismMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> REALISM_ITEM_TAB = CREATIVE_MODE_TABS.register("realism_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLACK_OPAL_BLOCK.get()))
                    .title(Component.translatable("creativemodetab.realism_item_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.RAW_BLACK_OPAL.get());
                        output.accept(ModItems.BLACK_OPAL.get());

                        output.accept(ModItems.RAW_RUBY.get());
                        output.accept(ModItems.RUBY.get());

                        output.accept(ModItems.RAW_SAPPHIRE.get());
                        output.accept(ModItems.SAPPHIRE.get());

                        output.accept(ModItems.RAW_PERIDOT.get());
                        output.accept(ModItems.PERIDOT.get());

                        output.accept(ModItems.RAW_BLACK_OPAL.get());
                        output.accept(ModItems.BLACK_OPAL.get());

                        output.accept(ModItems.RAW_VANADIUM.get());
                        output.accept(ModItems.VANADIUM.get());

                        output.accept(ModItems.STEEL_INGOT.get());

                        output.accept(ModItems.TITANIUM_INGOT.get());

                        output.accept(ModItems.RAW_PLUTONIUM.get());
                        output.accept(ModItems.PLUTONIUM_INGOT.get());

                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.TIN_INGOT.get());

                        output.accept(ModItems.NICKEL_INGOT.get());
                        output.accept(ModItems.CHROMIUM_INGOT.get());

                        output.accept(ModItems.RAW_CHROMIUM.get());


                        output.accept(ModItems.RAW_ZINC.get());
                        output.accept(ModItems.ZINC_INGOT.get());

                        output.accept(ModItems.RAW_ALUMINUM.get());
                        output.accept(ModItems.ALUMINUM_INGOT.get());

                        output.accept(ModItems.RAW_JADE.get());
                        output.accept(ModItems.JADE_INGOT.get());

                        output.accept(ModItems.RAW_COBALT.get());
                        output.accept(ModItems.COBALT_INGOT.get());

                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.SILVER_INGOT.get());

                        output.accept(ModItems.DIAMOND_BLUE.get());
                        output.accept(ModItems.DIAMOND_GREEN.get());
                        output.accept(ModItems.DIAMOND_ORANGE.get());
                        output.accept(ModItems.DIAMOND_RED.get());
                        output.accept(ModItems.DIAMOND_YELLOW.get());
                        output.accept(ModItems.DIAMOND_PINK.get());
                        output.accept(ModItems.DIAMOND_PURPLE.get());

                        //Foods
                        output.accept(ModItems.CUCUMBER.get());
                        output.accept(ModItems.BLUEBERRY.get());
                        output.accept(ModItems.YELLOW_ONION.get());
                        output.accept(ModItems.REDPEPPER.get());
                        output.accept(ModItems.RED_GRAPE.get());
                        output.accept(ModItems.YELLOWPEPPER.get());
                        output.accept(ModItems.GREENPEPPER.get());
                        output.accept(ModItems.TOMATO.get());
                        output.accept(ModItems.ICEBERG_LETTUCE.get());
                        output.accept(ModItems.PICKLE.get());

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
