package C5.ArrayList;

import C4.Employee;

import java.util.ArrayList;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 16/11/2021 15:11
 * @see
 * @deprecated
 */
class Tests{
    public double max(double ... values){
        double largest = Double.NEGATIVE_INFINITY;
        for(double v : values){
            if (v>largest)  largest=v;
        }
        return largest;
    }
   /* public void update(ArrayList<Employee> staff){}
    public void update2(ArrayList list){}*/
}

