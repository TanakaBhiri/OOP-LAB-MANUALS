# Lab 09: Records, Equality, and Enums

## Objective

The objective of this lab is to model data with records, compare objects by value, and represent a fixed set of named constants with enums.

## Selected Exercises

### 1. Basic Exercise — Student Record

Created a student record to represent data concisely using Java's record feature.

### 2. Intermediate Exercise — Book Equality

Created a `Book` class and implemented value-based equality so that books can be compared by their relevant data.

### 3. Challenge — Coin Enum

Created an enum to represent coin types and work with a fixed set of named constants.

## Files

- `Ex2_StudentRecord.java`
- `Ex3_BookEquals.java`
- `Ex5_CoinEnum.java`

## Concepts Demonstrated

- Java records
- Enums
- Value equality
- `equals()` and `hashCode()`
- Object comparison
- Fixed sets of constants

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

This lab demonstrated concise data modelling with records, correct value-based object comparison, and the use of enums to represent a controlled set of choices.
