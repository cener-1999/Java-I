package C6.interfaces;

import java.util.Arrays;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 19/11/2021 20:08
 * @see
 * @deprecated
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staffs = new Employee[3];

        staffs[0]=new Employee("Amy",100000.2);
        staffs[1]=new Employee("Bob",2000);
        staffs[2]=new Employee("John",223);

        Arrays.sort(staffs);

        for(Employee e:staffs){
            System.out.println(e.getName());
        }
    }
}
