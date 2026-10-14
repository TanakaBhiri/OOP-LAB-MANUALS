
<?php

class Address {
    public $city;

    public function __construct($city) {
        $this->city = $city;
    }
}

class Person {
    public $name;
    public $address;

    public function __construct($name, $address) {
        $this->name = $name;
        $this->address = $address;
    }
}
$address = new Address("Harare");
$person = new Person("John", $address);
echo $person->address->city . "\n";
$person2 = new Person("Mary", null);
echo $person2->address->city;

?>
