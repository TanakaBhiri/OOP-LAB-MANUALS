# Lab 7 — Exception Handling

## Exercises covered
1. Reads two integers when available, handles non-integer input and division by zero. If no input is supplied, it uses `12` and `3` so the example can run unattended.
2. Accesses an array element and catches `ArrayIndexOutOfBoundsException`.
3. Checked `InvalidAgeException` is thrown for ages outside 0–120.
4. `BankAccount.withdraw` throws checked `InsufficientFundsException` instead of returning false. Exceptions communicate exceptional failure explicitly but require callers to catch/declare them; a boolean is simpler for expected routine outcomes.
5. `finallyDemo()` returns from `try`, but `finally` prints before the return completes.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab7Demo
```
To test interactive input, enter two integers, e.g. `12 0`.
