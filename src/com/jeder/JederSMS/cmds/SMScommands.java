package com.jeder.JederSMS.cmds;
import com.jeder.JederSMS.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class SMScommands implements CommandExecutor {

    private final Main plugin ;

    public SMScommands ( Main plugin ) {
        this.plugin = plugin ;
    }

    @Override
    public boolean onCommand ( CommandSender sender , Command cmd , String label , String[] args ) {
        //開始正文
        if ( args.length == 0 ) {
            //僅輸入 /sms
            sender.sendMessage("I don't know what do you want to do.");
            return false;
        }
        if ( args[0].toLowerCase().equals( "info" ) ) {
            return false;
        }
        return false;
    }

}
