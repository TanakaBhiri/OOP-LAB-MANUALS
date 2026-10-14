# Lab 02: Constructors and Static Members

## Objective

The objective of this lab is to understand object initialization, constructor overloading and chaining, and how static members are shared across objects.

## Selected Exercises

### 1. Basic Exercise — Circle

Created a `Circle` class to represent a circle and calculate properties from its radius.

### 2. Intermediate Exercise — Circle Counter

Created a program that uses a static counter to track circle objects.

### 3. Intermediate Exercise — Employee Counter

Created an `Employee` class with overloaded constructors, constructor chaining, a copy constructor, and an automatically assigned employee ID using a static counter.

### 4. Challenge — Temperature Factory

Created a temperature factory exercise to practise controlled object creation and temperature conversion.

## Files

- `Circle.java`
- `Ex2_CircleCounter.java`
- `Ex3_EmployeeCounter.java`
- `Ex5_TemperatureFactory.java`

## Concepts Demonstrated

- Constructors
- Constructor overloading
- Constructor chaining with `this()`
- Copy constructors
- Static fields and counters
- Instance initializer blocks
- Factory-style object creation

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

This lab demonstrated how constructors initialize objects, how constructor chaining reduces repeated initialization code, and how static members can maintain data shared by all instances.
