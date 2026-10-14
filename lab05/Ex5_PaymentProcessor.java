/**
 * Lab 5, Exercise 5 (Challenge): PaymentProcessor.pay(Payment p).
 * Design 1 uses instanceof pattern matching. Design 2 refactors to a polymorphic process() method.
 */

// ---------- DESIGN 1: instanceof pattern matching ----------
class Payment {
    protected final double amount;
    Payment(double amount) { this.amount = amount; }
}
class CardPayment extends Payment {
    final String cardNumber;
    CardPayment(double amount, String cardNumber) { super(amount); this.cardNumber = cardNumber; }
}
class MobileMoneyPayment extends Payment {
    final String phone;
    MobileMoneyPayment(double amount, String phone) { super(amount); this.phone = phone; }
}

class PaymentProcessor {
    void pay(Payment p) {
        // EXPLAIN: pattern matching tests AND casts in one step (Java 16+)
        if (p instanceof CardPayment c) {
            System.out.println("Charging card ending " + c.cardNumber.substring(c.cardNumber.length() - 4)
                               + " for " + p.amount);
        } else if (p instanceof MobileMoneyPayment m) {
            System.out.println("Requesting mobile money from " + m.phone + " for " + p.amount);
        } else {
            throw new IllegalArgumentException("Unknown payment type");
        }
    }
}

// ---------- DESIGN 2: polymorphic process() ----------
interface Processable {
    void process();
}
class CardPay implements Processable {
    private final double amount; private final String cardNumber;
    CardPay(double amount, String cardNumber) { this.amount = amount; this.cardNumber = cardNumber; }
    public void process() {
        System.out.println("Charging card ending " + cardNumber.substring(cardNumber.length() - 4) + " for " + amount);
    }
}
class MobilePay implements Processable {
    private final double amount; private final String phone;
    MobilePay(double amount, String phone) { this.amount = amount; this.phone = phone; }
    public void process() {
        System.out.println("Requesting mobile money from " + phone + " for " + amount);
    }
}
class PaymentProcessor2 {
    void pay(Processable p) { p.process(); }      // no instanceof, no change needed for new types
}

public class Ex5_PaymentProcessor {
    public static void main(String[] args) {
        System.out.println("--- Design 1: instanceof ---");
        PaymentProcessor v1 = new PaymentProcessor();
        v1.pay(new CardPayment(100, "1234567812345678"));
        v1.pay(new MobileMoneyPayment(45.5, "0771234567"));

        System.out.println("--- Design 2: polymorphism ---");
        PaymentProcessor2 v2 = new PaymentProcessor2();
        v2.pay(new CardPay(100, "1234567812345678"));
        v2.pay(new MobilePay(45.5, "0771234567"));

        /*
         * COMPARISON: In Design 1, a new payment type (say BankTransfer) means editing pay() again,
         * and forgetting a branch gives a run-time error. In Design 2 you only add a new class that
         * implements Processable, and the processor never changes (open for extension, closed for
         * modification). Design 2 is better when you own the classes. instanceof is a reasonable
         * fallback when you cannot add methods to the classes you receive.
         */
    }
}
