package mc.dwms.tk.wolftestplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class WolfTestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("插件啟動成功!!");
        getCommand("web").setExecutor(new WebCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("插件關閉成功!!");
    }
}
