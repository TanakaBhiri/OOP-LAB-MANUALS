interface Greeter {
    default void hello() { System.out.println("Hello from Greeter"); }
}

interface Welcomer {
    default void hello() { System.out.println("Hello from Welcomer"); }
}

class Receptionist implements Greeter, Welcomer {
    @Override
    public void hello() {
        Greeter.super.hello();
        Welcomer.super.hello();
        System.out.println("(and Receptionist adds its own greeting)");
    }
}

public class Ex5_DefaultConflict {
    public static void main(String[] args) {
        new Receptionist().hello();

    }
}
