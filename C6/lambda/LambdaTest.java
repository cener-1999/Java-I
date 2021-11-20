package C6.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 20/11/2021 19:40
 * @see
 * @deprecated
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planes = new String[]{"Mercury","Venus","Earth","Mars","LiBai","WangAnShi","ZhuZiQing"};

        System.out.println(Arrays.toString(planes));
        System.out.println("Sorted in dictionary order");

        Arrays.sort(planes);
        System.out.println(Arrays.toString(planes));

        System.out.println("Sorted in length");
        Arrays.sort(planes,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planes));

        Timer t = new Timer(1000,event->
                System.out.println("The time is "+ new Date()));
        t.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}
