package C4;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staffs= new Employee[3];

        staffs[0]=new Employee("Judy Commer",100000,2018,10,12);
        staffs[1]=new Employee("Zhiyuan Li",500000,2017,1,15);
        staffs[2]=new Employee("Tony Tester",40000,1990,3,15);

        for(Employee staff:staffs){
            staff.raiseSalary(5);
        }

        for(Employee staff:staffs){
            staff.setId();
            System.out.println("name="+staff.getName()+",salary="+staff.getSalary()+",id="+ staff.getId()+",hireDays="+staff.getHireDay());
        }

        //静态方法可以用类名直接调用，不需要对象
        int n =Employee.getNextId();
        System.out.println("Next available id is "+n);

    }


}
