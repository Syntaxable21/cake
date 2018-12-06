package me.syntaxable.testplugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.syntaxable.testplugin.commands.Command_cake;

public class Main extends JavaPlugin implements CommandExecutor {

	@Override
	public void onEnable() {
		System.out.println("Test has been enabled");
		this.getCommand("cake").setExecutor(new Command_cake());
	
	}

	@Override
	public void onDisable() {
		System.out.println("Test has been disabled");
		
	}
	
}
