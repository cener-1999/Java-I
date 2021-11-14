package C5;

import C4.Employee;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 09/11/2021 16:47
 * @see
 * @deprecated
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String n, double s, int year, int month, int day){
        super(n,s,year,month,day);
        bonus=0;
    }

    public double getSalary(){
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public static void main(String[] args) {
        Manager boss = new Manager("Jodie Comer",80000,1993,12,19);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0]=boss;
        staff[1]=new Employee("Brity Spears",5000,1985,12,4);
        staff[2]=new Employee("Amy Chen",4000,1997,1,14);

        for(Employee e :staff){
            System.out.println("name = "+ e.getSalary()+",salary = "+e.getSalary());
        }
    }
}
