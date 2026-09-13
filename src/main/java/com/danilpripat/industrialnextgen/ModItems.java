package com.danilpripat.industrialnextgen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class ModItems {

    public static final Item LEAD_INGOT = new Item()
            .setUnlocalizedName("lead_ingot")
            .setRegistryName("lead_ingot")
            .setCreativeTab(CreativeTabs.MATERIALS);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(LEAD_INGOT);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(LEAD_INGOT, 0,
                new ModelResourceLocation(LEAD_INGOT.getRegistryName(), "inventory"));
    }
}