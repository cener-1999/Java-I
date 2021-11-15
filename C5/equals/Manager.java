package C5.equals;

import java.util.Objects;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 15/11/2021 16:14
 * @see
 * @deprecated
 */
public class Manager extends Employee{

    private double bonus;

    public Manager(String aName,double aSalary,int year ,int month,int day){
        super(aName,aSalary,year,month,day);
        bonus=0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject){
        if(!super.equals(otherObject))  return false;
        Manager other = (Manager)otherObject;
        return this.bonus==other.bonus;
    }

    public int hashCode(){
        return super.hashCode()+17*new Double(bonus).hashCode();
    }

    public String toString(){
        return super.toString()+"bonus = "+bonus+ "]";
    }
}
