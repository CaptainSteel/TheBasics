package me.CaptainSteel.TheBasics.Utils;

import me.CaptainSteel.TheBasics.BasicPlayerSender;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandChecker 
{
	public static boolean check(Player player, String perm, Player player2)
	{
		if(player.hasPermission(perm))
		{
			if(player2.isOnline())
			{
				return true;
			}else
			{
				BasicPlayerSender.sendPlayerNotOnlineMessage(player, player2);
				return false;
			}
		}else
		{
			BasicPlayerSender.sendNoPermMessage(player);
			return false;
		}
	}
	
	public static boolean check(Player player, String perm)
	{
		if(player.hasPermission(perm))
		{
			return true;
		}else
		{
			BasicPlayerSender.sendNoPermMessage(player);
			return false;
		}
	}
	
	public static boolean invEmpty(Player player)
	{
		boolean isEmpty = false;
		
		for(ItemStack i : player.getInventory().getContents())
		{
			if(i != null)
			{
				isEmpty = false;
			}else
			{
				isEmpty = true;
			}
		}
		
		if(isEmpty)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
