import java.util.*;

public class Person {
    protected final String name; protected final int age;
    Person(String name,int age){this.name=name;this.age=age;}
    void display(){System.out.println(name+", age "+age);}
}
