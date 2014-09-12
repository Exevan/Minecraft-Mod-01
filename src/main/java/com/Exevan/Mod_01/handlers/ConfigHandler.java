package com.Exevan.Mod_01.handlers;

import java.io.File;

import com.Exevan.Mod_01.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	public static int value = 0;
	
	public static void init(File configFile) {
		
		//Create config object from file
		if (config == null) {
			
			config = new Configuration(configFile);
			loadConfig();
			
		}
		
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent e) {
		
		if(e.modID.equalsIgnoreCase(Reference.MODID)) {
			
			//Resynch config
			loadConfig();
			
		}
		
	}
	
	private static void loadConfig() {
		
		//Read config value
		value = config.getInt("value", Configuration.CATEGORY_GENERAL, 10, 0, 100, "test config value");

		//Save config file
		if (config.hasChanged())
			config.save();
		
	}
}
