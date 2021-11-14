package C5.abstractClasses;

import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 14/11/2021 21:16
 * @see
 * @deprecated
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String aName){
        name = aName;
    }

    public String getName(){
        return name;
    }
}
