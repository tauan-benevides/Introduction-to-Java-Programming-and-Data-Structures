package tauanbenevides.cap_04.listing;

import java.util.Scanner;

/**
 * Listing 4.3
 * <p>
 * Listing 4.3 gives a program that prompts the user to answer whether the day
 * is in Set1, Set2, Set3, Set4, and in Set5.
 * If the number is in the set, the program adds the first number
 * in the set to `day`.
 */

public class GuessBirthday {

    public static void main(String[] args) {

        String set1 =
                " 1 3 5 7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31\n";

        String set2 =
                " 2 3 6 7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31\n";

        String set3 =
                " 4 5 6 7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31\n";

        String set4 =
                " 8 9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31\n";

        String set5 =
                "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31\n";

        int day = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Is your birthday in Set1?\n");
        System.out.println(set1);
        System.out.println("\n Enter 0 for Not and 1 for Yes: ");
        int answer = input.nextInt();

        if (answer == 1) {
            day += 1;
        }

        System.out.println("Is your birthday in Set2?\n");
        System.out.println(set2);
        System.out.println("\n Enter 0 for Not and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            day += 2;
        }

        System.out.println("Is your birthday in Set3?\n");
        System.out.println(set3);
        System.out.println("\n Enter 0 for Not and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            day += 4;
        }

        System.out.println("Is your birthday in Set4?\n");
        System.out.println(set4);
        System.out.println("\n Enter 0 for Not and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            day += 8;
        }

        System.out.println("Is your birthday in Set5?\n");
        System.out.println(set5);
        System.out.println("\n Enter 0 for Not and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1) {
            day += 16;
        }

        System.out.println("\n Your birthday is " + day + "!");
        input.close();
    }
}
