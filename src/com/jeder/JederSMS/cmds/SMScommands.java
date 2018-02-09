package com.jeder.JederSMS.cmds;
import com.jeder.JederSMS.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import java.util.Random;

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
            //查詢插件訊息
            sender.sendMessage( "----------=插件訊息提示=----------" );
            sender.sendMessage( "" );
            sender.sendMessage( "" );
            sender.sendMessage( "" );
            sender.sendMessage( "" );
            sender.sendMessage( "" );
            sender.sendMessage( "" );
            sender.sendMessage( "" );
            sender.sendMessage( "" );
            return true;
        }

        if ( args[0].toLowerCase().equals( "send" ) ) {
            if ( args.length <= 1 ) {
                //僅輸入/sms send 或沒有輸入任何訊息
                sender.sendMessage("/sms send <玩家> <訊息>");
                return true;
            }
            else {
                //要求達到標準時
                //生成一個訊息號
                Random r = new Random() ;
                int smsCode ;
                while ( 1 == 1 ) {
                    smsCode = r.nextInt(8999999) + 1000000;
                    //判斷是否這個訊息號被佔用
                    if ( plugin.getConfig().getString( "Messages." + String.valueOf( smsCode ) ).isEmpty() ) {
                        //字串為空時
                        //沒有異常發生
                        plugin.getLogger().info( "§e嘗試使用§b§l " + String.valueOf( smsCode ) + " §e作為簡訊號是可以的 " );

                        break;
                    }
                    plugin.getLogger().info( "§e嘗試使用§b§l " + String.valueOf( smsCode ) + " §e作為簡訊號時被占用，將重新生成一個 " ); ;
                }
                //開始設定訊息
                plugin.getConfig().set( "Messages." + String.valueOf( smsCode ) + ".sender" , sender.getName() );
                plugin.getConfig().set( "Messages." + String.valueOf( smsCode ) + ".reciever" , args[1] );
                plugin.getConfig().set( "Messages." + String.valueOf( smsCode ) + ".messages" , args[2] );
                return true;
            }
        }
        return false;
    }

}
