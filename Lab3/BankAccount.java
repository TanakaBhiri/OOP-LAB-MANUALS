import java.util.*;

public class BankAccount {
    private final String accountNumber; private double balance; private final List<String> history=new ArrayList<>();
    BankAccount(String number,double opening) { if(opening<0)throw new IllegalArgumentException("negative opening balance"); accountNumber=number; balance=opening; history.add("Opened: "+opening); }
    void deposit(double amount) { if(amount<=0)throw new IllegalArgumentException("deposit must be positive"); balance+=amount; history.add("Deposit: "+amount); }
    boolean withdraw(double amount) { if(amount<=0)throw new IllegalArgumentException("withdrawal must be positive"); if(amount>balance)return false; balance-=amount; history.add("Withdrawal: "+amount); return true; }
    List<String> getHistory() { return Collections.unmodifiableList(new ArrayList<>(history)); }
    public String toString() { return accountNumber+" balance="+balance; }
}
