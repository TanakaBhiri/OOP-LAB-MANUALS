# Lab 4 — Inheritance

## Exercises covered
1. `Student extends Person`, adds course, and reuses inherited `display()`.
2. `Teacher extends Person` shares the common name/age state and display behaviour.
3. `Vehicle → Car → ElectricCar` prints constructor order from superclass to subclass.
4. If `Animal` only has `Animal(String name)`, `Dog extends Animal` must call `super(name)`; implicit `super()` fails to compile because no no-argument constructor exists.
5. `IntStack` uses composition with a private `ArrayList`. This exposes only stack operations, unlike `Stack extends ArrayList`, which would also expose indexed insertion and removal and could violate LIFO behaviour.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab4Demo
```
