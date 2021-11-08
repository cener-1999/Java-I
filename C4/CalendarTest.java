package C4;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 一个我上我也行，但是写得没这个漂亮的日历
 */
public class CalendarTest {
    public static void main(String[] args) {

        LocalDate date =LocalDate.now();

        //得到今天几月几号
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        //本月最早的一天
        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i<value;i++){
            System.out.print("    ");
        }

        while (date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth()==today){
                System.out.print("*");
            }else
                System.out.print(" ");
            /**
             * 这里改了很久，最后得出plusDays是访问器方法而不是更改器方法；
             */
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1)
                System.out.println();
        }

        if(date.getDayOfWeek().getValue()!=1)
            System.out.println();
    }
}
