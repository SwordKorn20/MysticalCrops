package com.swordkorn.mysticalcrops.proxy;

import com.swordkorn.mysticalcrops.CraftingHandler;
import com.swordkorn.mysticalcrops.blocks.CropBlocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.swordkorn.mysticalcrops.items.CropItems;

/**
 * Created by Sword_Korn on 23/01/2016.
 */
public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        CropItems.createItems();
        CropBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent event)
    {
        CraftingHandler.init();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
