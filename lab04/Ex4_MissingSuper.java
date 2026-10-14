/**
 * Lab 4, Exercise 4 (Intermediate): why "class Dog extends Animal" fails to compile when Animal
 * only has Animal(String name).
 */
class Animal {
    protected String name;

    // Because we wrote this constructor, Java does NOT supply a default no-argument constructor.
    Animal(String name) {
        this.name = name;
    }
}

/*
 * BROKEN VERSION (uncomment to see the compile error):
 *
 *     class Dog extends Animal { }
 *
 * Dog has no constructor, so the compiler gives it a default one, and that default constructor
 * starts with an implicit call super(). But Animal has no Animal() constructor, so the compiler
 * reports: "constructor Animal in class Animal cannot be applied to given types".
 */

// FIXED VERSION: call the existing superclass constructor explicitly
class Dog extends Animal {
    Dog(String name) {
        super(name);       // EXPLAIN: must be the first statement
    }

    void speak() { System.out.println(name + " says Woof"); }
}

public class Ex4_MissingSuper {
    public static void main(String[] args) {
        new Dog("Rex").speak();
    }
}
