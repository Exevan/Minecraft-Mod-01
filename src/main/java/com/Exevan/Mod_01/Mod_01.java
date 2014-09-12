package com.Exevan.Mod_01;

import net.minecraftforge.common.config.Configuration;

import com.Exevan.Mod_01.handlers.ConfigHandler;
import com.Exevan.Mod_01.proxy.IProxy;
import com.Exevan.Mod_01.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MODID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory= Reference.GUI_FACTORY_CLASS)
public class Mod_01 {
	
	@Mod.Instance(Reference.MODID)
	public static Mod_01 mod;
	
	@SidedProxy(clientSide= Reference.CLIENT_PROXY_CLASS, serverSide= Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		ConfigHandler.init(e.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		FMLLog.info("PreInit complete!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		FMLLog.info("Init complete!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		FMLLog.info("PostInit complete!");
	}

}
