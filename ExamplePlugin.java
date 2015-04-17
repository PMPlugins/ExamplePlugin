import java.util.List;

import redstonelamp.Player;
import redstonelamp.cmd.CommandSender;
import redstonelamp.event.player.PlayerMoveEvent;
import redstonelamp.plugin.PluginBase;

public class ExamplePlugin extends PluginBase {
	public void onLoad() {
		this.getServer().getCommandRegistrationManager().registerCommand("example", "Example command for ExamplePlugin", true);
		this.getServer().getLogger().info("[ExamplePlugin] ExamplePlugin loaded!");
	}
	
	public void onCommand(CommandSender sender, Command cmd, String label, List<String> args) {
		switch(cmd.getName()) {
			case "example":
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
		return true;
	}
	
	public void onDisable() {
		this.getServer().getLogger().warn("[ExamplePlugin] ExamplePlugin has been disabled! Did the server stop?");
	}
}
