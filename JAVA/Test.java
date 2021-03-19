
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
         * int test = 1;
         * 
         * while (test <= 3) { System.out.println("Hello"); test++; } //
         * =======================> int i = 1; do { System.out.println("This is Test: "
         * + i); i++; } while (i <= 10);
         */
        // =======================>
        /*
         * String argument = "I am Sofware"; System.out.println(argument.length());
         * System.out.println(argument.toUpperCase());
         * System.out.println(argument.charAt(1));
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A  C harcter: ");
        char  text=input.next().charAt(0);
        char nx=Character.toLowerCase(text);
        if (Character.isAlphabetic(nx)) {
            switch (nx) {
                case 'a':
                        System.out.println("vowel");
                    break;
            
                default:
                    System.out.println("Consunent");
                    break;
            }  
        } else {
            System.out.println("Hello");
        }
        input.close();
    }
}
