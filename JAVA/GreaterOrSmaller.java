package JAVA;

import java.util.Scanner;

public class GreaterOrSmaller {

    // The Mathod is for Comparision!
    public static void Comparision(Scanner sc) {
        System.out.print("\t\tEnter First Number: ");
        sc = new Scanner(System.in);
        int First = sc.nextInt();
        System.out.print("\t\tEnter Second Number: ");
        int Second = sc.nextInt();
        if (First < Second) {
            System.out.println("\t\t" + Second + " is Greater then " + First);
        } else {
            System.out.println("\t\t" + First + " Number is Greater then " + Second);
        }
        sc.close();

    }

    public static void Number_Guessing() {

       /*  int i = 10;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
        System.out.println("\t\t<<==================================>>");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5); */
        
        /* int s = 0;
        for (int i = 0; i <= 100; i++) {
            s = s + i;
        }
        System.out.println("Total is : " + s); */

    }

    public static void main(String[] args) {
        Number_Guessing();
    }
}
