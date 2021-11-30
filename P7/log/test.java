package P7.log;

import java.awt.*;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 30/11/2021 17:27
 * @see
 * @deprecated
 */
public class test {
    public static void main(String[] args) {
        if(System.getProperty("java.util.logging.config.class")==null && System.getProperty(
                "java.util.logging.config.file")==null){
            try{
                Logger.getLogger("").setLevel(Level.ALL);
                final int LOG_ROTATION_COUNT=10;
                FileHandler handler = new FileHandler("%h/myapp.log",0,LOG_ROTATION_COUNT);
                Logger.getLogger("P7.log").addHandler(handler);

            }catch (IOException e){
                Logger.getLogger("P7.log").log(Level.SEVERE,"Can`t create log file handler",e);
            }
        }
    }
}
