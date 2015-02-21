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

public class YamlHandler
{
	private static PlayerYamls playerYamls;
	private static MainYaml mainYaml;
	private static MotdYaml motdYaml;
	private static RuleYaml ruleYaml;

	public YamlHandler()
	{
		playerYamls = new PlayerYamls();
		mainYaml = new MainYaml();
		motdYaml = new MotdYaml();
		ruleYaml = new RuleYaml();
	}
	
	public static PlayerYamls getPlayerYamls() 
	{
		return playerYamls;
	}

	public static MainYaml getMainYaml() 
	{
		return mainYaml;
	}

	public static MotdYaml getMotdYaml() 
	{
		return motdYaml;
	}

	public static RuleYaml getRuleYaml() 
	{
		return ruleYaml;
	}
	
	public static void saveAllConfigs()
	{
		mainYaml.saveMainConfig();
		motdYaml.saveMotdConfig();
		ruleYaml.saveRuleConfig();
		playerYamls.savePlayerFiles();
	}
	
	public static void loadAllConfigs()
	{
		mainYaml.loadMainConfig();
		motdYaml.loadMotdConfig();
		ruleYaml.loadRuleConfig();
		playerYamls.loadPlayerFiles();
	}
	
}
