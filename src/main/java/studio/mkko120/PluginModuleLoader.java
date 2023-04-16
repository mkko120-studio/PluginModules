package studio.mkko120;

import lombok.Data;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

@Data
public class PluginModuleLoader {

    private final File dataFolder;

    public PluginModuleLoader(JavaPlugin plugin) {
        this.dataFolder = plugin.getDataFolder();
    }

}
