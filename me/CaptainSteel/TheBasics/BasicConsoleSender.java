package me.CaptainSteel.TheBasics;

import java.util.logging.Level;

import org.bukkit.Bukkit;

public class BasicConsoleSender
{
	public static void consoleMainMessage(String m)
	{
		Bukkit.getLogger().log(Level.INFO, m);
	}
	
	public static void consoleExceptionMessage(String m, Exception e)
	{
		Bukkit.getLogger().log(Level.WARNING, "[" + e.toString() + "]" + m);
	}
	
	public static void consoleErrorMessage(String m)
	{
		Bukkit.getLogger().log(Level.SEVERE, m);
	}
	
	public static void consoleOnEnableMessage()
	{
		consoleMainMessage("The Basics Has Been Enabled!");
		consoleMainMessage("         Version 1.0a");
		consoleMainMessage("    Author: Captain_Steel");
	}
	
	public static void consoleOnDisableMessage()
	{
		consoleMainMessage("The Basics Has Been Disabled!");
		consoleMainMessage("         Version 1.0a");
		consoleMainMessage("    Author: Captain_Steel");
	}
}
