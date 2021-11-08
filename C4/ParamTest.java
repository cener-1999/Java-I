package C4;

public class ParamTest {
    public static void main(String[] args) {
        /**
         * Test 1 :Methods can`t modify numeric parameters.
         */
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Before: percent is " + percent);
        tripleVaule(percent);
        System.out.println("After: percent is " + percent + "\n");


        /**
         * Test 2 :Methods can change the state of object parameters.
         */
        System.out.println("Testing tripleSalary");
        Employee harry = new Employee("Haryy",5000,1988,12,12);
        System.out.println("Before: salary = "+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = "+harry.getSalary()+"\n");

        /**
         * Test 3 :Methods can`t attach new object parameters
         */
        System.out.println("Testing swap");
        Employee a = new Employee("Amy",70000,1988,12,12);
        Employee b = new Employee("Bob",60000,1988,12,12);
        System.out.println("Before: A ="+a.getName());
        System.out.println("Before: B ="+b.getName());
        swap(a,b);
        System.out.println("After: A ="+a.getName());
        System.out.println("After: B ="+b.getName());
    }

    public static void tripleVaule(double x){
        x=3*x;
        System.out.println("End of method: x= "+x);
    }
    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("End of method: salary= "+x.getSalary());
    }

    public static void swap(Employee x,Employee y){
        Employee temp =x;
        x=y;
        y=temp;
        System.out.println("End of method:x= "+x.getName());
        System.out.println("End of method:y= "+y.getName());
    }
}