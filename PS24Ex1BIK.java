import java.util.Scanner;

public class PS24Ex1BIsabellaKrzepton {
    public static void main (String[] args) {
        // Variable declaration and initialization

        double pi = 3.14159;

        int radius = 0;

        Scanner userInput = new Scanner (System.in);// Initialize the scanner

        // User Input

        System.out.println("Please enter an integer number for the radius of a sphere: ");

        radius = userInput.nextInt();

        // Program output

        System.out.printf("A sphere with radius %d has \nVolume = %.3f units^3 \n5Surface Area = %.3f units^2", radius, ((4/3) * pi * radius * radius * radius), (4 * pi * radius * radius));
    }
}