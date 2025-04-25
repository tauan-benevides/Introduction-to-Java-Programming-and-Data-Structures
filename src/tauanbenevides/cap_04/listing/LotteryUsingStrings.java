package tauanbenevides.cap_04.listing;

import java.util.Scanner;

/**
 * Listing 4.5
 * <p>
 * The program in Listing 3.8 uses an integer to store the number.
 * <p>
 * Listing 4.5 gives a new program that generates a random two-digits
 * string instead of a number, and receives the user input as a string
 * instead of a number.
 */

public class LotteryUsingStrings {

    public static void main(String[] args) {

        String lottery = " " + (int) (Math.random() * 10) +
                (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        char loterryDigit1 = lottery.charAt(0);
        ;
        char loterryDigit2 = lottery.charAt(1);
        ;

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        if (guess.equals(lottery)) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit2 == loterryDigit1 && guessDigit1 == loterryDigit2) {
            System.out.println("Match all digits: you winn $3,000");
        } else if (guessDigit1 == loterryDigit1
                || guessDigit1 == loterryDigit2
                || guessDigit2 == loterryDigit1
                || guessDigit2 == loterryDigit2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
        input.close();
    }
}
