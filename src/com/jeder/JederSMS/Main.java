package com.jeder.JederSMS;
import com.jeder.JederSMS.listeners.OnJoinListener;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import com.jeder.JederSMS.cmds.*;


public class Main extends JavaPlugin {

    FileConfiguration fc = getConfig() ;

    @Override
    public void onEnable () {
        getLogger().info( "Jeder簡訊載入中" ) ;
        //設定導出
        getCommand( "jederSMS" ).setExecutor( new SMScommands( this ) );
        //設定偵聽器
        getServer().getPluginManager().registerEvents( new OnJoinListener( this ) , this);
    }


}
