package com.swordkorn.mysticalcrops.items;

import com.swordkorn.mysticalcrops.MysticalCrops;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Sword_Korn on 02/02/2016.
 */
public class CropPick extends ItemPickaxe {

    public CropPick(String unlocalisedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(MysticalCrops.mysticalCropsTab);
    }
}
