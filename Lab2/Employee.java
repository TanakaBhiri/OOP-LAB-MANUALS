public class Employee {
    private static int nextId=1;
    final int employeeId; String name; String department; double salary;
    Employee(String name) { this(name,"Unassigned",0); }
    Employee(String name,String department) { this(name,department,0); }
    Employee(String name,String department,double salary) { this.employeeId=nextId++; this.name=name; this.department=department; this.salary=salary; }
    Employee(Employee other) { this(other.name,other.department,other.salary); }
    public String toString() { return employeeId+": "+name+" / "+department+" / "+salary; }
}
