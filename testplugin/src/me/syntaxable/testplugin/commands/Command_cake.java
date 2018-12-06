package me.syntaxable.testplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Command_cake implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String args, String[] arg0) {

		if(cmd.getName().equalsIgnoreCase("cake"));
		
		ItemStack cake = new ItemStack(Material.CAKE);
		Player p = (Player) sender;
		PlayerInventory pinventory = p.getInventory();
		
		pinventory.addItem(cake);
		p.sendMessage(ChatColor.AQUA + "the cake isnt a lie but its a truth :o");
		
		return false;
	}
	
}
