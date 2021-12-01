package P8;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 01/12/2021 20:55
 * @see
 * @deprecated
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair(){
        first = null;
        second = null;
    }
    public Pair(T first,T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return  second;
    }

    public void setFirst(T first){
        this.first=first;
    }
    public void setSecond(T second){
        this.second=second;
    }
}
