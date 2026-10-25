/*
Student: Isabella K

Teacher: Carrario

Period: 2

Description: This code calculates the monthly payment on a loan using the amounts specificed by the user's input.
*/

import java.util.Scanner;

public class MonthlyPaymentCalculatorIsabellaKrzepton {
    public static void main(String[] args) {
        // Variable declaration and initialization

        Scanner userInput = new Scanner (System.in); // Initialize the Scanner

        double monthlyPayment = 0.0; // Payment formula

        // Payment variables
        double principalAmount = 0.0;
        int numberOfYears = 0;
        int numberOfMonths = 0;
        double yearInterest = 0.0;
        double monthInterest = 0.0;
        
        // User input

        System.out.print("Please enter the principal amount of the product you would like to buy: ");
        principalAmount = userInput.nextDouble(); // Asks the user the cost of the product

        System.out.print("Please enter the number of years the loan will be used for: ");
        numberOfYears = userInput.nextInt(); // Asks the user the number of years for the loan

        System.out.print("Please enter the yearly interest for the product: ");
        yearInterest = userInput.nextDouble(); // Asks the user the yearly interest

        // Program execution

        monthInterest = (yearInterest / 100) / 12; // Monthly interest
        numberOfMonths = numberOfYears * 12; // Number of years in months

        monthlyPayment = principalAmount * monthInterest / (1 - Math.pow((1 + monthInterest), (numberOfMonths * -1))); // Formula for the monthly payment

        // Program output

        System.out.printf("For the amount of $%.2f at a %.2f%% per year for %d years, the monthly payment will be $%.2f", principalAmount, yearInterest, numberOfYears, monthlyPayment); // Displays to the user their monthly payment as weel as their principal amount, interest, and number of years for the loan
    }
}
