package com.danilpripat.industrialnextgen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = IndustrialNextGen.MODID, name = IndustrialNextGen.NAME, version = IndustrialNextGen.VERSION)
public class IndustrialNextGen {

    public static final String MODID = "industrialnextgen";
    public static final String NAME = "Industrial NextGen";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // сюда позже добавим инициализацию
    }
}