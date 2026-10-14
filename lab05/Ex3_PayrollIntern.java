/**
 * Lab 5, Exercise 3 (Intermediate): extend the Lab 4 employee hierarchy with Intern and compute the
 * total payroll for a mixed array WITHOUT changing the payroll loop.
 */
class Employee {
    private final String name;
    protected double baseSalary;

    Employee(String name, double baseSalary) { this.name = name; this.baseSalary = baseSalary; }

    String getName() { return name; }
    double calculatePay() { return baseSalary; }
}

class Manager extends Employee {
    private final double bonus;
    Manager(String name, double baseSalary, double bonus) { super(name, baseSalary); this.bonus = bonus; }
    @Override double calculatePay() { return super.calculatePay() + bonus; }
}

class Developer extends Employee {
    private final int overtimeHours;
    Developer(String name, double baseSalary, int overtimeHours) { super(name, baseSalary); this.overtimeHours = overtimeHours; }
    @Override double calculatePay() { return baseSalary + overtimeHours * 25.0; }
}

// The NEW class for this exercise
class Intern extends Employee {
    private final double stipend;
    Intern(String name, double stipend) { super(name, 0); this.stipend = stipend; }
    @Override double calculatePay() { return stipend; }
}

public class Ex3_PayrollIntern {
    public static void main(String[] args) {
        Employee[] staff = {
            new Employee("Kudzai", 2000),
            new Manager("Nyasha", 3500, 800),
            new Developer("Tatenda", 3000, 10),
            new Intern("Lee", 500)                    // the new type just slots in
        };

        // THE PAYROLL LOOP: it was NOT changed to support Intern. That is the value of polymorphism.
        double total = 0;
        for (Employee e : staff) {
            double pay = e.calculatePay();
            System.out.printf("%-8s %.2f%n", e.getName(), pay);
            total += pay;
        }
        System.out.printf("Total payroll: %.2f%n", total);
    }
}
