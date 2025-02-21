package tauanbenevides.cap_02.listing;

import java.util.Scanner;

/**
 * Listing 2.4
 * 
 * Rewrite the listing 2.2 with PI constant
 */

/*
 * A palavra chave "final" em Java é utilizada para declarar constantes.
 * Por convensão de código, todas as letras de uma constante devem ser em
 * UPPERCASE.
 */

public class ComputeAreaWithConstant {

    public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

        input.close();

    }
}
