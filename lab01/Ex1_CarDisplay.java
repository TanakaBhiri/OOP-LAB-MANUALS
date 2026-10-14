/** Lab 1, Exercise 1 (Basic): create three cars and print them. */
public class Ex1_CarDisplay {
    public static void main(String[] args) {
        // EXPLAIN: 'new' allocates a Car on the heap and returns a reference to it
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.year = 2015;
        c1.mileage = 120000;

        Car c2 = new Car();
        c2.brand = "Honda";
        c2.year = 1998;
        c2.mileage = 210000;

        Car c3 = new Car();
        c3.brand = "Mazda";
        c3.year = 2022;
        c3.mileage = 15000;

        // Each call uses the fields of the object it is called on
        c1.display();
        c2.display();
        c3.display();
    }
}
