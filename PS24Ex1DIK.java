import java.util.Scanner;

public class PS24Ex1DIsabellaKrzepton {
    public static void main(String[] args) {
        // Variable declaration and initialization

        Double temperature = 0.0;

        Scanner userInput = new Scanner(System.in); // Initialize the scanner

        // User Input

        System.out.println("Please enter a temperature in Fahrenheit to convert: ");
        temperature = userInput.nextDouble();

        // Program output

        System.out.printf("The temperature in Celsius is %.1f degrees.", ((5.0/9.0) * (temperature - 32)));
    }
}
