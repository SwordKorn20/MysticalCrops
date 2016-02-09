package com.swordkorn.mysticalcrops.items;

import com.swordkorn.mysticalcrops.MysticalCrops;
import com.swordkorn.mysticalcrops.blocks.CropBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

/**
 * Created by Sword_Korn on 24/01/2016.
 */
public class GoldSeedItem extends Item implements IPlantable
{
    private String name = "goldSeed";

    public GoldSeedItem(String unlocalisedName)
    {
        super();
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(MysticalCrops.mysticalCropsTab);
    }

    public String getName() {
        return name;
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side,
                             float hitX, float hitY, float hitZ)
    {
        Block placed = world.getBlockState(pos).getBlock();

        if(placed.canSustainPlant(world, pos, EnumFacing.UP, this) && side == EnumFacing.UP &&
                world.isAirBlock(pos.offset(EnumFacing.UP)))
        {
            world.setBlockState(pos.offset(EnumFacing.UP), CropBlocks.goldCropBlock.getDefaultState());
            if(!player.capabilities.isCreativeMode)
            {
                player.inventory.decrStackSize(player.inventory.currentItem, 1);
                return true;
            }
        }
        return false;
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos)
    {
        return EnumPlantType.Crop;
    }

    @Override
    public IBlockState getPlant(IBlockAccess world, BlockPos pos)
    {
        return CropBlocks.goldCropBlock.getDefaultState();
    }
}
