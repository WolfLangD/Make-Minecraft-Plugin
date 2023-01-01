package mc.dwms.tk.wolftestplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class Boolean implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("ignite")) {

            if (args.length != 1) {
                return false;
            }

            if (!(sender instanceof Player)) {
                sender.sendMessage("[WolfTestPlugin] 不可使用控制台來使玩家著火");
                return true;
            }

            Player target = Bukkit.getServer().getPlayer(args[0]);

            if (target == null) {
                sender.sendMessage(args[0] + " 沒有在遊戲中");
                return true;
            }

            target.setFireTicks(1000);
            return true;
        }
        return false;
    }
}