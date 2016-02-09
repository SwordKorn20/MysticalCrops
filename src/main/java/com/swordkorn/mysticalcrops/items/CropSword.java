package com.swordkorn.mysticalcrops.items;

import com.swordkorn.mysticalcrops.MysticalCrops;
import net.minecraft.item.ItemSword;

/**
 * Created by Sword_Korn on 02/02/2016.
 */
public class CropSword extends ItemSword {

    public CropSword(String unlocalisedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(MysticalCrops.mysticalCropsTab);
    }
}
