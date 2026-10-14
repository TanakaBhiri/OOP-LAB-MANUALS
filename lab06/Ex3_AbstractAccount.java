abstract class Account {
    protected double balance;

    void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    abstract double monthlyFee();

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
