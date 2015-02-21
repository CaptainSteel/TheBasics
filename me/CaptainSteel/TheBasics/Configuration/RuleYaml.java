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
