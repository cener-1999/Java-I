package C6;

import java.util.Comparator;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 19/11/2021 21:14
 * @see
 * @deprecated
 */
public class StringSortByLen {
    public static void main(String[] args) {
        Comparator<String> comp = new LengthComparator();
        System.out.println(comp.compare("abxccc","sdhjaoiwd"));
    }
}

class LengthComparator implements Comparator<String>{
    public int compare(String a,String b) {
        return a.length()-b.length();
    }
}
