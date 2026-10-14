# Lab 5 — Polymorphism

## Exercises covered
1. `Printer.print` is overloaded for `int`, `double`, `String`, and `int[]`.
2. `Cat`, `Cow`, and `Duck` override `sound()` and are processed through `Animal[]`.
3. `Intern` overrides `pay()`; the payroll loop is unchanged and sums runtime behaviour.
4. A superclass reference to a `Cat` calls the overridden method (`Meow`), but accesses the superclass field (`Animal`) because fields are not dynamically dispatched.
5. Demonstrates `instanceof` pattern matching and the polymorphic alternative: call `process()` on the `Payment` superclass reference, allowing each subclass to implement its own behaviour. Polymorphism reduces branching as new payment types are added.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab5Demo
```
