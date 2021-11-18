package C5.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 18/11/2021 21:30
 * @see
 * @deprecated  用于拓展已经填满的数组，可以用于拓展任意类型的数组；
 */

public class CopyOfTest {
    public static void main(String[] args) {
        int[]a ={1,2,3,4,5};
        a =(int[])goodCopyOf(a,a.length*2);
        System.out.println(Arrays.toString(a));

        String[] b ={"Amy","Jack","Lily"};
        b =(String[])goodCopyOf(b,7);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception");
        b =(String[]) badCopyOf(b,10);
    }


    public static Object badCopyOf(Object[] a, int newLength){
        Object newArray =new  Object[newLength];
        //复制两数组;
        System.arraycopy(a,0,newArray,0,Math.min(a.length,newLength));
        return newArray;
    }
    //参数声明和返回类型都是Object，而不是Object[];int[]可以被转换为Object,而不能Object[];
    public static Object goodCopyOf(Object a ,int newLength){
        Class cl = a.getClass();
        if(!cl.isArray())   return null;

        //获取成员类型
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        //返回一个给定类型的新数组
        Object newArray = Array.newInstance(componentType,newLength);
        System.arraycopy(a,0,newArray,0,length);
        return newArray;
    }
}
