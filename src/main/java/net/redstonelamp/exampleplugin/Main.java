package net.redstonelamp.exampleplugin;

import net.redstonelamp.Server;
import net.redstonelamp.plugin.java.JavaPlugin;
import net.redstonelamp.ui.Logger;

public class Main extends JavaPlugin {
	public Main(Server server, Logger logger, String name, String version, String[] authors, String website) {
		super(server, logger, name, version, authors, website);
	}
	
	@Override
	public void onEnable() {
		this.getLogger().info("ExamplePlugin has been enabled!");
	}
	
	@Override
	public void onDisable() {
		this.getLogger().info("ExamplePlugin is no longer enabled! Did the server stop?");
	}
}
