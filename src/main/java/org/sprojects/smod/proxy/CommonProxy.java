package org.sprojects.smod.proxy;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.sprojects.smod.ModBlocks;
import org.sprojects.smod.blocks.*;
import org.sprojects.smod.items.Marisad;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new MarisadBlock());
        event.getRegistry().register(new FumoBlock());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Marisad());
        event.getRegistry().register(new ItemBlock(ModBlocks.marisadBlock).setRegistryName(ModBlocks.marisadBlock.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.fumoBlock).setRegistryName(ModBlocks.fumoBlock.getRegistryName()));
    }
}