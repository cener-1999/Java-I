package C5.abstractClasses;

import java.time.LocalDate;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 14/11/2021 21:18
 * @see
 * @deprecated
 */
public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String aName,double aSalary,int year,int mouth,int day){
        super(aName);
        salary = aSalary;
        hireDay = LocalDate.of(year,mouth,day);
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f",salary);
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

}
