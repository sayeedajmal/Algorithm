
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 6, 245, 3565, 532 }; 
        /* Printing of All elements */
        for (int i = 0; i < array.length; i++) {
            System.out.println("Numbers: " + array[i]);
        }
        /* Sum of All elements */
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("Total is : " + total);
        System.out.println("<<===========================================================>>");
        /* Largest Element */
        int sort = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > sort) {
                sort = array[i];
                System.out.println("Sorting of Numbers: " + sort);
            }

        }
        /*
         * SORTING OF ARRAY IN THIS SECTION .. THIS IS HIGHLIGHT OF SORITNG ARRAY LIST
         */
        String arr[] = { " Programming ", " Sayeed_Ajmal ", " Saniya_Parveen ", " Shoaib_Akhtar " };
        Arrays.sort(arr);
        /* Print all sorted Elements */
        System.out.print("The Sorted Array list is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
