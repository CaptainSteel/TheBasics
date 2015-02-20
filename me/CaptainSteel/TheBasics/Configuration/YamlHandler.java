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
