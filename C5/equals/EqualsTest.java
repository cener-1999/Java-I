package C5.equals;

import C5.Manager;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 15/11/2021 16:14
 * @see
 * @deprecated
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice",75000,1987,12,5);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice",75000,1987,12,5);
        Employee bob = new Employee("Bob Brandson",5000,1989,10,1);

        System.out.println("alice1==alice2: "+(alice1==alice2));
        System.out.println("alice1==alice3: "+(alice1==alice3));
        System.out.println("alice1.equals(alice3): "+alice1.equals(alice3));
        System.out.println("alice1.equals(bob): "+alice1.equals(bob));
        System.out.println("bob,toString(): "+bob);

        Manager carl = new Manager("Carl Cracker",80000,1987,12,15);
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);
        System.out.println("boss.toString(): "+boss);
        System.out.println("boss.equals(carl): "+boss.equals(carl));
        System.out.println("alice1.hashCode(): "+alice1.hashCode());
        System.out.println("alice3.hashCode(): "+alice3.hashCode());
        System.out.println("bob.hashCode(): "+bob.hashCode());

        System.out.println("carl.hashCode(): "+carl.hashCode());




    }
}
