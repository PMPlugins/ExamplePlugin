import redstonelamp.plugin.PluginBase;

public class ExamplePlugin extends PluginBase {
	public void onLoad() {
		this.getServer().getLogger().info("[ExamplePlugin] ExamplePlugin has been enabled!");
	}
	
	public void onDisable() {
		this.getServer().getLogger().warn("[ExamplePlugin] ExamplePlugin is no longer enabled! Did the server stop?");
	}
}
