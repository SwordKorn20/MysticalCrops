package com.swordkorn.mysticalcrops.items;

import com.swordkorn.mysticalcrops.MysticalCrops;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Sword_Korn on 26/01/2016.
 */
public class WandItemMystic extends Item {
    public WandItemMystic(String unlocalisedName) {
        super();
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(MysticalCrops.mysticalCropsTab);
    }
}
