package Learn;

import java.util.Arrays;

public class Bank {
    static String BankName;
    static String Location;
    static long[] account_numbers = { 8907, 5678, 1234, 5678, 9012, 3456, 8901, 2345, 1233, 7854 };

    public static void DisplayInformation() {
        BankName = "State Bank";
        Location = "Earth";
        System.out.println("Bank_Name: " + BankName);
        System.out.println("Location: " + Location);
    }

    public static void Accounts() {
        System.out.println(Arrays.toString(account_numbers));
    } 
}