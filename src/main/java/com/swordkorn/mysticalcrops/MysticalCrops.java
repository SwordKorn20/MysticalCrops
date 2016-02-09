package com.swordkorn.mysticalcrops;

import com.swordkorn.mysticalcrops.blocks.CropBlocks;
import com.swordkorn.mysticalcrops.items.CropItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.swordkorn.mysticalcrops.proxy.CommonProxy;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sword_Korn on 23/01/2016.
 */

@Mod(modid = MysticalCrops.MODID, name = MysticalCrops.NAME, version = MysticalCrops.VERSION, dependencies = "after: tconstruct;")
public class MysticalCrops
{
    public static final String MODID = "MysticalCrops";
    public static final String NAME = "Mystical Crops";
    public static final String VERSION = "1.1";

    @Mod.Instance
    public static MysticalCrops instance = new MysticalCrops();

    @SidedProxy(clientSide = "com.swordkorn.mysticalcrops.proxy.ClientProxy", serverSide = "com.swordkorn.mysticalcrops.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs mysticalCropsTab = new CreativeTabs("mysticalCropsTab") {
        @Override
        public Item getTabIconItem()
        {
            return CropItems.vulcanEssence;
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        this.proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        this.proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        this.proxy.postInit(event);
    }
}
