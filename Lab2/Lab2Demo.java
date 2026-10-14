public class Lab2Demo {
    public static void main(String[] args) {
        Circle c1=new Circle(); Circle c2=new Circle(2);
        System.out.printf("Circle areas: %.2f, %.2f; count=%d%n",c1.area(),c2.area(),Circle.getCount());
        Employee e1=new Employee("Amai"); Employee e2=new Employee("Tariro","IT",4200); Employee e3=new Employee(e2);
        System.out.println(e1); System.out.println(e2); System.out.println(e3);
        System.out.println("Initialisation order (two objects):"); new InitOrder(); new InitOrder();
        System.out.println(Temperature.fromCelsius(25)); System.out.println(Temperature.fromFahrenheit(32));
    }
}