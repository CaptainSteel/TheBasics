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
