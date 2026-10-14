# Lab 6 — Abstraction and Interfaces

## Exercises covered
1. Abstract `Shape` defines `area()` and `perimeter()`; Circle, Rectangle and Square implement both.
2. `Bird` and `Aeroplane` implement the same `Flyable` capability without requiring a shared superclass.
3. Abstract `Account` provides concrete `deposit()` and abstract `monthlyFee()`; SavingsAccount and CurrentAccount implement the fee.
4. `Student` implements `Comparable<Student>` for name ordering; a `Comparator` sorts by marks descending.
5. `Both` implements two interfaces with conflicting default `hello()` methods and resolves the conflict with `HelloA.super.hello()` and `HelloB.super.hello()`.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab6Demo
```
