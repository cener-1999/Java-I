package C6.innerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;

import javax.swing.*;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 21/11/2021 19:44
 * @see
 * @deprecated
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
class TalkingClock {
    private int interval;
    private boolean beep;

    public  TalkingClock(int interval,boolean beep){
        this.interval = interval;
        this.beep = beep;
    }
    public void start(){
        TimePrinter listener = new TimePrinter();
        Timer timer = new Timer(interval,listener);
        timer.start();
    }

    public  class TimePrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone,the time is "+ Instant.ofEpochMilli(event.getWhen()));
            //隐式引用
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}