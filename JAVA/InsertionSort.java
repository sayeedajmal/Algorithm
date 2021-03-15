package JAVA;

import java.util.Scanner;

class InsertionSort {

    public static void main(String args[]) {

        // Creating Scan Method for Getting input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");

        /* Creating integer n for Storing index of n */
        int n = scan.nextInt();

        /* Indexing n integer to Array list */
        int array[] = new int[n];
        System.out.println("Enter " + n + " Elements :");

        /* Justifying the n number to be placed to Correct or not */
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        /* Applying InsertionSort Technique for Result */
        for (int i = 1; i < n; i++) {

            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println("<==================Sorted List with InsertionSort Technique=========================>");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\n");
        }

        scan.close();
    }
}
