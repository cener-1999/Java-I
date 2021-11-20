package C6.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 20/11/2021 19:00
 * @see
 * @deprecated
 */
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name,double salary){
        this.name = name;
        this.salary =salary;
        hireDay = new Date();
    }

    public Employee clone()throws CloneNotSupportedException{
        //call Object.clone 因为这些是基本类型，不用特殊处理
        Employee cloned = (Employee)super.clone();
        //clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year,int month,int day) {
        Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary*byPercent;
        this.salary+=raise;
    }
    public String toString(){
        return "Employee[name=]"+name+",salary = "+salary+",hireDay = "+hireDay+" ]";
    }
}
