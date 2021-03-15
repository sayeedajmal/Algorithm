package JAVA;

import java.util.*;

public class Password {
    public static void main(String[] args) {
        int length = 8;
        System.out.println(MainPassword(length));
    }

    /*
     * This our Password generating method We have use static here, so that we not
     * to make any object for it
     */
    static char[] MainPassword(int len) {

        System.out.println("\t\t\tGenerating password");
        System.out.print("\t\tYour new password is : ");
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = Capital_chars + Small_chars + numbers + symbols;

        // Using random method
        Random random = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(random.nextInt(values.length()));

        }
        return password;
    }
}
