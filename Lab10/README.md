# Lab 10 — File I/O, Lambdas and Streams

## Exercises covered
1. Reads five lines from standard input, writes them to `five-lines.txt`, and reads them back. An empty first line selects sample lines for quick testing.
2. `Predicate<Integer>` plus `removeIf` removes even numbers.
3. Reads `sample-text.txt` and reports line, word, and character counts (character count excludes newline separators).
4. Streams calculate the class average and print names above average in alphabetical order.
5. Reads `learners.csv`, groups learners into A (80+), B (60–79), and C (below 60), and writes `grade-A.txt`, `grade-B.txt`, and `grade-C.txt`. Missing sample CSV is created automatically.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab10Demo
```
Files are created in the current working directory. CSV format in this example is `name,marks`.
