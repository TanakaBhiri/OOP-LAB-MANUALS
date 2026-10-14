import java.util.ArrayList;

/**
 * Lab 4, Exercise 5 (Challenge): refactor "Stack extends ArrayList" into a Stack that CONTAINS an ArrayList.
 */

// BAD DESIGN: inheritance. A BadStack "is-a" ArrayList, so it inherits every ArrayList method.
class BadStack<T> extends ArrayList<T> {
    void push(T x) { add(x); }
    T pop()        { return remove(size() - 1); }
}

// GOOD DESIGN: composition. A GoodStack "has-a" list and exposes ONLY stack operations.
class GoodStack<T> {
    private final ArrayList<T> items = new ArrayList<>();    // hidden inside

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
        // The inheritance version WRONGLY exposes list methods, so we can break last-in-first-out:
        bad.add(0, "sneaked in at the bottom");
        bad.remove(1);                               // removes from the middle!
        System.out.println("BadStack broken by outside code: " + bad);

        GoodStack<String> good = new GoodStack<>();
        good.push("first");
        good.push("second");
        good.push("third");
        // good.add(0, "x");  // COMPILE ERROR: GoodStack has no add(); only push/pop/peek exist
        System.out.println("GoodStack pop: " + good.pop() + ", then peek: " + good.peek());

        /*
         * WHAT THE INHERITANCE VERSION WRONGLY EXPOSES: add(index, x), remove(index), get(i),
         * clear(), sort() and many more. A stack must only be changed at the top. Also, a stack
         * is not truly an "is-a" ArrayList, so inheritance is the wrong relationship here.
         */
    }
}
