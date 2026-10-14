import java.util.*;
import java.util.regex.*;

public class Stack<T> {
    private final ArrayList<T> items=new ArrayList<>();
    void push(T value){items.add(value);}
    T pop(){if(items.isEmpty())throw new EmptyStackException();return items.remove(items.size()-1);}
    T peek(){if(items.isEmpty())throw new EmptyStackException();return items.get(items.size()-1);}
    boolean isEmpty(){return items.isEmpty();}
}
