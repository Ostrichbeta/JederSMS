package com.jeder.JederSMS;
import org.bukkit.plugin.java.JavaPlugin;
import com.jeder.JederSMS.cmds.*;

public class Main extends JavaPlugin {

    @Override
    public void onEnable () {
        getLogger().info( "Jeder簡訊載入中" ) ;
        //設定導出
        getCommand( "jederSMS" ).setExecutor( new SMScommands( this ) );
    }

}
