package P8.pair2;

import P8.Pair;

import java.time.LocalDate;
import java.util.logging.Logger;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 01/12/2021 21:28
 * @see
 * @deprecated
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays ={
                LocalDate.of(2001,1,19),
                LocalDate.of(1999,2,13),
                LocalDate.of(1995,1,22),
                LocalDate.of(1927,10,22)
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = "+mm.getFirst());
        System.out.println("max = "+mm.getSecond());
    }
}

class ArrayAlg{
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if(a==null || a.length==0)  return null;
        T min =a[0];
        T max =a[0];
        for(int i =1;i<a.length;i++){
            if(min.compareTo(a[i])>0)   min=a[i];
            if(min.compareTo(a[i])<0)   max=a[i];
        }
        return new Pair<>(min,max);
    }
}
