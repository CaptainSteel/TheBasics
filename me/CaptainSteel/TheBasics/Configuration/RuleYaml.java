package me.CaptainSteel.TheBasics.Configuration;

import java.io.File;
import java.io.IOException;

import me.CaptainSteel.TheBasics.BasicConsoleSender;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class RuleYaml 
{
	static FileConfiguration ruleFile;
	
	public static void checkForFile()
	{
		File ruleConfigFile = new File("plugins/TheBasics", "rule.yml");
		if(ruleConfigFile.exists())
		{
			 ruleFile = YamlConfiguration.loadConfiguration(ruleConfigFile);
		}else
		{
			try
			{
				ruleConfigFile.createNewFile();
			} catch (IOException ex) 
			{
				BasicConsoleSender.consoleExceptionMessage("Could not create the rule config file.", ex);
			}
		}
	}
	
	
	public void getruleDefaults()
	{
		//TODO Add the rule defaults.
	}
	public void setruleDefaults()
	{
		//TODO Set the rule defaults if something like the file doesn't exist or the person configurated it wrong.
	}
	
	public void saveRuleConfig()
	{
		File ruleConfigFile = new File("plugins/TheBasics", "rule.yml");
		try
		{
			ruleFile.save(ruleConfigFile);
		} catch (IOException e) 
		{
			BasicConsoleSender.consoleExceptionMessage("Could not save the rule.yml", e);
		}
	}
	
	public void loadRuleConfig()
	{
		File ruleConfigFile = new File("plugins/TheBasics", "rule.yml");
		try
		{
			ruleFile.load(ruleConfigFile);
		} catch (IOException e) 
		{
			BasicConsoleSender.consoleExceptionMessage("Could not load the rule.yml", e);
		} catch (InvalidConfigurationException e)
		{
			BasicConsoleSender.consoleExceptionMessage("Could not load the rule.yml", e);
		}
	}
}
