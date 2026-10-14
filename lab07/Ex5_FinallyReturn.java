/** Lab 7, Exercise 5 (Challenge): return inside try, with a print inside finally. Predict, verify, explain. */
public class Ex5_FinallyReturn {

    static int test() {
        try {
            System.out.println("in try, about to return 1");
            return 1;
        } finally {
            System.out.println("in finally");        // still runs even though try already hit 'return'
        }
    }

    public static void main(String[] args) {
        /*
         * PREDICTION:
         *   in try, about to return 1
         *   in finally
         *   Result: 1
         * WHY: when try executes 'return', the value (1) is saved, then finally runs, and only then does
         * the method actually return. finally runs in nearly every case, which is why it is used for cleanup.
         * (If finally itself contained a return, it would OVERRIDE the earlier one, which is bad practice.)
         */
        int result = test();
        System.out.println("Result: " + result);
    }
}
