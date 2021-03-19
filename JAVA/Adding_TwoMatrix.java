

import java.util.Scanner;

public class Adding_TwoMatrix {
    static int Rows, Column;

    public static void main(String[] args) {
        Calculation(Rows, Column);
    }

    public static void Calculation(int Rows, int Column) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        Rows = in.nextInt();
        System.out.print("Enter the number of Columns: ");
        Column = in.nextInt();

        int first[][] = new int[Rows][Column];

        System.out.print("Enter the Elements of First matrix: ");
        System.out.print("\n\n Enter Elements of Rows: and Column: ");

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Column; j++) {
                first[i][j] = in.nextInt();
            }
        }
        int second[][] = new int[Rows][Column];

        System.out.print("Enter The Elements of Second Metrix: ");
        System.out.print("\n\n Enter Elements of Rows: and Column: ");

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Column; j++) {
                second[i][j] = in.nextInt();
            }
        }

        /* SHOWING ALL MATRIX */
        /* FIRST MATRIX */
        System.out.println("\t\tShowing Matrix:");
        System.out.print("\tFirst Matrix  " + "\t\t Second Matrix\n");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.print("\t" + first[i][j] + " ");
                System.out.print("\t\t" + second[i][j] + " ");
            }
            System.out.println();

        }
        in.close();
    }
}
