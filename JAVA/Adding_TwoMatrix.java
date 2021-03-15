package JAVA;

import java.util.Scanner;

public class Adding_TwoMatrix {
    int m, n;
    int first[][] = new int[m][n];
    int second[][] = new int[m][n];

    Adding_TwoMatrix(int[][] first, int[][] second, int m, int n) {
        this.first = first;
        this.second = second;
        this.m = m;
        this.n = n;
    }

    public static void main(String[] args) {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix: ");
        m = in.nextInt();
        n = in.nextInt();
        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        System.out.println("Enter the Elements of First matrix: ");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                first[c][d] = in.nextInt();
                second[c][d] = in.nextInt();
            }
        }
        System.out.println("\n Elements of First matrix: ");

    }
}
