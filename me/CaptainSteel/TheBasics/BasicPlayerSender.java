package me.CaptainSteel.TheBasics;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class BasicPlayerSender 
{
	public static void sendMessage(Player player, String m)
	{
		player.sendMessage(ChatColor.BLACK + "[" + ChatColor.GOLD + "TheBasics" + ChatColor.BLACK + "] " + ChatColor.GOLD + m);
	}
	
	public static void sendNoPermMessage(Player player)
	{
		player.sendMessage(ChatColor.BLACK + "[" + ChatColor.GOLD + "TheBasics" + ChatColor.BLACK + "] " + ChatColor.GOLD + "You do not have enough permission to peform this command!");
	}
	
	public static void sendLackArgsMessage(Player player)
	{
		player.sendMessage(ChatColor.BLACK + "[" + ChatColor.GOLD + "TheBasics" + ChatColor.BLACK + "] " + ChatColor.GOLD + "You do not have enough or to many arguements for this command!");
	}
	
	public static void sendPlayerNotOnlineMessage(Player player, Player player2)
	{
		player.sendMessage(ChatColor.BLACK + "[" + ChatColor.GOLD + "TheBasics" + ChatColor.BLACK + "] " + ChatColor.GOLD + "The player: " + ChatColor.RED + player2.getName() + ChatColor.GOLD + " is not online!");
	}
	
	public static void sendPlayerInvalidNumberMessage(Player player)
	{
		player.sendMessage(ChatColor.BLACK + "[" + ChatColor.GOLD + "TheBasics" + ChatColor.BLACK + "] " + ChatColor.GOLD + "You entered 1 or more invalid numbers!");
	}
	
	public static void sendPlayerInvalidItemID(Player player)
	{
		player.sendMessage(ChatColor.BLACK + "[" + ChatColor.GOLD + "TheBasics" + ChatColor.BLACK + "] " + ChatColor.GOLD + "You entered a number that is not an itemID for minecraft!");
	}
}
