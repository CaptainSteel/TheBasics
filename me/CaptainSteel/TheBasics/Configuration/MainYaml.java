/*
    Copyright (C) 2015 Levi Pawlak

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/

package me.CaptainSteel.TheBasics.Configuration;

import java.io.File;
import java.io.IOException;

import me.CaptainSteel.TheBasics.BasicConsoleSender;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class MainYaml extends YamlHandler
{
	static FileConfiguration mainFile;
	
	public static void checkForFile()
	{
		File mainConfigFile = new File("plugins/TheBasics", "config.yml");
		if(mainConfigFile.exists())
		{
			 mainFile = YamlConfiguration.loadConfiguration(mainConfigFile);
		}else
		{
			try
			{
				mainConfigFile.createNewFile();
			} catch (IOException ex) 
			{
				BasicConsoleSender.consoleExceptionMessage("Could not create the main config file.", ex);
			}
		}
	}
	
	
	public void getMainDefaults()
	{
		//TODO Add the main defaults.
	}
	public void setMainDefaults()
	{
		//TODO Set the main defaults if something like the file doesn't exist or the person configurated it wrong.
	}
	
	public void saveMainConfig()
	{
		File mainConfigFile = new File("plugins/TheBasics", "config.yml");
		try
		{
			mainFile.save(mainConfigFile);
		} catch (IOException e) 
		{
			BasicConsoleSender.consoleExceptionMessage("Could not save the config.yml", e);
		}
	}
	
	public void loadMainConfig()
	{
		File mainConfigFile = new File("plugins/TheBasics", "config.yml");
		try
		{
			mainFile.load(mainConfigFile);
		} catch (IOException e) 
		{
			BasicConsoleSender.consoleExceptionMessage("Could not load the config.yml", e);
		} catch (InvalidConfigurationException e)
		{
			BasicConsoleSender.consoleExceptionMessage("Could not load the config.yml", e);
		}
	}
}
