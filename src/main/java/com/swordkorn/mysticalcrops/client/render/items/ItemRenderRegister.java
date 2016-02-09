package com.swordkorn.mysticalcrops.client.render.items;

import com.swordkorn.mysticalcrops.MysticalCrops;
import com.swordkorn.mysticalcrops.blocks.CropBlocks;
import com.swordkorn.mysticalcrops.items.CropItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Sword_Korn on 24/01/2016.
 */
public class ItemRenderRegister
{
    public static String modid = MysticalCrops.MODID;

    public static void registerItemRenderer()
    {
        reg(CropItems.vulcanEssence);
        reg(CropItems.terranEssence);
        reg(CropItems.aquaticEssence);
        reg(CropItems.auraEssence);
        reg(CropItems.etherealEssence);

        reg(CropItems.ironSeed);
        reg(CropItems.goldSeed);
        reg(CropItems.copperSeed);
        reg(CropItems.tinSeed);
        reg(CropItems.arditeSeed);
        reg(CropItems.cobaltSeed);
        reg(CropItems.diamondSeed);
        reg(CropItems.redstoneSeed);
        reg(CropItems.mysticSeed);

        reg(CropItems.dustIron);
        reg(CropItems.dustGold);
        reg(CropItems.dustMystic);
        reg(CropItems.dustCopper);
        reg(CropItems.dustTin);
        reg(CropItems.dustArdite);
        reg(CropItems.dustCobalt);
        reg(CropItems.dustBronze);
        reg(CropItems.dustSteel);
        reg(CropItems.dustManyullyn);

        reg(CropItems.nuggetIron);
        reg(CropItems.nuggetCopper);
        reg(CropItems.nuggetTin);
        reg(CropItems.nuggetArdite);
        reg(CropItems.nuggetCobalt);
        reg(CropItems.nuggetBronze);
        reg(CropItems.nuggetSteel);
        reg(CropItems.nuggetManyullyn);
        reg(CropItems.nuggetDiamond);
        reg(CropItems.nuggetMystic);

        reg(CropItems.ingotMystic);
        reg(CropItems.ingotCopper);
        reg(CropItems.ingotTin);
        reg(CropItems.ingotArdite);
        reg(CropItems.ingotCobalt);
        reg(CropItems.ingotBronze);
        reg(CropItems.ingotSteel);
        reg(CropItems.ingotManyullyn);

        reg(CropItems.copperSword);
        reg(CropItems.arditeSword);
        reg(CropItems.cobaltSword);
        reg(CropItems.bronzeSword);
        reg(CropItems.steelSword);
        reg(CropItems.manyullynSword);

        reg(CropItems.copperPickaxe);
        reg(CropItems.arditePickaxe);
        reg(CropItems.cobaltPickaxe);
        reg(CropItems.bronzePickaxe);
        reg(CropItems.steelPickaxe);
        reg(CropItems.manyullynPickaxe);

        reg(CropItems.pyrusWand);
        reg(CropItems.terranWand);
        reg(CropItems.aquaticsWand);
        reg(CropItems.mysticWand);
    }

    public static void reg(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
