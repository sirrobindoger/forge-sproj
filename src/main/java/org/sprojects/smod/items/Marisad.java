package org.sprojects.smod.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.sprojects.smod.Main;

public class Marisad extends Item {
    public Marisad() {
        setRegistryName("marisad");
        setUnlocalizedName(Main.MODID + ".marisad");
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this,0, new ModelResourceLocation(getRegistryName(),"inventory"));

    }
}
