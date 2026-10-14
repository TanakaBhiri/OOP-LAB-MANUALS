# Lab 04: Inheritance and Composition

## Objective

The objective of this lab is to practise inheritance, superclass constructor behavior, and composition, and to decide when an object relationship should use inheritance or containment.

## Selected Exercises

### 1. Basic Exercise — Teacher and Person

Created a teacher/person example to demonstrate sharing common person information through inheritance.

### 2. Intermediate Exercise — Missing `super()`

Examined what happens when a subclass constructor does not explicitly call a required superclass constructor.

### 3. Challenge — Stack Composition

Compared a stack implemented by extending `ArrayList` with a stack that contains a list. The composition version exposes only stack operations such as `push`, `pop`, and `peek`.

## Files

- `Ex2_TeacherSharesPerson.java`
- `Ex4_MissingSuper.java`
- `Ex5_StackComposition.java`

## Concepts Demonstrated

- Inheritance with `extends`
- Superclass constructors and `super()`
- The `is-a` relationship
- Composition and the `has-a` relationship
- Encapsulation of contained objects
- Choosing composition over inheritance

## Requirements

- JDK 17 or later is recommended.
- A terminal or Java IDE such as IntelliJ IDEA, Eclipse, or VS Code.

## How to Compile and Run

Open a terminal in this lab folder. Compile the source file for the exercise you want to run, then run the class containing `main`:

```bash
javac Ex1_Example.java
java Ex1_Example
```

Replace the example filename and class name with the actual ones for the exercise. Some exercises define helper classes in the same source file. Run exercises separately, since different exercises may use classes with the same name.

## Conclusion

This lab demonstrated how inheritance can share behavior between related classes and why composition is often safer when a class should expose only a limited set of operations.
