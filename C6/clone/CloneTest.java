package C6.clone;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 19/11/2021 21:46
 * @see
 * @deprecated
 */
public class CloneTest  {
    public static void main(String[] args){
        try{
            Employee original = new Employee("Ame",9992);
            original.setHireDay(1997,12,3);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(1898,3,12);
            System.out.println("original="+original);
            System.out.println("copy="+copy);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
