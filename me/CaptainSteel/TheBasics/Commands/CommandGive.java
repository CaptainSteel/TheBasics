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

package me.CaptainSteel.TheBasics.Commands;

import me.CaptainSteel.TheBasics.BasicPlayerSender;
import me.CaptainSteel.TheBasics.Utils.BasicParser;
import me.CaptainSteel.TheBasics.Utils.CommandChecker;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandGive implements CommandExecutor 
{
	private static Player player;
	private static Player player2;
	private static int amount;
	private static int itemID;

	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		player = (Player) sender;
		player2 = Bukkit.getServer().getPlayer(args[1]);
	
		if(label.equalsIgnoreCase(CommandList.GIVE_CMD))
		{
			if(args.length == 3)
			{
				if(CommandChecker.check(player, Permissions.GIVE_PERMISSION, player2))
				{
					if(CommandChecker.invEmpty(player))
					{
						amount = BasicParser.parseInt(args[3]);
						
						ItemStack item = new ItemStack(BasicParser.parseItemStack(args, itemID, player), amount);
						
						player.getInventory().addItem(item);
					}
				}
			}else
			{
				BasicPlayerSender.sendLackArgsMessage(player);
			}
		}
		
		return false;
	}
	
	public Player getPlayer()
	{
		return player;
	}
	
	public Player getPlayer2()
	{
		return player2;
	}
}
