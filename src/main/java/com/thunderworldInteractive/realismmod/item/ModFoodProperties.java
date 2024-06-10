package com.thunderworldInteractive.realismmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CUCUMBER = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties PICKLE = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties REDPEPPER = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties GREENPEPPER = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties YELLOWPEPPER = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties BLUEBERRY = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties LETTUCE = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties ONION = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties GRAPE = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();




    //.effect(() -> MobEffectInstance(MobEffects.MOVEMENT_SPEED,200,0.1f)); To add effect.
}
