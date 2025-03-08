package tauanbenevides.cap_03.listing;

import java.util.Scanner;

/**
 * Lisitng 3.9
 * 
 * Write a program to find out the Chinese Zodiac sign for a given year.
 * 
 * The Chinese Zodiac is based on a 12-year cycle, with each year represented by
 * an animal monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake,
 * horse, or sheep—in this cycle.
 */

public class ChineseZodiac {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: e.g 2003");
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
            default:
                System.out.println("Invalid");

                input.close();
        }
    }
}
