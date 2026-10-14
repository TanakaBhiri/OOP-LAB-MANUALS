# Lab 06: Abstract Classes and Interfaces

## Objective

The objective of this lab is to use abstract classes to define shared structure and interfaces to define behavior contracts, including handling conflicting default methods.

## Selected Exercises

### 1. Basic Exercise — Abstract Shape

Created an abstract shape type with concrete shape implementations that provide their own calculations.

### 2. Intermediate Exercise — Abstract Account

Created an abstract account model to share common account behavior while leaving specific behavior to subclasses.

### 3. Challenge — Default Method Conflict

Explored a class implementing interfaces that provide conflicting default methods and resolved the conflict explicitly.

## Files

- `Ex1_AbstractShape.java`
- `Ex3_AbstractAccount.java`
- `Ex5_DefaultConflict.java`

## Concepts Demonstrated

- Abstract classes
- Abstract methods
- Interfaces
- Implementation contracts
- Code reuse through a base class
- Default interface methods
- Resolving default method conflicts

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

This lab demonstrated how abstraction separates what an object must do from how it does it, and how Java handles shared contracts and conflicting default methods.
