# Lab 3 — Encapsulation and Access Modifiers

## Exercises covered
1. Student has private name/marks and validates marks in the constructor and setter.
2. `getGrade()` calculates A/B/C/F without storing a grade field. Bands used here: A ≥ 80, B ≥ 70, C ≥ 50, otherwise F.
3. Bank account keeps transaction history and returns an unmodifiable defensive copy.
4. `ImmutablePerson` is final, fields are private/final, and there are no setters. Constructor validation prevents invalid initial state.
5. Temperature stores kelvin, rejects values below zero kelvin, and exposes Celsius/Fahrenheit conversions. Callers depend on methods, not storage details.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab3Demo
```
