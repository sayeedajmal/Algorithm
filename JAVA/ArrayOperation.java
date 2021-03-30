import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        /* First Declare and Then Initialize arrays with their index */
        String[] array = new String[10];
        array[0] = "Hello!";
        array[1] = " I ";
        array[2] = "am ";
        array[3] = "sayeed ";
        array[4] = "Ajmal. ";
        array[5] = "I ";
        array[6] = "am ";
        array[7] = "Testing ";
        array[8] = "All ";
        array[9] = "of Functions of Arrays.";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("<========================>");
        /* Declation and Initialization in one line */
        String[] array1 = { "Declare ", "and ", "Initialize ", "in ", "one ", "Line.." };
        for (String Show : array1) {
            System.out.println(Show);
        }

        /* Lenght of Array */
        System.out.println("Lenght of Array: " + array.length);
        System.out.println("<=======================================================================>");
        /* Sum of All array Elements: */
        int numbers[] = { 13, 12, 1, 45, 32, 56, 26 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Lenght of Array: " + numbers.length);
        System.out.println("Sum of All Array Elements: " + sum);
        double Average = (double) sum / numbers.length;
        System.out.println("Average of Arrays: " + Average);
        System.out.println("Without Swaping: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("<=======================================================================>");
        System.out.println("With Swaping: ");
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
