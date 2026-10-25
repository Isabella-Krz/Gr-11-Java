/*
Student: Isabella K

Teacher: Carrario

Description: This code contains...
*/

import java.util.Scanner; // Import the scanner

public class PS24Ex1AIsabellaKrzepton {
    public static void main(String[] args) {
        // Variable declaration and initialization

        double pi = 3.14159;

        double radius = 0.0;

        Scanner userInput = new Scanner (System.in); // Creates the variable userInput to Initializes the scanner

        // User input

        System.out.println("Please enter the radius of the circle: ");
        radius = userInput.nextDouble();

        // Program output

        System.out.printf("The circumference of a circle with a radius of %.1f is %.2f", radius, (2 * pi * radius));
    }
}