package P8.pair1;

import P8.Pair;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 01/12/2021 20:52
 * @see
 * @deprecated
 */
public class PairTest1 {
    public static void main(String[] args){
        String[] words = {"Mary","had","a","little","lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = "+mm.getFirst());
        System.out.println("max = "+mm.getSecond());
    }
}

class ArrayAlg{
    public static Pair<String> minmax(String[] a){
        if(a==null||a.length ==0)   return null;
        String min = a[0];
        String max = a[1];
        for(int i =0;i<a.length;i++){
            if(min.compareTo(a[i])>0)   min=a[i];
            if(max.compareTo(a[i])<0)   max = a[i];
        }
        return new Pair<String>(min,max);
    }
}
