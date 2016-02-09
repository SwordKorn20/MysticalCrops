package com.swordkorn.mysticalcrops.blocks;

import com.swordkorn.mysticalcrops.MysticalCrops;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Sword_Korn on 28/01/2016.
 */
public class MysticalCropBlock extends Block {
    public MysticalCropBlock(String unlocalisedName) {
        super(Material.ground);
        this.setUnlocalizedName(unlocalisedName);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setCreativeTab(MysticalCrops.mysticalCropsTab);
    }
}
