package com.swordkorn.mysticalcrops.blocks;

import com.swordkorn.mysticalcrops.items.CropItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Sword_Korn on 24/01/2016.
 */
public class MysticalCropBlockMystic extends BlockCrops implements IGrowable {

    public MysticalCropBlockMystic(String unlocalisedName) {

        super();
        this.setUnlocalizedName(unlocalisedName);
        this.getDefaultState();
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }

    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 7);

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(AGE, meta);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return (Integer) state.getValue(AGE);
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, AGE);
    }

    @Override
    public int getRenderType() {
        return 3;
    }

    @Override
    public boolean canGrow(World world, BlockPos pos, IBlockState state, boolean isClient) {
        return (Integer) state.getValue(AGE) < 7;
    }

    @Override
    public boolean canUseBonemeal(World world, Random rand, BlockPos pos, IBlockState state) {
        return false;
    }

    @Override
    public void grow(World world, Random rand, BlockPos pos, IBlockState state) {

        int newAge = (Integer) state.getValue(AGE) + 1;

        if (newAge >= 7) {
            newAge = 7;
        }

        world.setBlockState(pos, state.withProperty(AGE, newAge), 7);
    }

    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
        super.updateTick(world, pos, state, rand);

        if(world.getLightFromNeighbors(pos.up()) >= 9) {
            int i = (Integer) state.getValue(AGE);

            if(i < 2) {
                if(rand.nextInt(5) == 0) {
                    world.setBlockState(pos, state.withProperty(AGE, i + 1), 7);
                }
            }
        }
    }

    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        return super.canPlaceBlockAt(world, pos) && world.getBlockState(pos.down()).getBlock().canSustainPlant(world,
                pos.down(), net.minecraft.util.EnumFacing.UP, this);
    }
    @Override
    protected boolean canPlaceBlockOn(Block block) {
        return block == Blocks.farmland;
    }

    @Override
    public void dropBlockAsItemWithChance(World world, BlockPos pos, IBlockState state, float chance, int fortune) {
        super.dropBlockAsItemWithChance(world, pos, state, chance, 0);
    }

    @Override
    public java.util.List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state,
                                              int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        Random rand = world instanceof World ? ((World) world).rand : new Random();

        if((Integer) state.getValue(AGE) >= 2) {
            for(int i = 0; i < 3; i++) {
                if(state.getValue(AGE) >= 7)
                    ret.add(new ItemStack(CropItems.nuggetMystic, 1));
                }
            }
            for(int i = 0; i < 1; i++) {
                ret.add(new ItemStack(CropItems.mysticSeed, 1));
        }
        return ret;
    }
}
