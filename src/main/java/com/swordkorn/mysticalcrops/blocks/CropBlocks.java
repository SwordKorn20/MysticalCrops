package com.swordkorn.mysticalcrops.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sword_Korn on 24/01/2016.
 */
public class CropBlocks
{
    public static Block pyrusStone;
    public static Block terranStone;
    public static Block aquaticsStone;
    public static Block vintusStone;
    public static Block etherealStone;

    public static Block ironCropBlock;
    public static Block goldCropBlock;
    public static Block copperCropBlock;
    public static Block tinCropBlock;
    public static Block arditeCropBlock;
    public static Block cobaltCropBlock;
    public static Block diamondCropBlock;
    public static Block redstoneCropBlock;
    public static Block mysticCropBlock;

    public static Block alchemicalDuster;

    public static void createBlocks()
    {
        GameRegistry.registerBlock(ironCropBlock = new MysticalCropBlockIron("ironCropBlock"), "ironCropBlock");
        GameRegistry.registerBlock(goldCropBlock = new MysticalCropBlockGold("goldCropBlock"), "goldCropBlock");
        GameRegistry.registerBlock(copperCropBlock = new MysticalCropBlockCopper("copperCropBlock"), "copperCropBlock");
        GameRegistry.registerBlock(tinCropBlock = new MysticalCropBlockTin("tinCropBlock"), "tinCropBlock");
        GameRegistry.registerBlock(arditeCropBlock = new MysticalCropBlockArdite("arditeCropBlock"), "arditeCropBlock");
        GameRegistry.registerBlock(cobaltCropBlock = new MysticalCropBlockCobalt("cobaltCropBlock"), "cobaltCropBlock");
        GameRegistry.registerBlock(diamondCropBlock = new MysticalCropBlockDiamond("diamondCropBlock"), "diamondCropBlock");
        GameRegistry.registerBlock(redstoneCropBlock = new MysticalCropBlockRedstone("redstoneCropBlock"), "redstoneCropBlock");
        GameRegistry.registerBlock(mysticCropBlock = new MysticalCropBlockMystic("mysticCropBlock"), "mysticCropBlock");

        GameRegistry.registerBlock(alchemicalDuster = new MysticalCropBlockDuster("alchemicalDuster"), "alchemicalDuster");

        GameRegistry.registerBlock(pyrusStone = new MysticalCropBlock("pyrusStone"), "pyrusStone");
        GameRegistry.registerBlock(terranStone = new MysticalCropBlock("terranStone"), "terranStone");
        GameRegistry.registerBlock(aquaticsStone = new MysticalCropBlock("aquaticsStone"), "aquaticsStone");
        GameRegistry.registerBlock(vintusStone = new MysticalCropBlock("vintusStone"), "vintusStone");
        GameRegistry.registerBlock(etherealStone = new MysticalCropBlock("etherealStone"), "etherealStone");
    }
}