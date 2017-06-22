package com.darknesgaming.hardcoreplusgen.handlers;

import com.darknesgaming.hardcoreplusgen.blocks.HBlockCactus;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHandler {

    private static Block hcactus;

    public static void init() {
        hcactus = new HBlockCactus(Material.CACTUS, "hardcore_cactus", CreativeTabs.DECORATIONS, 0.4F, 1.0F);
    }
    public static void register() {
        GameRegistry.register(hcactus);
    }
    public static void registerRenders() {
        registerRender(hcactus);
    }
    private static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
