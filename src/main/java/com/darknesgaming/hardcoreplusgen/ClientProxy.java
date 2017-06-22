package com.darknesgaming.hardcoreplusgen;

import com.darknesgaming.hardcoreplusgen.handlers.BlockHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }
    public void init(FMLInitializationEvent event) {
        super.init(event);
        BlockHandler.registerRenders();
    }
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
