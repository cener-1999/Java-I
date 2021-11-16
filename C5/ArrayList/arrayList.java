package C5.ArrayList;

import C4.Employee;

import java.util.ArrayList;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 16/11/2021 14:15
 * @see
 * @deprecated
 */
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Bob", 75000, 1998, 1, 4));
        staff.add(new Employee("John", 8000, 1984, 12, 4));
        staff.add(new Employee("Lily", 74000, 1977, 5, 2));

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDay = " + e.getHireDay());
        }
        Tests t = new Tests();
        System.out.println(t.max(10, 20, 45, 100));
    }
}


