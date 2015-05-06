import java.util.List;

import redstonelamp.Player;
import redstonelamp.cmd.CommandSender;
import redstonelamp.event.player.PlayerMoveEvent;
import redstonelamp.plugin.PluginBase;

public class ExamplePlugin extends PluginBase {
	public void onLoad() {
		//Sets the API version, which this plugin compares with
		this.setAPIVersion(1.3);
	}
	
	public void onEnable() {
		//registers a command, that allows players to issue
		this.getServer().getCommandRegistrationManager().registerCommand("example", "Example command for ExamplePlugin", true);
		//A debug message, that tell the console the plugin enables with no errors
		this.getServer().getLogger().info("[ExamplePlugin] ExamplePlugin enabled!");
	}
	
	public void onCommand(CommandSender sender, Command cmd, String label, List<String> args) {
		switch(cmd.getName()) {
			case "example":
			case "e": //Alias
				if(args.size() > 0) {
					sender.sendMessage("[ExamplePlugin] " + args.get(0));
				} else
					sender.sendMessage("Usage: /example <Message>");
			break;
		}
	}
	
	public boolean onPlayerMoveEvent(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		player.sendMessage("[ExamplePlugin] You moved!");
		//return true, to pass the event
		return true;
	}
	
	public boolean onPlayerInteract(PlayerInteractEvent event) {
		String player = event.getPlayer().getDisplayName();
		player.sendMessage("[ExamplePlugin] I do not let you to interact!");
		//return false, to cancel the event
		return false;
	}
	
	public void onDisable() {
		//To warn the console that the plugin has disabled
		this.getServer().getLogger().warn("[ExamplePlugin] ExamplePlugin has been disabled! Did the server stop?");
	}
}
