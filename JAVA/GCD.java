import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        int Number1, Number2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        Number1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        Number2 = input.nextInt();
        Number1 = Number2;
        int Reminder = Number1 / Number2;
        Number2 = Reminder;

        /* Loop */
        if (Number2 == 0) {
            System.out.println("GCD of Number1 and Number2 is: " + Number1);
        } else {
            System.out.println("GCD of Number1 and Number2 is:  " + Reminder);
        }
        input.close();
    }
}