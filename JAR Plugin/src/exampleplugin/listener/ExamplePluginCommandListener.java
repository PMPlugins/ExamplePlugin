package exampleplugin.listener;

import redstonelamp.cmd.Command;
import redstonelamp.cmd.CommandListener;
import redstonelamp.cmd.CommandSender;

public class ExamplePluginCommandListener implements CommandListener {
	/**
	 * Handles the command sent
	 */
	public void onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		//Get the command sent
		switch(cmd.getName()) {
			//Handle the command "/example"
			case "example":
				//Tell the sender something
				sender.sendMessage("This is an example command!");
			break;
		}
	}
}
