package tauanbenevides.cap_03.listing;

import java.util.Scanner;

/**
 * Listing 3.1
 * 
 * The program randomly generates two single-digit integers, number1 and
 * number2, and displays to the student a question such as “What is 1 + 7?, ”
 */

public class AdditionQuiz {

    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " +
                number2 + " ? ");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = "
                + answer + " is " + (number1 + number2 == answer));

        input.close();
    }
}
