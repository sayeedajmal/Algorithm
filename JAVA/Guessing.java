package JAVA;

import java.util.Scanner;

public class Guessing {
    static Scanner sc = new Scanner(System.in);

    public static void Guess() {
        int number = (int) ((100 * Math.random()));
        int Trail = 7;
        int i, guess;
        System.out.println("\t\tA number is Choosen\n" + "\t\tbetween 1 to 100.\n" + "\t\tGuess the Number!\n"
                + "\t\tWithin The 7 trials.");
        for (i = 0; i < Trail; i++) {
            System.out.print("\t\tGuess The Number: ");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("\t\tCongratulation! You Guessed The number!!");
                break;
            } else if (number > guess && i != Trail - 1) {
                System.out.println("\t\tThe number is Greater then :" + guess);
            } else if (number < guess && i != Trail - 1) {
                System.out.println("\t\tThe number is Lesser then: " + guess);
            }
        }
        if (i == Trail) {
            System.out.println("\t\tYou have Exhausted 7 Trails: ");
            System.out.println("\t\t The number was: " + number);
        }
        sc.close();
    }

    public static void main(String[] args) {
        Guess();
    }
}
