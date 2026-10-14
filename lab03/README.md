# Lab 03: Encapsulation and Validation

## Objective

The objective of this lab is to protect object state by controlling access to fields, validating data, and exposing safe methods for changing or reading values.

## Selected Exercises

### 1. Basic Exercise — Student Validation

Created a student-validation exercise that checks input values before accepting them.

### 2. Intermediate Exercise — Bank History

Created a bank-account exercise that records deposits and withdrawals, exposes transaction history safely, and prevents callers from modifying the stored history.

### 3. Challenge — Kelvin Temperature

Created a Kelvin temperature class that validates temperature values and prevents invalid states.

## Files

- `Ex1_StudentValidation.java`
- `Ex3_BankHistory.java`
- `Ex5_KelvinTemperature.java`

## Concepts Demonstrated

- Encapsulation
- Access modifiers
- Getters and controlled updates
- Input validation
- Defensive copying or read-only collections
- Exception handling for invalid values
- Maintaining valid object state

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

This lab showed how encapsulation and validation help keep objects in a valid state and prevent outside code from making unsafe changes to internal data.
