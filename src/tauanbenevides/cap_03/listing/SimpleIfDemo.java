package tauanbenevides.cap_03.listing;

import java.util.Scanner;

/**
 * Listing 3.2
 * 
 * Gives a program that prompts the user to enter an integer.
 * If the number is a multiple of 5, the program displays HiFive.
 * If the number is divisible by 2, it displays HiEven
 */

public class SimpleIfDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println("HiFive");
        }

        if (number % 2 == 0) {
            System.out.println("HiEven");
        }

        input.close();
    }
}
