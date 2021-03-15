package JAVA;

import java.util.Scanner;

public class Adding_TwoMatrix {
    int Rows, Column;
    int first[][] = new int[Rows][Column];
    int second[][] = new int[Rows][Column];

    /*
     * public Adding_TwoMatrix(int rows, int column, int[][] first, int[][] second)
     * { Rows = rows; Column = column; this.first = first; this.second = second; }
     */
    public static void main(String[] args) throws InterruptedException {
        int Rows, Column;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        Rows = in.nextInt();
        System.out.println("Enter the number of Columns: ");
        Column = in.nextInt();
        int first[][] = new int[Rows][Column];
        System.out.println("Enter the Elements of First matrix: ");
        System.out.println("\n\n Enter Elements of Rows: ");
        for (int i = 0; i < Rows; i++) {
            System.out.println("\n\n Enter Elements of Column: ");
            for (int j = 0; j < Column; j++) {
                first[i][j] = in.nextInt();
            }
        }
        int second[][] = new int[Rows][Column];

        System.out.println("Enter The Elements of Second Metrix: ");
        System.out.println("\n\n Enter Elements of Rows: ");
        for (int i = 0; i < Rows; i++) {
            System.out.println("\n\n Enter Elements of Column: ");
            for (int j = 0; j < Column; j++) {
                second[i][j] = in.nextInt();
            }
        }
        in.close();
        /* Adding(Rows, Column, first, second); */
    }

    public static void Adding(int Rows, int Column, int[][] first, int[][] second) throws InterruptedException {
        System.out.println("We are Adding Given Matrix: Please Patience: ");
        Thread.sleep(5000);
        int[][] Addition = new int[Rows][Column];
        Addition.equals(null);
    }

}
