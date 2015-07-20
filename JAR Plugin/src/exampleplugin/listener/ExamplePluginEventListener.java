package exampleplugin.listener;

import redstonelamp.event.Event;
import redstonelamp.event.Listener;
import redstonelamp.plugin.PluginBase;

public class ExamplePluginEventListener implements Listener {
	private PluginBase plugin;
	
	/**
	 * Only required if you need PluginBase methods
	 * 
	 * @param PluginBase
	 */
	public ExamplePluginEventListener(PluginBase plugin) {
		this.plugin = plugin;
	}
	
	/**
	 * Handles an Event
	 */
	public void onEvent(Event e) {
		//Get the events class name
		switch(e.getEventName()) {
			//Handle PlayerJoinEvent
			case "PlayerJoinEvent":
				this.plugin.getLogger().info("A player joined");
			break;
			
			//Handle PlayerQuit event
			case "PlayerQuitEvent":
				this.plugin.getLogger().info("A player left");
			break;
		}
	}
}
