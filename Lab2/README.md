# Lab 2 — Constructors, `this`, and static members

## Exercises covered
1. `Circle(double)` and no-argument `Circle()` defaulting to radius `1.0`.
2. Static counter and static getter `getCount()`.
3. `Employee` uses an auto-incrementing ID, three overloaded constructors, and a copy constructor.
4. Two static blocks and two instance blocks show execution order: static blocks run once when the nested class is initialized; instance blocks run for each object before its constructor body.
5. `Temperature` has a private constructor and named factories `fromCelsius` and `fromFahrenheit`. Names make the input unit explicit; constructors cannot be overloaded solely by parameter meaning when signatures are identical.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab2Demo
```
