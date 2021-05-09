package org.sprojects.smod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import org.sprojects.smod.blocks.FumoBlock;
import org.sprojects.smod.blocks.MarisadBlock;

public class ModBlocks {
    @GameRegistry.ObjectHolder("smod:marisadblock")
    public static MarisadBlock marisadBlock;

    @GameRegistry.ObjectHolder("smod:fumoblock")
    public static FumoBlock fumoBlock;

}
