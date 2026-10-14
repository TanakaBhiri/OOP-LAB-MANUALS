class Employee {
    private static int nextId = 1;

    private final int employeeId;
    private String name;
    private double salary;

    {
        employeeId = nextId++;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    Employee(String name) {
        this(name, 0.0);
    }

    Employee() {
        this("Unknown");
    }

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
        Employee e4 = new Employee(e1);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
    }
}
