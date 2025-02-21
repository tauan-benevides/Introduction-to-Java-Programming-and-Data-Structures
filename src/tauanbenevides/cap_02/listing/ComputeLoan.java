package tauanbenevides.cap_02.listing;

import java.util.Scanner;

/**
 * Listing 2.9
 * 
 * This program computes loan payments.
 */

/*
 * O programa deve satisfazer os seguintes requisitos:
 * 
 * - Deve permitir que o usuário insira a taxa de juros, o valor do empréstimo e
 * o número de anos para os quais os pagamentos serão feitos.
 * 
 * - Deve calcular e exibir o pagamento mensal e os valores totais de pagamento.
 * 
 * A saída é o pagamento mensal e o pagamento total, que podem ser obtidos
 * usando as seguintes fórmulas:
 * 
 * monthlyPayment = (loanAmount * monthlyInterestRate) / 1 - (1/ (1 +
 * monthlyInterestRate)^numberOfYears*12)
 * 
 * totalPayment = monthlyPayyment * numberOfYears * 12
 */

public class ComputeLoan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the annual interest rate in percentage, e.g., 7.25: ");
        double annualInterestRate = input.nextDouble();

        // Converte a taxa anual (%) para a taxa mensal (decimal)
        // Converte taxa anual para taxa mensal
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        System.out.println("Enter the number of years as an integer, e.g., 5: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter the loan amount, e.g., 120000.95: ");
        double loanAmount = input.nextDouble();

        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);

        input.close();
    }
}
