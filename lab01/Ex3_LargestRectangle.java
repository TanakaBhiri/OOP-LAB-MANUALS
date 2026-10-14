public class Ex3_LargestRectangle {
    public static void main(String[] args) {
        double[][] sizes = { {2, 3}, {5, 4}, {1, 9}, {6, 6}, {3, 3} };

        Rectangle[] rects = new Rectangle[5];
        for (int i = 0; i < rects.length; i++) {
            rects[i] = new Rectangle();
            rects[i].width = sizes[i][0];
            rects[i].height = sizes[i][1];
            System.out.println("Rectangle " + (i + 1) + ": " + rects[i].width + " x " + rects[i].height
                               + "  area = " + rects[i].area());
        }

        Rectangle largest = rects[0];
        for (Rectangle r : rects) {
            if (r.area() > largest.area()) {
                largest = r;
            }
        }
        System.out.println("Largest: " + largest.width + " x " + largest.height
                           + " with area " + largest.area());
    }
}
