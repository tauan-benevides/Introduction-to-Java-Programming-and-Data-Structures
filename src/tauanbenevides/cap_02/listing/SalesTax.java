package tauanbenevides.cap_02.listing;

import java.util.Scanner;

/**
 * Listing 2.8
 * 
 * This program displays the sales tax with two digits after the decimal point
 */

public class SalesTax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);

        input.close();
    }
}
