package me.reinos.pvp;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Plugin extends JavaPlugin implements Listener{
	
	public static final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		logger.info(ChatColor.BLUE + "[" + ChatColor.GREEN + "ReinosPVP" + ChatColor.BLUE + "]" + ChatColor.DARK_AQUA + "Plugin habilitado");
		
		saveConfig();
		
	}
	public void onDisable() {
		logger.info(ChatColor.BLUE + "[" + ChatColor.GREEN + "ReinosPVP" + ChatColor.BLUE + "]" + ChatColor.RED + "Plugin desabilitado");
		
		saveConfig();
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player)sender;
		String command = cmd.getName();
		
		if(command.equalsIgnoreCase("rpvp")) {
		    	  if(args.length == 0) {
			           player.sendMessage("§4§l▃▄▅▆▇█  §a§lREINOSPVP §4§l█▇▆▅▄▃");
		                player.sendMessage("§0§l====================================");
		                player.sendMessage("§9§l/rpvp arena §e§l- §b§lVer los comandos para crear la arena");
		                player.sendMessage("§9§l/rpvp entrar <NOMBREARENA> §e§l- §b§lEntrar a una arena");
		                player.sendMessage("§9§l/rpvp salir §e§l- §b§lSalir de la arena");
		    	  }
		      } else {
		    	  sender.sendMessage("§c§lComando solo para jugadores, no para la consola :P");
		      }
		return false;
	}
}
