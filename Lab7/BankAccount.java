import java.util.*;

public class BankAccount {
    double balance;BankAccount(double b){balance=b;}
    void withdraw(double amount)throws InsufficientFundsException {
        if(amount<=0)throw new IllegalArgumentException("amount must be positive");
        if(amount>balance)throw new InsufficientFundsException("Insufficient funds: balance="+balance);
        balance-=amount;
    }
}
