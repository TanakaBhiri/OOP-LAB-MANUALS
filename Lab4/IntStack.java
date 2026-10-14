import java.util.*;

public class IntStack {
    private final ArrayList<Integer> data=new ArrayList<>();
    void push(int x){data.add(x);}
    int pop(){if(data.isEmpty())throw new EmptyStackException();return data.remove(data.size()-1);}
    int peek(){if(data.isEmpty())throw new EmptyStackException();return data.get(data.size()-1);}
    boolean isEmpty(){return data.isEmpty();}
}
