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
