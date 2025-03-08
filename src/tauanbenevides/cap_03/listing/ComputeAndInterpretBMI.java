package tauanbenevides.cap_03.listing;

import java.util.Scanner;

/**
 * Lisitng 3.4
 * 
 * Write a program that prompts the user to enter a weight in pounds and height
 * in inches and displays the BMI.
 * 
 * Note that one pound is 0.45359237 kilograms, and one inch is 0.0254 meters.
 * 
 * It can be calculated by taking your weight in kilograms and dividing it by
 * the square of your height in meters.
 */

public class ComputeAndInterpretBMI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        System.out.println("Enter weight in pounds: ");
        double wightInPound = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilograms = wightInPound * KILOGRAMS_PER_POUND;
        double heightInMeters = heightInInches * METERS_PER_INCH;

        double IBM = weightInKilograms / (Math.pow(heightInMeters, 2));
        System.out.println("IBM is: " + IBM);

        if (IBM < 18.5) {
            System.out.println("Underweight");
        } else if (IBM >= 18.5 && IBM < 25.0) {
            System.out.println("Normal");
        } else if (IBM >= 25.0 && IBM < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();

    }
}
