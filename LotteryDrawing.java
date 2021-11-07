import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 挺有意思的，可以抽象为：在一个集合中抽取元素，且已经抽到过的元素不会再次出现
 */
class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many number do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        //设置数组是为了抽到相同的数字，注意下标和数字本身
        int[] numbers = new int[n];
        for(int i =0;i<numbers.length;i++){
            numbers[i]=i+1;
        }

        int[] result= new int[k];
        for (int i = 0;i<result.length;i++){
            //得到1~n之间的随机数，Math.random()是随机0~1之间的数字,所以是在抽n;
            //注意后面要打括号，先对random后的值int 就都等于0了
            int r=(int)(Math.random()*n);
            result[i]=r;
            //为了保证每次抽到的数字不相同，把最后的数字移到抽到的地方，然后把n-1
            numbers[r]=numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Bet the following combination.it will make you rich!");
        for(int num:result){
            System.out.printf("%d ",num);
        }
    }
}
