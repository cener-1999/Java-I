package P7.Exception;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 21/11/2021 20:39
 * @see
 * @deprecated 当涉及到资源的关闭时，最好使用try-with-Resources
 */
public class tryWithResources {
    public static void main(String[] args) {

    }
    public static void printAll(String[] lines, PrintWriter out){
        try(Scanner in = new Scanner(new FileInputStream("hello.txt"), String.valueOf(StandardCharsets.UTF_8)))
        {
            while(in.hasNext())
                System.out.println(in.next());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
