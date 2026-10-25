import java.util.Scanner;

public class PS24Ex1CIsabellaKrzepton {
    public static void main(String[] args) {

        // Variable declaration and initialization

        Double costOfItem = 0.0;

        Scanner userInput = new Scanner (System.in); // Initialize the scanner

        // User Input

        System.out.println("Please enter the cost of the item: ");
        costOfItem = userInput.nextDouble();

        // Program output

        System.out.printf("The tax on an item that costs %.2f is %.2f and total cost is %.2f.", costOfItem, (0.13 * costOfItem), (1.13 * costOfItem));
    }
}
