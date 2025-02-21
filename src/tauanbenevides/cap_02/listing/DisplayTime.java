package tauanbenevides.cap_02.listing;

import java.util.Scanner;

/**
 * Listing 2.5
 * 
 * This program obtains minutes and remaining seconds from an amount of time in
 * seconds.
 */

public class DisplayTime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSecond = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSecond + " seconds");

        input.close();

    }
}
