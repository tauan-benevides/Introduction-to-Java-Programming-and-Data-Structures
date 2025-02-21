package tauanbenevides.cap_02.listing;

/**
 * Listing 2.1
 * 
 * The algorithm for calculating the area of a circle:
 * area = radius * radius * PI
 */

public class ComputeArea {

    public static void main(String[] args) {

        double radius = 20;

        double area = radius * radius * 3.141599;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
