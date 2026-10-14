import java.util.List;

public class Ex3_BankHistory {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", 500);
        acc.deposit(250);
        acc.withdraw(100);
        acc.withdraw(5000);

        List<String> history = acc.getHistory();
        for (String line : history) {
            System.out.println(line);
        }
        System.out.println("Balance: " + acc.getBalance());

        try {
            history.clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Tampering blocked: the history is read-only");
        }
        System.out.println("Entries still stored: " + acc.getHistory().size());
    }
}
