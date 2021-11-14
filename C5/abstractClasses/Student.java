package C5.abstractClasses;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 14/11/2021 21:24
 * @see
 * @deprecated
 */
public class Student extends Person {
    private String major;

    public Student(String aName,String aMajor){
        super(aName);
        major = aMajor;
    }

    public String getDescription(){
        return "a student majoring in "+major;
    }
}
