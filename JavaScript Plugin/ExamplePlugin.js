/*
 * A JavaScript plugin is used to call API for plugins that allow it
 */

function onEnable() {
	PluginBase.getLogger().info("ExamplePlugin has been enabled!");
}

function onDisable() {
	PluginBase.getLogger().warning("ExamplePlugin is no longer enabled! Did the server stop?");
}