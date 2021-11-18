package C5.objectAnalyzer;

import javax.accessibility.AccessibleSelection;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 18/11/2021 16:34
 * @see
 * @deprecated  编写一个可供任意类使用的toString方法；
 */
public class objectAnalyzer {

    //记录已经访问过的对象，避免无限递归
    private ArrayList<Object> visited = new ArrayList<>();

    public String toString(Object obj){
        if(obj == null) return "null";
        if(visited.contains(obj))   return "...";
        visited.add(obj);

        Class cl =obj.getClass();
        if(cl==String.class)    return (String)obj;
        if(cl.isArray()){
            //TODO:ArrayList 中 int 为什么会进入数组？
            System.out.println("why there is array??");
            String r = cl.getComponentType()+"[]{";
            for(int i = 0;i<Array.getLength(obj);i++){
                if(i>0) r+=",";
                //java.lang.reflect.Array.get(Object array，int index)
                //方法返回指定数组对象中的索引组件的值。 如果该对象具有原始类型，则该值将自动包装在对象中。
                Object val = Array.get(obj,i);
                if(cl.getComponentType().isPrimitive()) r+=val;
                else r +=toString(val);
            }
            System.out.println(r+"}");
            return r+"}";
        }

        String r = cl.getName();
        //System.out.println("will be first print?");
        do{
            r+="[";
            Field[] fields = cl.getDeclaredFields();
            //全部设置为true
            AccessibleObject.setAccessible(fields,true);
            for(Field f:fields){
                if(!Modifier.isStatic(f.getModifiers())){
                    System.out.println(f);
                    if(!r.endsWith("["))    r+=",";
                    r+=f.getName()+"=";
                    try{
                        //TODO:这里用getClass可以吗？
                        Class t = f.getType();
                        Object val =f.get(obj);
                        //System.out.println("The val is : "+val+" ,and type is "+val.getClass());
                        if(t.isPrimitive()) r+=val;
                        else r+=toString(val);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
               }
            }
            r+="]";
            cl=cl.getSuperclass();
        }
        while (cl!=null);
        return r;
    }
}
