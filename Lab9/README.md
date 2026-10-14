# Lab 9 — Nested Types, Enums, Records and Object Contract

## Exercises covered
1. `Level` enum and switch expression print advice for LOW, MEDIUM, HIGH.
2. `Student` record demonstrates generated `toString`, value equality, and component access.
3. `Book.equals()` and `hashCode()` use ISBN identity; a `HashSet` rejects two books with the same ISBN.
4. `SimpleLinkedList<T>` uses a private static nested `Node` and a non-static inner `Iterator`, allowing enhanced for-loop iteration.
5. `Coin.fewestCoins()` greedily returns the minimum common US coin count for amounts in cents. For standard denominations, choosing largest coin first is optimal.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab9Demo
```
