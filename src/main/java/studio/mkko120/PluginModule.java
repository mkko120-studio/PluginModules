package studio.mkko120;

import lombok.Data;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

@Data
public abstract class PluginModule {

    public static String PLUGIN_NAME = "Plugin";
    public static String PLUGIN_VERSION = "v0.1-SNAPSHOT";
    public static String PLUGIN_AUTHOR = "mkko120";
    public static String PLUGIN_DESCRIPTION = "A plugin module template.";
    public static String PLUGIN_WEBSITE = "https://github.com/mkko120-studio/PluginModules";

    private ArrayList<CommandModule> commands = new ArrayList<>();

    public PluginModule(JavaPlugin plugin) {
        load(plugin);
        enable(plugin);
    }

    public abstract void enable(JavaPlugin plugin);
    public abstract void disable(JavaPlugin plugin);
    public abstract void load(JavaPlugin plugin);

}
