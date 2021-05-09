package org.sprojects.smod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.sprojects.smod.Main;

public class MarisadBlock extends Block {
    public MarisadBlock() {
        super(Material.ROCK);
        setUnlocalizedName(Main.MODID + ".marisadblock");
        setRegistryName("marisadblock");

    }
}
