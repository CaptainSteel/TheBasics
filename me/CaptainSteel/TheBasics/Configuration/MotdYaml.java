package me.CaptainSteel.TheBasics.Configuration;

import java.io.File;
import java.io.IOException;

import me.CaptainSteel.TheBasics.BasicConsoleSender;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class MotdYaml
{
	static FileConfiguration motdFile;
	
	public static void checkForFile()
	{
		File motdConfigFile = new File("plugins/TheBasics", "motd.yml");
		if(motdConfigFile.exists())
		{
			 motdFile = YamlConfiguration.loadConfiguration(motdConfigFile);
		}else
		{
			try
			{
				motdConfigFile.createNewFile();
			} catch (IOException ex) 
			{
				BasicConsoleSender.consoleExceptionMessage("Could not create the motd config file.", ex);
			}
		}
	}
	
	
	public void getMotdDefaults()
	{
		//TODO Add the motd defaults.
	}
	public void setMotdDefaults()
	{
		//TODO Set the motd defaults if something like the file doesn't exist or the person configurated it wrong.
	}
	
	public void saveMotdConfig()
	{
		File motdConfigFile = new File("plugins/TheBasics", "motd.yml");
		try
		{
			motdFile.save(motdConfigFile);
		} catch (IOException e) 
		{
			BasicConsoleSender.consoleExceptionMessage("Could not save the motd.yml", e);
		}
	}
	
	public void loadMotdConfig()
	{
		File motdConfigFile = new File("plugins/TheBasics", "motd.yml");
		
		try
		{
			motdFile.load(motdConfigFile);
		} catch (IOException e) 
		{
			BasicConsoleSender.consoleExceptionMessage("Could not load the motd.yml", e);
		} catch (InvalidConfigurationException e)
		{
			BasicConsoleSender.consoleExceptionMessage("Could not load the motd.yml", e);
		}
	}
}
