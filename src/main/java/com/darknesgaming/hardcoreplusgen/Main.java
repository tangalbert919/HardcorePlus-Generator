package com.darknesgaming.hardcoreplusgen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
    public static final String MODID = "hardcoreplusgen";
    public static final String VERSION = "Stable Prototype Build";

    @SidedProxy(clientSide = "com.darknesgaming.hardcoreplusgen.ClientProxy", serverSide = "com.darknesgaming.hardcoreplusgen.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        this.proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        this.proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        this.proxy.postInit(event);
    }
}
