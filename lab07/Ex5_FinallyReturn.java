public class Ex5_FinallyReturn {

    static int test() {
        try {
            System.out.println("in try, about to return 1");
            return 1;
        } finally {
            System.out.println("in finally");
        }
    }

    public static void main(String[] args) {

        int result = test();
        System.out.println("Result: " + result);
    }
}
