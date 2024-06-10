package com.thunderworldInteractive.realismmod.datagen;

import com.thunderworldInteractive.realismmod.RealismMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> completableFuture, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, future, completableFuture, RealismMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
    //add tags

    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
