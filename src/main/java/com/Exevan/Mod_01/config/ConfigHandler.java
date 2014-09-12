package com.Exevan.Mod_01.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static void init(File configFile) {
		
		Configuration config = new Configuration(configFile);
		
		int value = 0;
		
		try {
			config.load();
			value = config.get(Configuration.CATEGORY_GENERAL, "value", 10, "test config value").getInt(10);
		} catch(Exception e) {
			
		} finally {
			config.save();
		}
		
	}

}
