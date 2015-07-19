package exampleplugin.listener;

import redstonelamp.event.Event;
import redstonelamp.event.Listener;
import redstonelamp.plugin.PluginBase;

public class ExamplePluginEventListener implements Listener {
	private PluginBase plugin;
	
	public ExamplePluginEventListener(PluginBase plugin) {
		this.plugin = plugin;
	}
	
	public void onEvent(Event e) {
		switch(e.getName()) {
			case "PlayerJoinEvent":
				this.plugin.getLogger().info("A player joined");
			break;
			case "PlayerQuitEvent":
				this.plugin.getLogger().info("A player left");
			break;
		}
	}
}
