import java.util.*;

public class Both implements HelloA,HelloB {
    public void hello(){HelloA.super.hello();HelloB.super.hello();System.out.println("Conflict resolved in Both");}
}
