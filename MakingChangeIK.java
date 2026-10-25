/*
Student: Isabella K

Teacher: Carrario

Period: 2

Description: This code asks the user how much an item from the vending machine costs, between 2 cents and $1, and gives the user their change for that amount as if they gave the machine a $1 and what coins the vending machine will give back
*/

import java.util.Scanner; // Imports the scanner

public class MakingChangeIsabellaKrzepton {
    public static void main(String[] args) {
        // Variable declaration and initialization

        Scanner userInput = new Scanner (System.in); // Initialize the scanner

        int price, change = 0; // Variables needs to determine how much change the user gets back from $1

        // User input

        System.out.println("You have 1 dollar.");

        System.out.print("Please enter a product amount between 2 cents and 1 dollar as an integer in order to calculate your change. For example, enter 25 for 25 cents or 1 for a dollar. "); 
        price = userInput.nextInt(); // Asks the user to input the cost of the product

        // Program execution

        if (price == 1) {
            System.out.println("\nYou get no change. Your item cost a dollar."); // If the user pays $1
        } else if (price >= 2 && price <= 99) {
            // If the price is valid (between 2 and 99 cents), calculate the change
            change = 100 - price; // Calculates the change starting from $1

            System.out.printf("\nYour change is %d cents and you will get back:\n", change); // Displays the amount of change the user gets back

            System.out.printf("%d quarter(s)\n", change / 25); // How many times 25 fits into the change (using integer division instead of the remainder; change % 25 gives you 18 instead of 3)
            System.out.printf("%d dime(s)\n", (change % 25) / 10); // Remaining change from the live above divided by 10
            System.out.printf("%d nickel(s)\n", (change % 25 % 10) / 5); // Remaining change from the live above divided by 5
            System.out.printf("%d penny(s)\n", change % 5); // Leftover change
        } else {
            System.out.printf("\nYour product cost is out of range."); // If the cost is out of range (invalid)
        }
    } // End of main method
} // End of class
