import java.util.ArrayList;

class BadStack<T> extends ArrayList<T> {
    void push(T x) { add(x); }
    T pop()        { return remove(size() - 1); }
}

class GoodStack<T> {
    private final ArrayList<T> items = new ArrayList<>();

    void push(T x)      { items.add(x); }
    T pop()             { return items.remove(items.size() - 1); }
    T peek()            { return items.get(items.size() - 1); }
    boolean isEmpty()   { return items.isEmpty(); }
}

public class Ex5_StackComposition {
    public static void main(String[] args) {
        BadStack<String> bad = new BadStack<>();
        bad.push("first");
        bad.push("second");
        bad.push("third");

        bad.add(0, "sneaked in at the bottom");
        bad.remove(1);
        System.out.println("BadStack broken by outside code: " + bad);

        GoodStack<String> good = new GoodStack<>();
        good.push("first");
        good.push("second");
        good.push("third");

        System.out.println("GoodStack pop: " + good.pop() + ", then peek: " + good.peek());

    }
}
