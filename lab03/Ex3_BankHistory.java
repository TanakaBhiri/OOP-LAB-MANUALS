import java.util.List;

/** Lab 3, Exercise 3 (Intermediate): transaction history exposed only as an unmodifiable copy. */
public class Ex3_BankHistory {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", 500);
        acc.deposit(250);
        acc.withdraw(100);
        acc.withdraw(5000);                    // fails: not enough money, but it is still recorded

        List<String> history = acc.getHistory();
        for (String line : history) {
            System.out.println(line);
        }
        System.out.println("Balance: " + acc.getBalance());

        // Try to tamper with the history through the getter: it is blocked
        try {
            history.clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Tampering blocked: the history is read-only");
        }
        System.out.println("Entries still stored: " + acc.getHistory().size());
    }
}
