
<?php

class Rectangle {
    public $width;
    public $height;
    public function __construct($width, $height) {
        $this->width = $width;
        $this->height = $height;
    }

    public function area() {
        return $this->width * $this->height;
    }
    public function perimeter() {
        return 2 * ($this->width + $this->height);
    }
}
$rectangles = [
    new Rectangle(4, 5),
    new Rectangle(6, 3),
    new Rectangle(8, 7),
    new Rectangle(2, 9),
    new Rectangle(10, 4)
];
$largest = $rectangles[0];
foreach ($rectangles as $rectangle) {
    if ($rectangle->area() > $largest->area()) {
        $largest = $rectangle;
    }
}
echo "Rectangle with the largest area:\n";
echo "Width: " . $largest->width . "\n";
echo "Height: " . $largest->height . "\n";
echo "Area: " . $largest->area() . "\n";
echo "Perimeter: " . $largest->perimeter() . "\n";

?>
