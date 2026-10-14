public class Lab5Demo {
    static void payWithChecks(Payment p) {
        if(p instanceof CardPayment c) System.out.println("Branch: card"); 
        else if(p instanceof MobileMoneyPayment m) System.out.println("Branch: mobile money");
        else System.out.println("Branch: other");
    }
    public static void main(String[] args) {
        Printer p=new Printer(); p.print(4);p.print(4.5);p.print("Java");p.print(new int[]{1,2,3});
        Animal[] animals={new Cat(),new Cow(),new Duck()}; for(Animal a:animals)a.sound();
        Employee[] payroll={new Employee("A",1000),new Intern("B",500),new Employee("C",1200)};
        double total=0;for(Employee e:payroll)total+=e.pay();System.out.println("Payroll total: "+total);
        Animal a=new Cat();System.out.println("method: ");a.sound();System.out.println("field: "+a.type);
        Payment cp=new CardPayment(),mp=new MobileMoneyPayment();payWithChecks(cp);payWithChecks(mp);
        Payment[] payments={cp,mp};for(Payment payment:payments)payment.process();
    }
}