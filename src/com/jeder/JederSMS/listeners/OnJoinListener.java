package com.jeder.JederSMS.listeners;
import com.jeder.JederSMS.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.EventListener;

public final class OnJoinListener implements Listener {
    Main plugin ;
    //註冊構造器
    public OnJoinListener ( Main plugin ) {
        this.plugin = plugin ;
        plugin.getServer().getPluginManager().registerEvents( this , plugin );
    }

    @EventHandler( priority = EventPriority.HIGH ) //設定到最高級別
    public void onJoinGame ( PlayerJoinEvent ev ) {
        //玩家進入遊戲時
        plugin.getConfig().getString( "" );
    }

}
