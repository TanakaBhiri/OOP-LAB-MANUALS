# Lab 1 — Classes and Objects

## Objectives
Create classes and objects, call methods, work with references, and avoid null-reference errors.

## Exercises covered
1. `Car` with `brand`, `year`, `mileage`, and `display()`, with three cars.
2. `isAntique()` returns true when the car is more than 25 years old (uses the current year).
3. Five rectangles; print the rectangle with the largest area.
4. Demonstrates that `Rectangle r2 = r1;` copies the reference, not the object. Changing `r2.width` changes the object seen through `r1`.
5. `Person` has an `Address`; chained access prints the city. A null address causes `NullPointerException`; a null check avoids it.

## Run
```bash
javac Exercises.java
java Exercises
```

## Key concepts
Class vs object, instance fields, methods, `new`, reference aliasing, `null`, composition, chained `.` access.
