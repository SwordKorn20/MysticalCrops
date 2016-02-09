package com.swordkorn.mysticalcrops.blocks;

import com.swordkorn.mysticalcrops.MysticalCrops;
import com.swordkorn.mysticalcrops.tileentities.TileEntityDuster;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * Created by Sword_Korn on 01/02/2016.
 */
public class MysticalCropBlockDuster extends Block {
    public MysticalCropBlockDuster(String unlocalisedName) {
        super(Material.iron);
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(MysticalCrops.mysticalCropsTab);
        this.setHardness(3.0F);
        this.setResistance(8.0F);
        this.setBlockBounds(0.125F, 0.0F, 0.125F, 0.875F, 1.0F, 0.875F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FILL, false));
    }

    public static final PropertyBool FILL = PropertyBool.create("fill");

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, FILL);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    @Override
    public int getRenderType() {
        return 3;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
}
