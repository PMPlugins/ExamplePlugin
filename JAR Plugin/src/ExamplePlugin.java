import exampleplugin.listener.ExamplePluginEventListener;
import redstonelamp.plugin.PluginBase;

/**
 * Plugins MUST extend PluginBase. If you don't, you will get nasty errors.
 */
public class ExamplePlugin extends PluginBase {
	/**
	 * This is where you can load/create config files, register events, or other cool startup stuff.
	 */
	public void onEnable() {
		this.getDataFolder();
		this.getServer().getEventManager().registerEvents(new ExamplePluginEventListener(this));
		this.getLogger().info("ExampleJarPlugin enabled!");
	}
	
	/**
	 * This is where you close any open threads, files, etc.
	 */
	public void onDisable() {
		this.getLogger().warning("ExampleJarPlugin is no longer enabled! Did the server stop?");
	}
}
