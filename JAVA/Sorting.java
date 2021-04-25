import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sorting {

    public static void InputArray() throws IOException {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("How many Names You wanna Add? : ");
        number = input.nextInt();
        String names[] = new String[number];
        System.out.println("Enter " + number + " names: ");
        for (int i = 0; i <= number - 1; i++) {
            names[i] = input.next();
        }
        System.out.println("Here's Your Given Names: ");
        for (int i = 0; i <= number - 1; i++) {
            System.out.println(names[i]);
        }
        File main = new File("Sort.txt");
        if (main.exists() && main.createNewFile()) {
            main.delete();
        } else {
            FileWriter file = new FileWriter(main);
            for (int i = 0; i < number; i++) {
                file.write(names[i] + "\n");
            }
            file.close();
        }
        input.close();
    }

    /* Sorting Using QuickSort */
    public static void QuickSort() {
        int number;
        System.out.print("Enter How Many Elements YOu wanna Sort ?: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int A[] = new int[number];
        System.out.println("Enter " + number + " of Elements: ");
        for (int i = 0; i < number; i++) {
            A[i] = input.nextInt();
        }
        int j, temp;
        for (int i = 0; i < number; i++) {
            temp = A[i];
            j = i - 1;
            while ((j >= 0) && (A[j] > temp)) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = temp;
        }
        System.out.println("Sorted List are: ");
        for (int i = 0; i < number; i++) {
            System.out.println(A[i]);
        }

        input.close();
    }

    /* MAIN PROGRAM */
    public static void main(String[] args) throws IOException {
        QuickSort();

    }
}
