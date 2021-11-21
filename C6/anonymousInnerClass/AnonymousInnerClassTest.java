package C6.anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;


/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 21/11/2021 20:07
 * @see
 * @deprecated
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000,true);

        JOptionPane.showMessageDialog(null,"Quit program?");
    }
}

class TalkingClock{
    public void start(int interval,boolean beep){
        //匿名类,这里可以用lambda表达式代替
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone,the time is "+ Instant.ofEpochMilli(e.getWhen()));
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer timer= new Timer(interval,listener);
        timer.start();
    }
}
