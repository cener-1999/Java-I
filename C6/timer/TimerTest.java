package C6.timer;

import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 19/11/2021 20:57
 * @see
 * @deprecated
 */
public class TimerTest{

    public static void main(String[] args){
        ActionListener listener = new TimePrinter();

        Timer t = new Timer(10000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone,the time is "+new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
