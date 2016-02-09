package com.swordkorn.mysticalcrops.items;

import com.swordkorn.mysticalcrops.MysticalCrops;
import com.swordkorn.mysticalcrops.blocks.CropBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import sun.java2d.opengl.OGLRenderQueue;

/**
 * Created by Sword_Korn on 24/01/2016.
 */
public class CropItems
{
    public static Item vulcanEssence;
    public static Item terranEssence;
    public static Item aquaticEssence;
    public static Item auraEssence;
    public static Item etherealEssence;

    public static Item ironSeed;
    public static Item goldSeed;
    public static Item copperSeed;
    public static Item tinSeed;
    public static Item arditeSeed;
    public static Item cobaltSeed;
    public static Item diamondSeed;
    public static Item redstoneSeed;
    public static Item mysticSeed;

    public static Item dustIron;
    public static Item dustGold;
    public static Item dustCopper;
    public static Item dustTin;
    public static Item dustArdite;
    public static Item dustCobalt;
    public static Item dustBronze;
    public static Item dustSteel;
    public static Item dustManyullyn;
    public static Item dustMystic;

    public static Item nuggetIron;
    public static Item nuggetCopper;
    public static Item nuggetTin;
    public static Item nuggetArdite;
    public static Item nuggetCobalt;
    public static Item nuggetBronze;
    public static Item nuggetSteel;
    public static Item nuggetManyullyn;
    public static Item nuggetDiamond;
    public static Item nuggetMystic;

    public static Item ingotMystic;
    public static Item ingotCopper;
    public static Item ingotTin;
    public static Item ingotArdite;
    public static Item ingotCobalt;
    public static Item ingotBronze;
    public static Item ingotSteel;
    public static Item ingotManyullyn;

