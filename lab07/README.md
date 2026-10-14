# Lab 07: Exception Handling

## Objective

The objective of this lab is to handle errors safely, raise meaningful exceptions for invalid input, and understand how `try`, `catch`, and `finally` affect program execution.

## Selected Exercises

### 1. Basic Exercise — Safe Divide

Created a division program that handles invalid division operations safely.

### 2. Intermediate Exercise — Invalid Age

Created and used an invalid-age exception to reject age values that do not meet the program's rules.

### 3. Challenge — Finally Return

Examined how a `return` statement in a `finally` block can affect a return value and why this behavior should be avoided.

## Files

- `Ex1_SafeDivide.java`
- `Ex3_InvalidAge.java`
- `Ex5_FinallyReturn.java`

## Concepts Demonstrated

- `try` and `catch`
- `finally` execution
- Throwing exceptions
- Custom exceptions
- Input validation
- Exception flow and return values

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

This lab showed how exception handling helps programs respond to invalid operations and highlighted why `finally` blocks should be used carefully.
