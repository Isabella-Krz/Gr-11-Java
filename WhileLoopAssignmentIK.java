/*
Student: Isabella K

Teacher: Carrario

Period: 2

Description: This program is a two option menu where if you select 1, you will repeat a word for a desired number of times and then return to the main menu, and if you select 2 you exit will exit the program
*/

import java.util.Scanner; // Import the scanner

public class WhileLoopAssignmentIsabellaKrzepton {
    public static void main(String[] args) {
        // Variable declaration and initialization

        Scanner userInput = new Scanner (System.in); // Initializes the scanner

        int selection = 0; // Selection to repeat or exit
        int count = 0; // Count variable
        String word = "";
        int numOfRepeats = 0;

        // If the selection is not 2, the loop loops again
        while (selection != 2) {
            System.out.println("Please make a selection.");

            System.out.println("    1. Repeat a word");
            System.out.println("    2. Exit this program");

            selection = userInput.nextInt(); // The user makes their selection, 1 to repeat and 2 to exit

            if (selection == 1) { 
                // The user inputs a word and the number of repetitions
                System.out.print("Please enter a word to repeat: ");
                word = userInput.next(); // User inputs a word

                // The user inputs the number of times they want it to repeat
                System.out.print("Please enter how many times you want it to repeat: ");
                numOfRepeats = userInput.nextInt(); // User inputs a number

                while (count < numOfRepeats) { // Repeats the word starting from 0 (count) to the number of repeats
                    System.out.println(word); 
                    count++; // Increments the counter
                }

            } else if (selection == 2) {
                System.out.println("Goodbye."); // Exit message
            } else {
                System.out.println("Invalid selection."); // Invalid selection
            }
        }

    } // End of main method
} // End of class