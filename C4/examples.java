package C4;

import java.time.LocalDate;
import java.util.Date;

public class examples {
    public static void main(String[] args){
        System.out.println(new Date());

        /** LocalDate类 **/
        System.out.println(LocalDate.now());

        LocalDate newYearEve = LocalDate.of(2021,12,31);
        LocalDate aThousandDayLater = newYearEve.plusDays(1000);

        System.out.println(aThousandDayLater);

    }
}
