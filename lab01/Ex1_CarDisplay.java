public class Ex1_CarDisplay {
    public static void main(String[] args) {

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

        c1.display();
        c2.display();
        c3.display();
    }
}
