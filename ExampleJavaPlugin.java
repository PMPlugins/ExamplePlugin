import redstonelamp.plugin.PluginBase;

public class ExampleJavaPlugin extends PluginBase {
	public void onEnable() {
		this.getLogger().info(this.getName() + " has been enabled!");
	}
	
	public void onDisable() {
		this.getLogger().warning("ExampleJavaPlugin is no longer enabled! Did the server stop?");
	}
}
