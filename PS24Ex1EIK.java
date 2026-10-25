/*
Student: Isabella K

Teacher: Carrario

Description: This code asks the user to input an integer value and finds the cubed value of that integer
*/

import java.util.Scanner;

public class PS24Ex1EIsabellaKrzepton {
    public static void main(String[] args) {
        // Variable declaration and initialization

        int value1 = 0;

        Scanner userInput = new Scanner(System.in); // Initialize the scanner

        // User Input

        System.out.println("Please enter an integer number between 1 and 10, inclusively: ");
        value1 = userInput.nextInt();

        // Program output

        System.out.printf("The cube of %d is %d", value1, (value1 * value1 * value1));
    }
}
