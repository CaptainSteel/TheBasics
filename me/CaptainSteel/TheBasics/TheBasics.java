package me.CaptainSteel.TheBasics;

import org.bukkit.plugin.java.JavaPlugin;

public class TheBasics extends JavaPlugin
{
	public void onEnable()
	{
		BasicConsoleSender.consoleOnEnableMessage();
	}
	
	public void onDisable()
	{
		BasicConsoleSender.consoleOnDisableMessage();
	}
}
