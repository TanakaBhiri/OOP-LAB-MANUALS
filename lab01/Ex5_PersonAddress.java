class Address {
    String city;
}

class Person {
    String name;
    Address address;
}

public class Ex5_PersonAddress {
    public static void main(String[] args) {
        Person withAddress = new Person();
        withAddress.name = "Tariro";
        withAddress.address = new Address();
        withAddress.address.city = "Harare";

        System.out.println(withAddress.name + " lives in " + withAddress.address.city);

        Person noAddress = new Person();
        noAddress.name = "Farai";

        try {

            System.out.println(noAddress.address.city);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + noAddress.name + " has no address object yet");
        }

        if (noAddress.address != null) {
            System.out.println(noAddress.address.city);
        } else {
            System.out.println("Safe check: " + noAddress.name + " has no address");
        }
    }
}
