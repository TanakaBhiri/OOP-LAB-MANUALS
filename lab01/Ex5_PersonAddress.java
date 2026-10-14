/** Lab 1, Exercise 5 (Challenge): Person has an Address; chained dot access; what happens when address is null. */
class Address {
    String city;
}

class Person {
    String name;
    Address address;     // EXPLAIN: a field can itself be a reference to another object
}

public class Ex5_PersonAddress {
    public static void main(String[] args) {
        Person withAddress = new Person();
        withAddress.name = "Tariro";
        withAddress.address = new Address();
        withAddress.address.city = "Harare";

        // EXPLAIN: chained dot: person -> address -> city
        System.out.println(withAddress.name + " lives in " + withAddress.address.city);

        Person noAddress = new Person();
        noAddress.name = "Farai";            // address was never set, so it is null

        try {
            // address is null, so there is no object to read .city from -> NullPointerException
            System.out.println(noAddress.address.city);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + noAddress.name + " has no address object yet");
        }

        // The safe way: check for null before the second dot
        if (noAddress.address != null) {
            System.out.println(noAddress.address.city);
        } else {
            System.out.println("Safe check: " + noAddress.name + " has no address");
        }
    }
}
