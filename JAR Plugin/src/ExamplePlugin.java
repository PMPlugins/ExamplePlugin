import exampleplugin.listener.ExamplePluginCommandListener;
import exampleplugin.listener.ExamplePluginEventListener;
import redstonelamp.plugin.PluginBase;
import redstonelamp.resources.annotations.RedstonePlugin;

/**
 * Data about the plugin goes in the @RedstonePlugin annotation
 */
@RedstonePlugin(
	name = "ExamplePlugin",
	version = "1.0.0",
	api = 1.4,
	author = "RedstoneLamp",
	description = "An example plugin for developers",
	website = "http://RedstoneLamp.net"
)
/**
 * Plugins MUST extend PluginBase. If you don't, you will get nasty errors.
 */
public class ExamplePlugin extends PluginBase {
	/**
	 * This is where you can load/create config files, register events, or other cool startup stuff.
	 */
	public void onEnable() {
		//Create DataFolder if non existent (Only needed if using a config)
		this.getDataFolder();
		
		//Redister events in the EventPluginEventListener class
		this.getServer().getEventManager().registerEventListener(new ExamplePluginEventListener(this));
		
		//Register the example command
		this.getServer().getCommandManager().registerCommand("example", "Just an example command", new ExamplePluginCommandListener());
		
		//Tell the console the plugin is ready
		this.getLogger().info("ExampleJarPlugin enabled!");
	}
	
	/**
	 * This is where you close any open threads, files, etc.
	 */
	public void onDisable() {
		//Tell the console the plugin is disabled
		this.getLogger().warning("ExampleJarPlugin is no longer enabled! Did the server stop?");
	}
}
