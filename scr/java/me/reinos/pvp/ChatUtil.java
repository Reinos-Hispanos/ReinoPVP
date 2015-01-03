package me.reinos.pvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;


public class ChatUtil
{
private static final String PREFIX = ChatColor.BLUE + "[" + ChatColor.GREEN + ChatColor.BOLD + "ReinosPVP" + ChatColor.BLUE + "] " + ChatColor.WHITE;


public static void send(Player p, String message) {
  p.sendMessage(PREFIX + message);
}


public static void broadcast (String message) {
  Bukkit.broadcastMessage(PREFIX + message);
  }


}
