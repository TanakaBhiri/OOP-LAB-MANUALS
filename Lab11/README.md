# Lab 11 — Design Patterns

## Pattern exercises
- **Singleton:** `AppConfig` has a private constructor and one eagerly-created shared instance.
- **Factory:** `NotificationFactory` returns `Notification` implementations (`EmailNotification` or `SmsNotification`) and rejects unknown types.
- **Strategy:** `Checkout` delegates price calculation to a `DiscountStrategy`; the strategy can change at runtime.
- **Observer:** `GradeBook` notifies all registered `GradeListener` objects when a mark is published.

## Run
From this lab folder, compile the separate source files and run the demo:
```bash
javac *.java
java Lab11Demo
```

## Mini-project note
The manual's Library Management System requires multiple coordinated classes, loans, CSV persistence, menu operations, and custom exceptions. This lab folder demonstrates the four requested patterns. The full integrated mini-project is provided in the separate `library-mini-project` folder at the project root.
