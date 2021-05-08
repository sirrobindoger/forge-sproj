package org.sprojects.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.sprojects.mod.proxy.CommonProxy;


@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION, useMetadata = true)
public class Main
{
    public static final String MODID = "smod";
    public static final String NAME = "sProject";
    public static final String VERSION = "0.0";

    @SidedProxy(clientSide = "org.sprojects.mod.proxy.ClientProxy", serverSide = "org.sprojects.mod.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Main instance;

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
