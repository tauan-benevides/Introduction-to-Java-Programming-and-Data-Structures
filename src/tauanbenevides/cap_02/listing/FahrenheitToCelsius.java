package tauanbenevides.cap_02.listing;

import java.util.Scanner;

/**
 * Listing 2.6
 * 
 * Program that converts a Fahrenheit degree to Celsius using the formula:
 * Celsius = (5/9) (Farenheit - 32)
 */

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // (5.0 / 9) é escrito como (5 / 9), porque (5 / 9) resulta em 0 in Java.
        // divisão entre dois números inteiros resultam em um outro número inteiro
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in celsius");

        input.close();

    }
}
