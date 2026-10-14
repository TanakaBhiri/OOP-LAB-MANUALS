# Lab 8 — Generics and Collections

## Exercises covered
1. Ten integers stored in `ArrayList`; calculate sum and maximum and print reversed order.
2. `LinkedHashSet` removes duplicate names while retaining insertion order.
3. Generic `Stack<T>` backed by `ArrayList<T>` provides push, pop, peek and isEmpty.
4. `Map<String,Integer>` counts words; entries are sorted by frequency descending, then word alphabetically.
5. Generic `bubbleSort(T[])` uses `Comparable<T>` and is tested with `Integer[]` and `String[]`. `int[]` cannot be passed because Java generics use reference types, not primitives.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab8Demo
```
