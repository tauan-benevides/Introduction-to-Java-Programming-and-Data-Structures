package tauanbenevides.cap_04.listing;

import java.util.Scanner;

/**
 * Listing 4.2
 * 
 * Listing 4.2 gives a program that prompts the user to enter two cities
 * and displays them in alphabetical order.
 */

public class OrderTwoCities {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to two cities
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0) {
            System.out.println("The cities in alphabetical order are " +
                    city1 + " " + city2);
        } else {
            System.out.println("The cities in alphabetical order are " +
                    city2 + " " + city1);
        }

        input.close();
    }
}