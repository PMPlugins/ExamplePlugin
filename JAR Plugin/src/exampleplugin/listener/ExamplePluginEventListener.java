package exampleplugin.listener;

import redstonelamp.event.Listener;
import redstonelamp.event.player.PlayerJoinEvent;
import redstonelamp.event.player.PlayerQuitEvent;
import redstonelamp.plugin.PluginBase;
import redstonelamp.resources.annotations.EventHandler;

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
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		this.plugin.getLogger().info("A player joined!");
	}
	
	/**
	 * Handles another Event
	 */
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		this.plugin.getLogger().info("A player left!");
	}
}
