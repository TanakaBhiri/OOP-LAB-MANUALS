class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void speak() { System.out.println(name + " says Woof"); }
}

public class Ex4_MissingSuper {
    public static void main(String[] args) {
        new Dog("Rex").speak();
    }
}
