package Learn;

import java.util.Scanner;

public class Customer {
    Bank bank = new Bank();

    public static void Option() {
        System.out.println("1- View The Account: ");
        System.out.println("2- WithDrawal: ");
        System.out.println("3- Deposite: ");
        System.out.println("4- Exit: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
        case 1:
            view();
            return;
        case 2:
            WithDrawal();
            return;
        case 3:
            Deposite();
            return;
        case 4:
            Exit();
            break;
        default:
            break;
        }

    }

    public static void view() {
        Bank.DisplayInformation();
    }

    public static void WithDrawal() {
        System.out.println("You can WithDraw Ammount Here: ");
    }

    public static void Deposite() {
        System.out.println("You Can Deposite Here..");
    }

    public static void Exit() {
        System.out.println("Exit! ");
    }
}
