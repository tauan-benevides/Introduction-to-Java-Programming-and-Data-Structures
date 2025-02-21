package tauanbenevides.cap_02.listing;

import java.util.Scanner;

/**
 * Listing 2.2
 * 
 * Upgrade the listing 2.1, using the class Scanner
 */

public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius: " + radius + " is " + area);

        input.close();
    }
}
