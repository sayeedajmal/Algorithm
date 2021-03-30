public class MaxValue {
    public static void main(String[] args) {
        /* System.out.print("Enter Some Real Numbers: "); */
        int test[] = { 1, 5, 3, 7, 9, 6, 2 };
        int maxval = test[0];
        for (int i = 0; i < test.length; i++) {
            if (test[i] > maxval) {
                maxval = test[i];
            }
        }
        System.out.print("Maximum value of Array is : " + maxval);

    }
}
