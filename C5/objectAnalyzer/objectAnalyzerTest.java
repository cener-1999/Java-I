package C5.objectAnalyzer;

import java.util.ArrayList;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 18/11/2021 16:33
 * @see
 * @deprecated
 */
public class objectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i = 1;i<=5;i++){
            squares.add(i*i);
        }
        System.out.println(new objectAnalyzer().toString(squares));
//        int[] test = new int[5];
//        for(int t :test)    t+=1;
//        System.out.println(new objectAnalyzer().toString(test));
    }
}
