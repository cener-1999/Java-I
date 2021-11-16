package C5.enums;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 16/11/2021 15:17
 * @see
 * @deprecated
 */
public class EnmuTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size :(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        //把size的值设置为Size.input
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("abbreviation = "+size.getAbbreviation());
        if(size==Size.EXTRA_LARGE){
            System.out.println("Good job");
        }
    }
}

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private final String abbreviation;

    private Size(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
