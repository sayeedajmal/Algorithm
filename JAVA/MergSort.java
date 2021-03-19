
import java.util.Scanner;

public class MergSort {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\tWELCOME TO ATM");
        System.out.println("\t\t<========================>");
        Thread.sleep(500);
        System.out.print("\t\tEnter Your Name : ");
        String Name = input.nextLine();
        System.out.print("\t\tEnter Your Password: ");
        String Password = input.nextLine();
        // =======================>CHECKING YOUR PASSWORD.....
        if (Name.equals("Sayeed") && Password.equals("Admin")) {
            System.out.println("\t\tSucessFull! ");
            Thread.sleep(2000);
            Credit();
            Thread.sleep(2000);
            Withdraw();
            Thread.sleep(2000);
            Balance();
            Thread.sleep(2000);
            Exit();
        } else {
            System.out.println("\t\tops... Your Entered Worng Username or Password..");
        }
        // Giving Options to User For Choice!
        System.out.println(
                "\t\t Choice Your Option Carefully! \n \t\t 1. Credit \n \t\t 2. WithDraw \n \t\t 3. Balance \n \t\t 4. Exit");
        System.out.print("\t\t Enter Your Choice: ");
        int Choice = input.nextInt();
        switch (Choice) {
            case 1:
                System.out.println("Value 1 is pressed");
                break;
            case 2:
                System.out.println("Value 2 is Pressed");
                break;
            case 3:
                System.out.println("Value 3 is Pressed");
                break;
            case 4:
                System.out.println("Value 4 is Pressed");
                break;
            default:
                break;
        }

        input.close();

    }

    // Credit Card
    private static void Credit() {
        System.out.println("\t\tThis is Credit Option!");
    }

    // WithDraw
    private static void Withdraw() {
        System.out.println("\t\tThis is Withdraw Option");
    }

    // Checking Balance
    private static void Balance() {
        System.out.println("\t\tThis is Balance Option");
    }

    // Exit
    private static void Exit() {
        System.out.println("\t\t This will Exit You");
    }
}