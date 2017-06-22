package com.darknesgaming.hardcoreplusgen.blocks;

import net.minecraft.block.BlockCactus;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HBlockCactus extends ModBlock {
    public HBlockCactus(Material mat, String name, CreativeTabs tabs, float hardness, float resistance) {
        super(mat, name, tabs, hardness, resistance);
    }

    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.attackEntityFrom(DamageSource.CACTUS, 3.0F);
    }
}
