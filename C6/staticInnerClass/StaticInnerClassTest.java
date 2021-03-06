package C6.staticInnerClass;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 21/11/2021 20:14
 * @see
 * @deprecated  静态内部类不会生成对外部的应用
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] values = new double[20];
        for(int i = 0;i<values.length;i++)
            values[i]=100*Math.random();
        ArrayAlg.Pair p = ArrayAlg.Pair.minmax(values);
        System.out.println("min = "+p.getFirst());
        System.out.println("max = "+p.getSecond());
    }
}

class  ArrayAlg{
    public static class Pair{
        private double first;
        private double second;

        public Pair(double f ,double s){
            first = f;
            second = s;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }

        public static Pair minmax(double[] values){
            double min = Double.POSITIVE_INFINITY;
            double max = Double.NEGATIVE_INFINITY;

            for(double v : values){
                if(min>v)   min = v;
                if(max<v)   max = v;
            }
            return new Pair(min,max);
        }
    }
}