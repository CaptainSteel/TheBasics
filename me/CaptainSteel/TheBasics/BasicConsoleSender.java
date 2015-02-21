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

import java.util.logging.Level;

import org.bukkit.Bukkit;

public class BasicConsoleSender
{
	public static void consoleMainMessage(String m)
	{
		Bukkit.getLogger().log(Level.INFO, m);
	}
	
	public static void consoleExceptionMessage(String m, Exception e)
	{
		Bukkit.getLogger().log(Level.WARNING, "[" + e.toString() + "]" + m);
	}
	
	public static void consoleErrorMessage(String m)
	{
		Bukkit.getLogger().log(Level.SEVERE, m);
	}
	
	public static void consoleOnEnableMessage()
	{
		consoleMainMessage("The Basics Has Been Enabled!");
		consoleMainMessage("         Version 1.0a");
		consoleMainMessage("    Author: Captain_Steel");
	}
	
	public static void consoleOnDisableMessage()
	{
		consoleMainMessage("The Basics Has Been Disabled!");
		consoleMainMessage("         Version 1.0a");
		consoleMainMessage("    Author: Captain_Steel");
	}
}
