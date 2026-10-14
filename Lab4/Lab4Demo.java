import java.util.*;
public class Lab4Demo {
    public static void main(String[] args) {
        new Student("Tariro",20,"Computer Science").display();
        new Teacher("Mr Moyo",40,"Java").display();
        System.out.println("Constructor order:"); new ElectricCar();
        Dog dog=new Dog("Spot"); System.out.println("Explicit super(name) gives "+dog.name);
        // Dog extends Animal with no Animal() constructor would fail because Java tries super().
        IntStack stack=new IntStack(); stack.push(10);stack.push(20);System.out.println("peek="+stack.peek()+", pop="+stack.pop());
        // A Stack extends ArrayList would expose arbitrary indexed insertions/removals and violate stack-only behaviour.
    }
}