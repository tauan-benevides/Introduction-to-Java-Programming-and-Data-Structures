package tauanbenevides.cap_03.listing;

import java.util.Scanner;

/**
 * Listing 3.5
 * 
 * 
 */

public class ComputeTax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                Enter the filing status:
                    0. Single filers;
                    1. Married filing jointly;
                    2. Married filing separately;
                    3. Head of household.
                """);
        int status = input.nextInt();

        System.out.println("Enter you taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            } else if (income <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                        + (income - 171550) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                        + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            }

        } else if (status == 2) {
            // TODO ...

        } else if (status == 3) {
            // TODO ...

        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        System.out.println("Tax is " + (int) (tax * 100) / 100);

        input.close();
    }
}
