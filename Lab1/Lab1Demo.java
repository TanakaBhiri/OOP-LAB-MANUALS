import java.time.Year;

public class Lab1Demo {
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