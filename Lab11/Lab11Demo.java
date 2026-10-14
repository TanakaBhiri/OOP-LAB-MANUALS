import java.util.*;
public class Lab11Demo {
    // Singleton: one shared configuration instance
    // Factory: create implementations through an interface
    // Strategy: change discount behaviour at runtime
    // Observer: notify subscribers when grades are published
    public static void main(String[] args) {
        System.out.println("Same instance? "+(AppConfig.getInstance()==AppConfig.getInstance())+" -> "+AppConfig.getInstance().institution());
        NotificationFactory.create("email").send("Lab 11 is open");NotificationFactory.create("sms").send("Lab 11 is open");
        Checkout checkout=new Checkout(price->price);System.out.println("Regular: "+checkout.total(200));
        checkout.setStrategy(price->price*0.90);System.out.println("Student: "+checkout.total(200));
        GradeBook book=new GradeBook();book.subscribe((course,mark)->System.out.println("Portal: "+course+" = "+mark));
        book.subscribe((course,mark)->{if(mark<50)System.out.println("Advisor alert: "+course+" failed");});
        book.publish("OOP",72);book.publish("Databases",45);
    }
}