/** Lab 6, Exercise 3 (Intermediate): abstract Account with concrete deposit() and abstract monthlyFee(). */
abstract class Account {
    protected double balance;

    // Concrete method shared by every account type
    void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    // Abstract: each account type charges a different fee
    abstract double monthlyFee();

    // Concrete method that USES the abstract one (template of common behaviour)
    void applyMonthlyFee() {
        balance -= monthlyFee();
    }
}

class SavingsAccount extends Account {
    @Override double monthlyFee() { return 2.0; }
}

class CurrentAccount extends Account {
    @Override double monthlyFee() { return 10.0; }
}

public class Ex3_AbstractAccount {
    public static void main(String[] args) {
        Account[] accounts = { new SavingsAccount(), new CurrentAccount() };

        for (Account a : accounts) {
            a.deposit(100);
            a.applyMonthlyFee();
            System.out.println(a.getClass().getSimpleName() + ": fee " + a.monthlyFee()
                               + ", balance after fee " + a.balance);
        }
    }
}
