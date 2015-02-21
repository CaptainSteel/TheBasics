package me.CaptainSteel.TheBasics.Utils;

import me.CaptainSteel.TheBasics.BasicConsoleSender;
import me.CaptainSteel.TheBasics.BasicPlayerSender;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BasicParser
{
	private static int i;
	
	public static int parseInt(String m)
	{
		i = Integer.parseInt(m);
		
		return i;
	}
	
	@SuppressWarnings(value = {"deprecation", "unused"})
	public static int parseItemStack(String[] args, int itemID, Player player)
	{
		try
		{
			itemID = BasicParser.parseInt(args[2]);
		}catch(NumberFormatException e)
		{
			BasicConsoleSender.consoleExceptionMessage("Could not parse the integer. Please enter a valid number.", e);
			BasicPlayerSender.sendPlayerInvalidNumberMessage(player);
		}
		
		try
		{
			ItemStack item = new ItemStack(itemID);
		}catch(NullPointerException e)
		{
			BasicConsoleSender.consoleExceptionMessage("Could not parse the integer. Please enter a valid number.", e);
			BasicPlayerSender.sendPlayerInvalidItemID(player);
		}
		return itemID;
	}
}
