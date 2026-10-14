import java.util.*;

public abstract class Account { protected double balance; void deposit(double amount){if(amount<=0)throw new IllegalArgumentException();balance+=amount;} abstract double monthlyFee(); }
