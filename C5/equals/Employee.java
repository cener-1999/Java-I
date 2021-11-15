package C5.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 15/11/2021 16:14
 * @see
 * @deprecated
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String aName,double aSalary,int year,int mouth,int day){
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(year,mouth,day);
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary +=raise;
    }

    public double getSalary() {
        return salary;
    }


    public LocalDate getHireDay() {
        return hireDay;
    }

    public  boolean equals(Object otherObject){
        if(this==otherObject){
            return true;
        }
        if(otherObject==null){
            return false;
        }
        if(this.getClass()!=otherObject.getClass()){
            return false;
        }
        Employee other = (Employee) otherObject;
        return Objects.equals(name,other.name)&&salary==other.salary&&Objects.equals(hireDay,other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }
    public String toString(){
        return getClass().getName()+"[name = "+name+" salary = "+salary+" hireDay = "+hireDay+" ]";
    }
}
