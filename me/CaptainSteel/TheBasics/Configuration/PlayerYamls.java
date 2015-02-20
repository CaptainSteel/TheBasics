package me.CaptainSteel.TheBasics.Configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import me.CaptainSteel.TheBasics.BasicConsoleSender;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerYamls
{
	private static FileConfiguration playerFile;
	
	@EventHandler
	public void playerCreateFileOnJoin(PlayerJoinEvent e)
	{
		File playerDataFile = new File("plugins/TheBasics/Players", e.getPlayer().getName() + ".yml");
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
				BasicConsoleSender.consoleExceptionMessage("Could not create the player file for: " + e.getPlayer().getName() + ".", ex);
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
