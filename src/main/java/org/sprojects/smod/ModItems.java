package org.sprojects.smod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sprojects.smod.blocks.FumoBlock;
import org.sprojects.smod.items.Marisad;

public class ModItems {
    @GameRegistry.ObjectHolder("smod:marisad")
    public static Marisad marisad;


    @SideOnly(Side.CLIENT)
    public static void initModels() {
        marisad.initModel();
    }

}
