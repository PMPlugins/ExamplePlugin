/*
 * A JavaScript plugin is used to call API for plugins that allow it
 */
function onEnable() {
	this.api.getServer().getCommandManager().registerCommand("example", "Just an example command", null, "example.cmd.example");
	this.api.getLogger().info("ExamplePlugin has been enabled!");
}

function onCommand(sender, cmd, label, args) {
	switch(cmd.getName()) {
		case "example":
			sender.sendMessage("This is an example command!");
		break;
	}
}

function onDisable() {
	this.api.getLogger().info("ExamplePlugin is no longer enabled! Dis the server stop?");
}