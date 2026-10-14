import java.util.*;

public final class ImmutablePerson {
    private final String name; private final int age;
    ImmutablePerson(String name,int age) { this.name=Objects.requireNonNull(name); if(age<0)throw new IllegalArgumentException("age"); this.age=age; }
    String getName(){return name;} int getAge(){return age;}
    public String toString(){return name+" ("+age+")";}
}
