package com.Exevan.Mod_01;

import net.minecraftforge.common.config.Configuration;

import com.Exevan.Mod_01.config.ConfigHandler;
import com.Exevan.Mod_01.proxy.IProxy;
import com.Exevan.Mod_01.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MODID, name= Reference.MOD_NAME, version= Reference.VERSION)
public class Mod_01 {
	
	@Mod.Instance(Reference.MODID)
	public static Mod_01 mod;
	
	@SidedProxy(clientSide= Reference.CLIENT_PROXY_CLASS, serverSide= Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		ConfigHandler.init(e.getSuggestedConfigurationFile());
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}

}
