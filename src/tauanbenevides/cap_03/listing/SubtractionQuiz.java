package tauanbenevides.cap_03.listing;

import java.util.Scanner;

/**
 * Listing 3.3
 * 
 * The program randomly generates two single-digit integers,
 * number1 and number2, with number1 >= number2,
 * and it displays to the student a question such as “What is 9 - 2?”
 * 
 * After the student enters the answer, the program displays a message
 * indicating whether it is correct.
 */

public class SubtractionQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("What is " + number1 + " - " + number2 + " ? ");
        int answer = input.nextInt();

        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("You answer is wrong. ");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }

        input.close();
    }
}
