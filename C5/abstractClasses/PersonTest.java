package C5.abstractClasses;

import javax.rmi.CORBA.Stub;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 14/11/2021 21:15
 * @see
 * @deprecated
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0]=new Employee("Judie Comer",5000,1993,10,1);
        people[1]=new Student("Cen","Software Engining");

        for(Person p : people){
            System.out.println(p.getName()+","+p.getDescription());
        }
    }
}
