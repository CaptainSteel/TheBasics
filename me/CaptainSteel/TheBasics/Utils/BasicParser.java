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
