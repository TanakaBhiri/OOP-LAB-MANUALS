/**
 * Lab 2, Exercise 3 (Intermediate): Employee with an auto-incrementing employeeId (static counter),
 * three overloaded constructors and a copy constructor.
 */
class Employee {
    private static int nextId = 1;        // shared counter: the next id to hand out

    private final int employeeId;         // final: assigned exactly once for each object
    private String name;
    private double salary;

    // EXPLAIN: the instance initialiser block runs before EVERY constructor body
    {
        employeeId = nextId++;            // use the current value, then add one
    }

    // Constructor 1: full details
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Constructor 2: name only, salary starts at 0 (chains to constructor 1)
    Employee(String name) {
        this(name, 0.0);
    }

    // Constructor 3: no arguments (chains to constructor 2)
    Employee() {
        this("Unknown");
    }

    // Copy constructor: same name and salary, but a NEW id because it is a new employee
    Employee(Employee other) {
        this(other.name, other.salary);
    }

    @Override
    public String toString() {
        return "Employee #" + employeeId + " " + name + " (salary " + salary + ")";
    }
}

public class Ex3_EmployeeCounter {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kudzai", 2000);
        Employee e2 = new Employee("Nyasha");
        Employee e3 = new Employee();
        Employee e4 = new Employee(e1);       // copy of e1 gets its own id

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
    }
}
