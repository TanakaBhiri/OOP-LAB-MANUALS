import java.time.Year;

public class Exercises {
    static class Car {
        String brand; int year; double mileage;
        Car(String brand, int year, double mileage) { this.brand=brand; this.year=year; this.mileage=mileage; }
        void display() { System.out.printf("%s, %d, %.1f km%n", brand, year, mileage); }
        boolean isAntique() { return Year.now().getValue() - year > 25; }
    }
    static class Rectangle {
        double width, height;
        Rectangle(double width, double height) { this.width=width; this.height=height; }
        double area() { return width*height; }
        double perimeter() { return 2*(width+height); }
        public String toString() { return String.format("Rectangle(%.1f x %.1f, area=%.1f, perimeter=%.1f)", width,height,area(),perimeter()); }
    }
    static class Address { String city; Address(String city) { this.city=city; } }
    static class Person { String name; Address address; Person(String name, Address address) { this.name=name; this.address=address; } }
    public static void main(String[] args) {
        System.out.println("1-2. Cars:");
        Car[] cars={new Car("Toyota",2000,180000),new Car("Honda",2018,75000),new Car("Mazda",1995,240000)};
        for(Car c:cars) { c.display(); System.out.println("Antique? "+c.isAntique()); }
        System.out.println("\n3. Largest rectangle:");
        Rectangle[] rs={new Rectangle(4,5),new Rectangle(6,3),new Rectangle(8,7),new Rectangle(2,9),new Rectangle(10,4)};
        Rectangle largest=rs[0]; for(Rectangle r:rs) if(r.area()>largest.area()) largest=r;
        System.out.println(largest);
        System.out.println("\n4. Reference aliasing:");
        Rectangle r1=new Rectangle(2,3); Rectangle r2=r1; r2.width=99;
        System.out.println("r1.width = "+r1.width+" (both variables refer to the same object)");
        System.out.println("\n5. Composition and null:");
        Person p=new Person("Tariro",new Address("Harare"));
        System.out.println(p.name+" lives in "+p.address.city);
        Person p2=new Person("Farai",null);
        try { System.out.println(p2.address.city); }
        catch(NullPointerException e) { System.out.println("Null address causes NullPointerException"); }
        System.out.println("Safe result: "+(p2.address==null ? "Address not available" : p2.address.city));
    }
}