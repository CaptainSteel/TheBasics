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

package me.CaptainSteel.TheBasics.Configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import me.CaptainSteel.TheBasics.BasicConsoleSender;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerYamls
{
	private static FileConfiguration playerFile;
	
	@EventHandler
	public void playerCreateFileOnJoin(PlayerJoinEvent e)
	{
		File playerDataFile = new File("plugins/TheBasics/Players", e.getPlayer().getUniqueId() + ".yml");
		if(playerDataFile.exists())
		{
			 playerFile = YamlConfiguration.loadConfiguration(playerDataFile);
		}else
		{
			try
			{
				playerDataFile.createNewFile();
			} catch (IOException ex) 
			{
				BasicConsoleSender.consoleExceptionMessage("Could not create the player file for: " + e.getPlayer().getUniqueId() + ".", ex);
			}
		}
	}// END playerCreateFileOnJoin()
	
	
	// Creates the player folder if it does not exist.
	public void createPlayerFolder()
	{
		File playerFolder;
		 
		// Try to create the folder.
		try
		{
			playerFolder = new File("plugins" + File.separator + "TheBasics" + File.separator + "Players");
			 
            if(!playerFolder.exists())
            {
               playerFolder.mkdirs();
            }
        // If it doesnt work, send message to console.
		}catch (Exception e) 
		{
       	 	BasicConsoleSender.consoleExceptionMessage("Could not create player folder.", e);
       	 	playerFolder = null;
        }
	}// END createPlayerFolder()
	
	public static File getPlayerFile(Player p)
	{
		File playerNameFile = new File("plugins/TheBasics/Players/" + p.getUniqueId());
		
		return playerNameFile;
	}
	
    public static File listPlayerFiles()
    {
    	File playerDataFile = new File("plugins/TheBasics/Players");
        PlayerYamls playerYamls = new PlayerYamls();
        playerYamls.getFiles(playerDataFile);
		return playerDataFile;
    }
    
    public void getFiles(File f)
    {
        File files[];
        
        if(f.isFile())
        {
            BasicConsoleSender.consoleErrorMessage(f.getAbsolutePath());
        }
        else
        {
            files = f.listFiles();
            
            for (int i = 0; i < files.length; i++)
            {
                getFiles(files[i]);
            }
        }
    }
    
    public void savePlayerFiles()
    {
		try 
		{
			playerFile.save(listPlayerFiles());
		} catch (IOException e) 
		{
			BasicConsoleSender.consoleExceptionMessage("Could not save player files.", e);
		}
    }
    
    public void loadPlayerFiles()
    {
    	try 
    	{
			playerFile.load(listPlayerFiles());
		} catch (FileNotFoundException e) 
    	{
			BasicConsoleSender.consoleExceptionMessage("Could not load player files.", e);
		} catch (IOException e) 
    	{
			BasicConsoleSender.consoleExceptionMessage("Could not load player files.", e);
		} catch (InvalidConfigurationException e) {
			BasicConsoleSender.consoleExceptionMessage("Could not load player files.", e);
		}
    }
    
    
}
