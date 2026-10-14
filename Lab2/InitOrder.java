public class InitOrder {
    static { System.out.println("static block 1"); }
    static { System.out.println("static block 2"); }
    { System.out.println("instance block 1"); }
    { System.out.println("instance block 2"); }
    InitOrder() { System.out.println("constructor"); }
}
