package C6.lambda;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 20/11/2021 20:26
 * @see
 * @deprecated
 */
public class Example {
    public static void main(String[] args) {
        //repeat(10,()->System.out.println("Hello!"));
        repeat_(10,i->System.out.println("Countdown"+(9-i)));
    }
    public static void repeat(int n,Runnable action){
        for(int i =0;i<n;i++)   action.run();
    }
    public static void repeat_(int n,IntConsumer action){
        for(int i =0;i<n;i++)   action.accept(i);
    }
}
