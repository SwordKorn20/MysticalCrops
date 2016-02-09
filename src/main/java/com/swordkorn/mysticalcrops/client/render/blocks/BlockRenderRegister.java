package com.swordkorn.mysticalcrops.client.render.blocks;

import com.swordkorn.mysticalcrops.MysticalCrops;
import com.swordkorn.mysticalcrops.blocks.CropBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Sword_Korn on 24/01/2016.
 */
public class BlockRenderRegister
{
    public static String modid = MysticalCrops.MODID.toLowerCase();

    public static void registerBlockRenderer()
    {
        reg(CropBlocks.ironCropBlock, 0);
        reg(CropBlocks.goldCropBlock, 0);
        reg(CropBlocks.copperCropBlock, 0);
        reg(CropBlocks.tinCropBlock, 0);
        reg(CropBlocks.arditeCropBlock, 0);
        reg(CropBlocks.cobaltCropBlock, 0);
        reg(CropBlocks.diamondCropBlock, 0);
        reg(CropBlocks.redstoneCropBlock, 0);
        reg(CropBlocks.mysticCropBlock, 0);

        reg(CropBlocks.pyrusStone, 0);
        reg(CropBlocks.terranStone, 0);
        reg(CropBlocks.aquaticsStone, 0);
        reg(CropBlocks.vintusStone, 0);
        reg(CropBlocks.etherealStone, 0);

        reg(CropBlocks.alchemicalDuster, 0);

    }

    public static void reg(Block block, int meta)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" +
                        block.getUnlocalizedName().substring(5), "inventory"));
    }
}
