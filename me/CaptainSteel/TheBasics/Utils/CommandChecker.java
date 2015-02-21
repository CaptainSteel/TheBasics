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
