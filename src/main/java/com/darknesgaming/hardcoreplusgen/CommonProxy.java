package com.darknesgaming.hardcoreplusgen;

import com.darknesgaming.hardcoreplusgen.world.HardcoreGenOne;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    }
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new HardcoreGenOne(), 0);
    }
    public void postInit(FMLPostInitializationEvent event) {

    }
}
