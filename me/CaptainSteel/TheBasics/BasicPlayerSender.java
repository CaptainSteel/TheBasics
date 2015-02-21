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
