package C3;

import java.io.Console;
import java.util.Date;
import java.util.Scanner;

class Input {
    static double x = 10.0/3;
    public static void main(String[] args) {
        Input.DateOutput();
    }
    /**
     * 读取输入:新建Scanner并和System连接；
     */
    public static void Scanner(){
        Scanner in = new Scanner(System.in);

        System.out.println("What`s your name?");
        String name = in.nextLine();
        System.out.println("How`s your age?");
        int age = in.nextInt();
    }
    /**
     * Console ：实现可以不可见的密码输入
     * **这个类是从控制台获取账号密码的，所以打开dos命令窗，编译并执行相应代码。
     */
    public static void Console(){
        Console con =System.console();
        String username = con.readLine("Uername: ");
        char[] pswd = con.readPassword("password:");
    }

    public static void Output(){
        System.out.print(x+"\n");
        System.out.printf("%8.2f \n", x);
    }

    /**
     * 创建格式化字符串
     */
    public static String Format(){
        String message = String.format("创建一个格式化的字符串"+"%5.2f",x);
        return message;
    }

    /**
     * 时间输入和参数索引
     */
    public static void DateOutput(){
        System.out.printf("%tc \n",new Date());
        //%与$之间的是参数索引
        System.out.printf("%1$s %2$tB %2$te,%2$tY \n","日期是",new Date());
        //<代表和前面的数字相同
        System.out.printf("%1$s %2$tB %<te,%<tY","日期是",new Date());

    }
}
