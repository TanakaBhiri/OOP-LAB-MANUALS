# Lab 01: Classes and Objects

## Objective

The objective of this lab is to understand how to create classes and objects in Java and how objects can contain data and methods.

## Selected Exercises

### 1. Basic Exercise — Car

Created a `Car` class with brand, year, and mileage fields and a `display()` method. Three car objects are created and their details are displayed.

### 2. Intermediate Exercise — Rectangle

Created a `Rectangle` class with width and height fields, an `area()` method, and a `perimeter()` method. An array of five rectangles is created, and the rectangle with the largest area is displayed.

### 3. Challenge — Address and Person

Created `Address` and `Person` classes. A `Person` object contains an `Address` object. The exercise demonstrates accessing the city using a chained dot expression and handling a `null` address.

## Files

- `Car.java`
- `Ex1_CarDisplay.java`
- `Ex3_LargestRectangle.java`
- `Ex5_PersonAddress.java`

## Concepts Demonstrated

- Classes and objects
- Fields and methods
- Arrays of objects
- Object references
- Chained dot expressions
- Null references
- `NullPointerException` handling

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

This lab provided practical experience in creating and using Java classes and objects. It also demonstrated how objects can be related to one another through references.
