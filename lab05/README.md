# Lab 05: Polymorphism and Overloading

## Objective

The objective of this lab is to understand method overloading, overriding, and polymorphism, and how a common interface can support different implementations.

## Selected Exercises

### 1. Basic Exercise — Overloaded Print

Created overloaded print methods to accept different kinds or numbers of arguments.

### 2. Intermediate Exercise — Intern Payroll

Created a payroll example using an intern and employee-related behavior to demonstrate specialized calculations and polymorphism.

### 3. Challenge — Payment Processor

Implemented a payment processor using `instanceof` pattern matching, then compared it with a polymorphic design where payment types implement a shared processing contract.

## Files

- `Ex1_OverloadPrint.java`
- `Ex3_PayrollIntern.java`
- `Ex5_PaymentProcessor.java`

## Concepts Demonstrated

- Method overloading
- Method overriding
- Inheritance
- Runtime polymorphism
- Pattern matching with `instanceof`
- Interfaces
- Programming to a common contract

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

This lab illustrated the difference between overloading and overriding and showed how polymorphism lets code work with different object types through a common contract.
