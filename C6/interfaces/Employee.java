package C6.interfaces;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 19/11/2021 20:09
 * @see
 * @deprecated
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name,double salary){
        this.name =name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double byPercent){
        double  raise = salary*byPercent;
        salary+=raise;
    }

    public int compareTo(Employee other){
        return Double.compare(this.salary,other.salary);
    }
}
