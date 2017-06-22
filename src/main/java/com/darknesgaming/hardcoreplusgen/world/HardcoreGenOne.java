package com.darknesgaming.hardcoreplusgen.world;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class HardcoreGenOne implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case 1:
                genNether(world, random, chunkX, chunkZ);
                break;
            case -1:
                genEnd(world, random, chunkX, chunkZ);
                break;
            case 0:
                genSurface(world, random, chunkX, chunkZ);
                break;
            default:
                genSurface(world, random, chunkX, chunkZ);
                break;
        }
    }
    private void genSurface(World world, Random rand, int chunkX, int chunkZ) {
        // addOreSpawn(Blocks.FLOWING_LAVA.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16,24, 24, 10, 150, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(Blocks.TNT.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 8, 24, 0, 60, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(Blocks.FLOWING_LAVA.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 12, 10, 0, 60, BlockMatcher.forBlock(Blocks.STONE));
        addOreSpawn(Blocks.MAGMA.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 24, 70, 40, 180, BlockMatcher.forBlock(Blocks.GRASS));
    }
    // Work in progress
    private void genNether(World world, Random rand, int chunkX, int chunkZ) {
        //addOreSpawn(Blocks.FLOWING_LAVA.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 18, 35, 10, 200, BlockMatcher.forBlock(Blocks.AIR));
    }
    // Work in progress
    private void genEnd(World world, Random rand, int chunkX, int chunkZ) {
        //addOreSpawn(Blocks.TNT.getDefaultState(), world, rand, chunkX, chunkZ, 16, 16, 24, 35, 1, 250, BlockMatcher.forBlock(Blocks.AIR));
    }
    private void addOreSpawn(IBlockState block, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn) {
        int minMaxY = maxY - minY;
        for (int x = 0; x < chance; x++) {
            int posX = blockXPos * 16 + rand.nextInt(maxX);
            int posY = minY + rand.nextInt(minMaxY);
            int posZ = blockZPos * 16 + rand.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, rand, new BlockPos(posX, posY, posZ));
        }
    }
}
