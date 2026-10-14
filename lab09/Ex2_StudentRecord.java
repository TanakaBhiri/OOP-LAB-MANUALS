/** Lab 9, Exercise 2 (Basic): record Student(String name, int age): print, compare two equal records, read a component. */
// EXPLAIN: a record gets a constructor, accessors, equals, hashCode and toString automatically
record Student(String name, int age) { }

public class Ex2_StudentRecord {
    public static void main(String[] args) {
        Student a = new Student("Ada", 20);
        Student b = new Student("Ada", 20);

        System.out.println(a);                       // generated toString: Student[name=Ada, age=20]
        System.out.println("a.equals(b)? " + a.equals(b));    // true: equal by VALUE
        System.out.println("a == b?      " + (a == b));       // false: still two different objects
        System.out.println("name component: " + a.name());    // accessor is name(), not getName()
    }
}
