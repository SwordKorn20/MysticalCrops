package com.swordkorn.mysticalcrops.items;

import com.swordkorn.mysticalcrops.MysticalCrops;
import net.minecraft.item.Item;

/**
 * Created by Sword_Korn on 25/01/2016.
 */
public class MysticIngotItem extends Item {

    public MysticIngotItem(String unlocalisedName) {
        super();
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(MysticalCrops.mysticalCropsTab);
    }
}
