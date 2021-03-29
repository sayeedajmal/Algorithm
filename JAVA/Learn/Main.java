package Learn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Login */
        String user = "Admin";
        String pass = "1234";
        Scanner input = new Scanner(System.in);
        String inputuser = input.nextLine();
        String inputpass = input.nextLine();
        if (inputuser.equals(user) && inputpass.equals(pass)) {
            Customer.Option();
        }

    }
}