    public static Item.ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 150, 5.0F, 2.0F, 14);
    public static Item.ToolMaterial ARDITE = EnumHelper.addToolMaterial("ARDITE", 4, 2000, 14.0F, 3.0F, 15);
    public static Item.ToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 4, 2000, 20.0F, 3.0F, 22);
    public static Item.ToolMaterial BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 1000, 8.0F, 2.0F, 16);
    public static Item.ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 3, 1500, 7.0F, 3.0F, 16);
    public static Item.ToolMaterial MANYULLYN = EnumHelper.addToolMaterial("MANYULLYN", 4, 1500, 12.0F, 5.0F, 30);

    public static Item copperPickaxe;
    public static Item copperShovel;
    public static Item copperAxe;
    public static Item copperSword;

    public static Item arditePickaxe;
    public static Item arditeShovel;
    public static Item arditeAxe;
    public static Item arditeSword;

    public static Item cobaltPickaxe;
    public static Item cobaltShovel;
    public static Item cobaltAxe;
    public static Item cobaltSword;

    public static Item bronzePickaxe;
    public static Item bronzeShovel;
    public static Item bronzeAxe;
    public static Item bronzeSword;

    public static Item steelPickaxe;
    public static Item steelShovel;
    public static Item steelAxe;
    public static Item steelSword;

    public static Item manyullynPickaxe;
    public static Item manyullynShovel;
    public static Item manyullynAxe;
    public static Item manyullynSword;

    public static Item pyrusWand;
    public static Item terranWand;
    public static Item aquaticsWand;
    public static Item mysticWand;

    public static void createItems()
    {
        GameRegistry.registerItem(vulcanEssence = new EssenceItem("vulcanEssence"), "vulcanEssence");
        GameRegistry.registerItem(terranEssence = new EssenceItem("terranEssence"), "terranEssence");
        GameRegistry.registerItem(aquaticEssence = new EssenceItem("aquaticEssence"), "aquaticEssence");
        GameRegistry.registerItem(auraEssence = new EssenceItem("auraEssence"), "auraEssence");
        GameRegistry.registerItem(etherealEssence = new EssenceItem("etherealEssence"), "etherealEssence");

        GameRegistry.registerItem(ironSeed = new IronSeedItem("ironSeed"), "ironSeed");
        GameRegistry.registerItem(goldSeed = new GoldSeedItem("goldSeed"), "goldSeed");
        GameRegistry.registerItem(copperSeed = new CopperSeedItem("copperSeed"), "copperSeed");
        GameRegistry.registerItem(tinSeed = new TinSeedItem("tinSeed"), "tinSeed");
        GameRegistry.registerItem(arditeSeed = new ArditeSeedItem("arditeSeed"), "arditeSeed");
        GameRegistry.registerItem(cobaltSeed = new CobaltSeedItem("cobaltSeed"), "cobaltSeed");
        GameRegistry.registerItem(diamondSeed = new DiamondSeedItem("diamondSeed"), "diamondSeed");
        GameRegistry.registerItem(redstoneSeed = new RedstoneSeedItem("redstoneSeed"), "redstoneSeed");
        GameRegistry.registerItem(mysticSeed = new MysticSeedItem("mysticSeed"), "mysticSeed");

        GameRegistry.registerItem(dustIron = new DustMetal("dustIron"), "dustIron");
        GameRegistry.registerItem(dustGold = new DustMetal("dustGold"), "dustGold");
        GameRegistry.registerItem(dustCopper = new DustMetal("dustCopper"), "dustCopper");
        GameRegistry.registerItem(dustTin = new DustMetal("dustTin"), "dustTin");
        GameRegistry.registerItem(dustArdite = new DustMetal("dustArdite"), "dustArdite");
        GameRegistry.registerItem(dustCobalt = new DustMetal("dustCobalt"), "dustCobalt");
        GameRegistry.registerItem(dustBronze = new DustMetal("dustBronze"), "dustBronze");
        GameRegistry.registerItem(dustSteel = new DustMetal("dustSteel"), "dustSteel");
        GameRegistry.registerItem(dustManyullyn = new DustMetal("dustManyullyn"), "dustManyullyn");
        GameRegistry.registerItem(dustMystic = new DustMetal("dustMystic"), "dustMystic");

        GameRegistry.registerItem(nuggetIron = new NuggetMetal("nuggetIron"), "nuggetIron");
        GameRegistry.registerItem(nuggetCopper = new NuggetMetal("nuggetCopper"), "nuggetCopper");
        GameRegistry.registerItem(nuggetTin = new NuggetMetal("nuggetTin"), "nuggetTin");
        GameRegistry.registerItem(nuggetArdite = new NuggetMetal("nuggetArdite"), "nuggetArdite");
        GameRegistry.registerItem(nuggetCobalt = new NuggetMetal("nuggetCobalt"), "nuggetCobalt");
        GameRegistry.registerItem(nuggetBronze = new NuggetMetal("nuggetBronze"), "nuggetBronze");
        GameRegistry.registerItem(nuggetSteel = new NuggetMetal("nuggetSteel"), "nuggetSteel");
        GameRegistry.registerItem(nuggetManyullyn = new NuggetMetal("nuggetManyullyn"), "nuggetManyullyn");
        GameRegistry.registerItem(nuggetDiamond = new NuggetGem("nuggetDiamond"), "nuggetDiamond");
        GameRegistry.registerItem(nuggetMystic = new NuggetMetal("nuggetMystic"), "nuggetMystic");

        GameRegistry.registerItem(ingotMystic = new MysticIngotItem("ingotMystic"), "ingotMystic");
        GameRegistry.registerItem(ingotCopper = new MysticIngotItem("ingotCopper"), "ingotCopper");
        GameRegistry.registerItem(ingotTin = new MysticIngotItem("ingotTin"), "ingotTin");
        GameRegistry.registerItem(ingotArdite = new MysticIngotItem("ingotArdite"), "ingotArdite");
        GameRegistry.registerItem(ingotCobalt = new MysticIngotItem("ingotCobalt"), "ingotCobalt");
        GameRegistry.registerItem(ingotBronze = new MysticIngotItem("ingotBronze"), "ingotBronze");
        GameRegistry.registerItem(ingotSteel = new MysticIngotItem("ingotSteel"), "ingotSteel");
        GameRegistry.registerItem(ingotManyullyn = new MysticIngotItem("ingotManyullyn"), "ingotManyullyn");

        GameRegistry.registerItem(copperPickaxe = new CropPick("copperPickaxe", COPPER), "copperPickaxe");
        GameRegistry.registerItem(copperShovel = new CropSpade("copperShovel", COPPER), "copperShovel");
        GameRegistry.registerItem(copperAxe = new CropAxe("copperAxe", COPPER), "copperAxe");
        GameRegistry.registerItem(copperSword = new CropSword("copperSword", COPPER), "copperSword");

        GameRegistry.registerItem(arditePickaxe = new CropPick("arditePickaxe", ARDITE), "arditePickaxe");
        GameRegistry.registerItem(arditeShovel = new CropSpade("arditeShovel", ARDITE), "arditeShovel");
        GameRegistry.registerItem(arditeAxe = new CropAxe("arditeAxe", ARDITE), "arditeAxe");
        GameRegistry.registerItem(arditeSword = new CropSword("arditeSword", ARDITE), "arditeSword");

        GameRegistry.registerItem(cobaltPickaxe = new CropPick("cobaltPickaxe", COBALT), "cobaltPickaxe");
        GameRegistry.registerItem(cobaltShovel = new CropSpade("cobaltShovel", COBALT), "cobaltShovel");
        GameRegistry.registerItem(cobaltAxe = new CropAxe("cobaltAxe", COBALT), "cobaltAxe");
        GameRegistry.registerItem(cobaltSword = new CropSword("cobaltSword", COBALT), "cobaltSword");

        GameRegistry.registerItem(bronzePickaxe = new CropPick("bronzePickaxe", BRONZE), "bronzePickaxe");
        GameRegistry.registerItem(bronzeShovel = new CropSpade("bronzeShovel", BRONZE), "bronzeShovel");
        GameRegistry.registerItem(bronzeAxe = new CropAxe("bronzeAxe", BRONZE), "bronzeAxe");
        GameRegistry.registerItem(bronzeSword = new CropSword("bronzeSword", BRONZE), "bronzeSword");

        GameRegistry.registerItem(steelPickaxe = new CropPick("steelPickaxe", STEEL), "steelPickaxe");
        GameRegistry.registerItem(steelShovel = new CropSpade("steelShovel", STEEL), "steelShovel");
        GameRegistry.registerItem(steelAxe = new CropAxe("steelAxe", STEEL), "steelAxe");
        GameRegistry.registerItem(steelSword = new CropSword("steelSword", STEEL), "steelSword");

        GameRegistry.registerItem(manyullynPickaxe = new CropPick("manyullynPickaxe", MANYULLYN), "manyullynPickaxe");
        GameRegistry.registerItem(manyullynShovel = new CropSpade("manyullynShovel", MANYULLYN), "manyullynShovel");
        GameRegistry.registerItem(manyullynAxe = new CropAxe("manyullynAxe", MANYULLYN), "manyullynAxe");
        GameRegistry.registerItem(manyullynSword = new CropSword("manyullynSword", MANYULLYN), "manyullynSword");

        GameRegistry.registerItem(pyrusWand = new WandItemPyrus("pyrusWand"), "pyrusWand");
        GameRegistry.registerItem(terranWand = new WandItemTerran("terranWand"), "terranWand");
        GameRegistry.registerItem(aquaticsWand = new WandItemAquatics("aquaticsWand"), "aquaticsWand");
        GameRegistry.registerItem(mysticWand = new WandItemMystic("mysticWand"), "mysticWand");

        OreDictionary.registerOre("dustIron", new ItemStack(CropItems.dustIron));
        OreDictionary.registerOre("dustGold", new ItemStack(CropItems.dustGold));
        OreDictionary.registerOre("dustCopper", new ItemStack(CropItems.dustCopper));
        OreDictionary.registerOre("dustTin", new ItemStack(CropItems.dustTin));
        OreDictionary.registerOre("dustArdite", new ItemStack(CropItems.dustArdite));
        OreDictionary.registerOre("dustCobalt", new ItemStack(CropItems.dustCobalt));
        OreDictionary.registerOre("dustBronze", new ItemStack(CropItems.dustBronze));
        OreDictionary.registerOre("dustSteel", new ItemStack(CropItems.dustSteel));
        OreDictionary.registerOre("dustManyullyn", new ItemStack(CropItems.dustManyullyn));

        OreDictionary.registerOre("nuggetIron", new ItemStack(CropItems.nuggetIron));
        OreDictionary.registerOre("nuggetMystic", new ItemStack(CropItems.nuggetMystic));
        OreDictionary.registerOre("nuggetCopper", new ItemStack(CropItems.nuggetCopper));
        OreDictionary.registerOre("nuggetTin", new ItemStack(CropItems.nuggetTin));
        OreDictionary.registerOre("nuggetArdite", new ItemStack(CropItems.nuggetArdite));
        OreDictionary.registerOre("nuggetCobalt", new ItemStack(CropItems.nuggetCobalt));
        OreDictionary.registerOre("nuggetBronze", new ItemStack(CropItems.nuggetBronze));
        OreDictionary.registerOre("nuggetSteel", new ItemStack(CropItems.nuggetSteel));
        OreDictionary.registerOre("nuggetManyullyn", new ItemStack(CropItems.nuggetManyullyn));

        OreDictionary.registerOre("ingotMystic", new ItemStack(CropItems.ingotMystic));
        OreDictionary.registerOre("ingotCopper", new ItemStack(CropItems.ingotCopper));
        OreDictionary.registerOre("ingotTin", new ItemStack(CropItems.ingotTin));
        OreDictionary.registerOre("ingotArdite", new ItemStack(CropItems.ingotArdite));
        OreDictionary.registerOre("ingotCobalt", new ItemStack(CropItems.ingotCobalt));
        OreDictionary.registerOre("ingotBronze", new ItemStack(CropItems.ingotBronze));
        OreDictionary.registerOre("ingotSteel", new ItemStack(CropItems.ingotSteel));
        OreDictionary.registerOre("ingotManyullyn", new ItemStack(CropItems.ingotManyullyn));

        OreDictionary.registerOre("matMystic", new ItemStack(CropItems.ingotMystic));
        OreDictionary.registerOre("matCopper", new ItemStack(CropItems.ingotCopper));
        OreDictionary.registerOre("matTin", new ItemStack(CropItems.ingotTin));
        OreDictionary.registerOre("matArdite", new ItemStack(CropItems.ingotArdite));
        OreDictionary.registerOre("matCobalt", new ItemStack(CropItems.ingotCobalt));
        OreDictionary.registerOre("matBronze", new ItemStack(CropItems.ingotBronze));
        OreDictionary.registerOre("matSteel", new ItemStack(CropItems.ingotSteel));
        OreDictionary.registerOre("matManyullyn", new ItemStack(CropItems.ingotManyullyn));
    }
}
