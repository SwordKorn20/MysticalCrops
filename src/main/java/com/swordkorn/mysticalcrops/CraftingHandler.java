package com.swordkorn.mysticalcrops;

import com.sun.scenario.effect.Crop;
import com.swordkorn.mysticalcrops.blocks.CropBlocks;
import com.swordkorn.mysticalcrops.items.CropItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Sword_Korn on 28/01/2016.
 */
public class CraftingHandler {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(CropBlocks.pyrusStone, 8),
                "xxx",
                "xyx",
                "xxx",
                'x', Blocks.stone, 'y', CropItems.vulcanEssence
        );
        GameRegistry.addRecipe(new ItemStack(CropBlocks.terranStone, 8),
                "xxx",
                "xyx",
                "xxx",
                'x', Blocks.stone, 'y', CropItems.terranEssence
        );
        GameRegistry.addRecipe(new ItemStack(CropBlocks.aquaticsStone, 8),
                "xxx",
                "xyx",
                "xxx",
                'x', Blocks.stone, 'y', CropItems.aquaticEssence
        );
        GameRegistry.addRecipe(new ItemStack(CropBlocks.vintusStone, 8),
                "xxx",
                "xyx",
                "xxx",
                'x', Blocks.stone, 'y', CropItems.auraEssence
        );
        GameRegistry.addRecipe(new ItemStack(CropBlocks.etherealStone, 8),
                "xxx",
                "xyx",
                "xxx",
                'x', Blocks.stone, 'y', CropItems.etherealEssence
        );
        GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetIron
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.ingotCopper, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetCopper
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.ingotTin, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetTin
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.ingotArdite, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetArdite
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.ingotCobalt, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetCobalt
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.ingotBronze, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetBronze
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.ingotSteel, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetSteel
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.ingotManyullyn, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetManyullyn
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.ingotMystic, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetMystic
        );
        GameRegistry.addRecipe(new ItemStack(Items.diamond, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', CropItems.nuggetDiamond
        );
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.dustIron, 1), Items.iron_ingot, CropItems.mysticWand);
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.dustGold, 1), Items.gold_ingot, CropItems.mysticWand);
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.dustCopper, 1),
                "ingotCopper", CropItems.mysticWand
        ));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.dustTin, 1),
                "ingotTin", CropItems.mysticWand
        ));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.dustArdite, 1), "ingotArdite", CropItems.mysticWand));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.dustCobalt, 1), "ingotCobalt", CropItems.mysticWand));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetIron, 9), new ItemStack(Items.iron_ingot));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetCopper, 9), new ItemStack(CropItems.ingotCopper));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetTin, 9), new ItemStack(CropItems.ingotTin));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetArdite, 9), new ItemStack(CropItems.ingotArdite));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetCobalt, 9), new ItemStack(CropItems.ingotCobalt));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetBronze, 9), new ItemStack(CropItems.ingotBronze));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetSteel, 9), new ItemStack(CropItems.ingotSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetManyullyn, 9), new ItemStack(CropItems.ingotManyullyn));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetDiamond, 9), new ItemStack(Items.diamond));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.nuggetMystic, 9), new ItemStack(CropItems.ingotMystic));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CropItems.dustBronze, 2),
                "xx",
                "xy",
                'x', "dustCopper", 'y', "dustTin"
        ));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CropItems.dustSteel, 1),
                "x x",
                " y ",
                "x x",
                'x', Items.coal, 'y', "dustIron"
        ));
        GameRegistry.addRecipe(new ItemStack(CropItems.dustManyullyn, 1),
                "xx",
                "xy",
                'x', CropItems.dustArdite, 'y', CropItems.dustCobalt
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.vulcanEssence),
                "xy",
                'x', CropItems.mysticWand, 'y', Items.lava_bucket
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.terranEssence),
                "xy",
                'x', CropItems.mysticWand, 'y', Items.apple
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.aquaticEssence),
                "xy",
                'x', CropItems.mysticWand, 'y', Items.water_bucket
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.auraEssence),
                "xy",
                'x', CropItems.mysticWand, 'y', Items.bucket
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.etherealEssence),
                "xy",
                'x', CropItems.mysticWand, 'y', Items.ender_pearl
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.mysticWand),
                "  y",
                " x ",
                "y  ",
                'x', Items.stick, 'y', CropItems.nuggetMystic
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.pyrusWand),
                "  y",
                " x ",
                "y  ",
                'x', Items.stick, 'y', CropItems.vulcanEssence
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.terranWand),
                "  y",
                " x ",
                "y  ",
                'x', Items.stick, 'y', CropItems.terranEssence
        );
        GameRegistry.addRecipe(new ItemStack(CropItems.aquaticsWand),
                "  y",
                " x ",
                "y  ",
                'x', Items.stick, 'y', CropItems.aquaticEssence
        );
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CropItems.dustMystic, 2),
                 "dustIron", "dustGold"
        ));
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.ironSeed, 1), Items.wheat_seeds,
                CropItems.terranEssence, Items.iron_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.goldSeed, 1), Items.wheat_seeds,
                CropItems.terranEssence, Items.gold_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.redstoneSeed, 1), Items.wheat_seeds,
                CropItems.terranEssence, Items.redstone);
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.copperSeed, 1), Items.wheat_seeds,
                CropItems.terranEssence, CropItems.ingotCopper);
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.tinSeed, 1), Items.wheat_seeds,
                CropItems.terranEssence, CropItems.ingotTin);
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.arditeSeed, 1), Items.wheat_seeds,
                CropItems.terranEssence, CropItems.ingotArdite);
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.cobaltSeed, 1), Items.wheat_seeds,
                CropItems.terranEssence, CropItems.ingotCobalt);
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.diamondSeed, 1), Items.wheat_seeds,
                CropItems.terranEssence, Items.diamond);
        GameRegistry.addShapelessRecipe(new ItemStack(CropItems.mysticSeed, 1), Items.wheat_seeds,
                CropItems.terranEssence, CropItems.ingotMystic);
        GameRegistry.addSmelting(CropItems.dustIron, new ItemStack(Items.iron_ingot, 1), 1.0F);
        GameRegistry.addSmelting(CropItems.dustGold, new ItemStack(Items.gold_ingot, 1), 2.0F);
        GameRegistry.addSmelting(CropItems.dustMystic, new ItemStack(CropItems.ingotMystic, 1), 2.0F);
        for(ItemStack stack : OreDictionary.getOres("dustCopper")) { GameRegistry.addSmelting(stack, new ItemStack(CropItems.ingotCopper, 1), 1.0F); }
        for(ItemStack stack : OreDictionary.getOres("dustTin")) { GameRegistry.addSmelting(stack, new ItemStack(CropItems.ingotTin, 1), 1.0F); }
        for(ItemStack stack : OreDictionary.getOres("dustArdite")) { GameRegistry.addSmelting(stack, new ItemStack(CropItems.ingotArdite, 1), 3.0F); }
        for(ItemStack stack : OreDictionary.getOres("dustCobalt")) { GameRegistry.addSmelting(stack, new ItemStack(CropItems.ingotCobalt, 1), 3.0F); }
        for(ItemStack stack : OreDictionary.getOres("dustBronze")) { GameRegistry.addSmelting(stack, new ItemStack(CropItems.ingotBronze, 1), 2.0F); }
        for(ItemStack stack : OreDictionary.getOres("dustSteel")) { GameRegistry.addSmelting(stack, new ItemStack(CropItems.ingotSteel, 1), 2.0F); }
        for(ItemStack stack : OreDictionary.getOres("dustManyullyn")) { GameRegistry.addSmelting(stack, new ItemStack(CropItems.ingotManyullyn, 1), 5.0F); }
    }
}
