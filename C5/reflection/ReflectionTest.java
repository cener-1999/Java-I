package C5.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 16/11/2021 21:48
 * @see
 * @deprecated
 */
public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if(args.length>0) name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }

        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print("class " + name);

            if(supercl !=null &&supercl!=Object.class)  System.out.print(" extends "+supercl.getName());

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethod(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void printConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();

        for(Constructor c : constructors){
            String name = c.getName();
            System.out.print("  ");
            String modifiers =Modifier.toString(c.getModifiers());
            if(modifiers.length()>0)    System.out.print(modifiers+" ");
            System.out.print(name + "(");

            Class[] paramType=c.getParameterTypes();
            for(int j = 0;j<paramType.length;j++){
                if(j>0)System.out.print(", ");
                System.out.print(paramType[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethod(Class cl){
        Method[] methods = cl.getMethods();
        for(Method m :methods){
            Class reType = m.getReturnType();
            String name = reType.getName();

            System.out.print("  ");

            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0)    System.out.print(modifiers+" ");
            System.out.print(reType.getName() +name+ "(");

            Class[] paramType = m.getParameterTypes();
            for(int j = 0;j< paramType.length;j++){
                if(j>0) System.out.print(", ");
                System.out.print(paramType[j].getName());
            }
            System.out.println(");");
        }
    }
    public static void printFields(Class cl){
        Field[] fields =cl.getDeclaredFields();

        for(Field f :fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0)    System.out.print(modifiers+" ");
            System.out.println(type.getName()+" "+name+";");
        }
    }
}
