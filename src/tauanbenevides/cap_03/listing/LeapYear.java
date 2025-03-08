package tauanbenevides.cap_03.listing;

import java.util.Scanner;

/**
 * Listing 3.7
 * 
 * Gives the program that lets the user enter a year and checks whether it is a
 * leap year.
 */

/*
 * Um ano é bissexto se for divisível por 4, mas não por 100 ou se for divisível
 * por 400.
 * 
 * year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
 */

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);

        System.out.println(year + " is a leap year? " + isLeapYear);

        input.close();
    }
}
