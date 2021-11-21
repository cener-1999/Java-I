package C6.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 21/11/2021 20:00
 * @see
 * @deprecated  声明局部类不能有访问说明符（public,protect）。局部类的作用域被限定在声明这个局部类的块中
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        TalkingClocks clock = new TalkingClocks(1000);
        clock.start(1000,true);

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
class TalkingClocks {
    private int interval;

    public  TalkingClocks(int interval){
        this.interval=interval;
    }
    public void start(int interval,boolean beep){
        class TimePrinter implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone,the time is "+ Instant.ofEpochMilli(event.getWhen()));
                //隐式引用
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        }
        TimePrinter listener = new TimePrinter();
        Timer timer = new Timer(interval,listener);
        timer.start();
    }


}
