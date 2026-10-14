/**
 * Lab 6, Exercise 5 (Challenge): two interfaces both declare default void hello(). Resolve the
 * conflict with InterfaceName.super.hello().
 */
interface Greeter {
    default void hello() { System.out.println("Hello from Greeter"); }
}

interface Welcomer {
    default void hello() { System.out.println("Hello from Welcomer"); }
}

// Without the override below, this class would NOT compile: the compiler cannot guess which hello() to inherit.
class Receptionist implements Greeter, Welcomer {
    @Override
    public void hello() {
        Greeter.super.hello();        // explicitly choose Greeter's version
        Welcomer.super.hello();       // and, if we want, Welcomer's version too
        System.out.println("(and Receptionist adds its own greeting)");
    }
}

public class Ex5_DefaultConflict {
    public static void main(String[] args) {
        new Receptionist().hello();

        /*
         * THE RULE: if a class inherits two default methods with the same signature from different
         * interfaces, it must override the method itself. Inside the override, InterfaceName.super.method()
         * chooses which interface's version to call.
         */
    }
}
