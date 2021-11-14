package C4;

import java.time.LocalDate;

public class Employee{
    private static int nextId=1;

    private int id;
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day){
        name=n;
        salary= s;
        hireDay=LocalDate.of(year,month,day);
        id=0;
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public int getId(){
        return id;
    }

    public void setId(){
        id=nextId;
        nextId++;
    }

    public static int getNextId(){
        return nextId;
    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }

    //一个方法可以访问所属类的所有对象
    public boolean equal(Employee other){
        return name.equals(other.name);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Haryy",50000,1989,4,12);
        System.out.println(e.getName()+" "+e.getSalary());
    }

}