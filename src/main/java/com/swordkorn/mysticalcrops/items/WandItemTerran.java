package com.swordkorn.mysticalcrops.items;

import com.swordkorn.mysticalcrops.MysticalCrops;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

/**
 * Created by Sword_Korn on 26/01/2016.
 */
public class WandItemTerran extends Item {
    public WandItemTerran(String unlocalisedName) {
        super();
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(MysticalCrops.mysticalCropsTab);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side,
                             float hitX, float hitY, float hitZ) {
        Block placed = world.getBlockState(pos).getBlock();

        if(!world.isRemote) {
            if(placed.isBlockSolid(world, pos, EnumFacing.DOWN) && side == EnumFacing.UP &&
                    world.isAirBlock(pos.offset(EnumFacing.UP))) {
                world.setBlockState(pos.offset(EnumFacing.UP), Blocks.grass.getDefaultState());
            }else if(placed.isBlockSolid(world, pos, EnumFacing.EAST) && side == EnumFacing.WEST &&
                    world.isAirBlock(pos.offset(EnumFacing.WEST))) {
                world.setBlockState(pos.offset(EnumFacing.WEST), Blocks.grass.getDefaultState());
            }else if(placed.isBlockSolid(world, pos, EnumFacing.UP) && side == EnumFacing.DOWN &&
                    world.isAirBlock(pos.offset(EnumFacing.DOWN))) {
                world.setBlockState(pos.offset(EnumFacing.DOWN), Blocks.grass.getDefaultState());
            }else if(placed.isBlockSolid(world, pos, EnumFacing.WEST) && side == EnumFacing.EAST &&
                    world.isAirBlock(pos.offset(EnumFacing.EAST))) {
                world.setBlockState(pos.offset(EnumFacing.EAST), Blocks.grass.getDefaultState());
            }else if(placed.isBlockSolid(world, pos, EnumFacing.NORTH) && side == EnumFacing.SOUTH &&
                    world.isAirBlock(pos.offset(EnumFacing.SOUTH))) {
                world.setBlockState(pos.offset(EnumFacing.SOUTH), Blocks.grass.getDefaultState());
            }else if(placed.isBlockSolid(world, pos, EnumFacing.SOUTH) && side == EnumFacing.NORTH &&
                    world.isAirBlock(pos.offset(EnumFacing.NORTH))) {
                world.setBlockState(pos.offset(EnumFacing.NORTH), Blocks.grass.getDefaultState());
            }else{
                return false;
            }
        }
        return false;
    }
}
