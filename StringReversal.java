import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
         // Variable declarations and initializations
        Scanner userInput = new Scanner(System.in); // Initialize the scanner
        String sentence = ""; // User input
        String reversedSentence = ""; // Reverse of the sentence
        int i = 0; // Loop counter variable

        // Asks the user to enter a block of text
        System.out.print("Please enter a block of text with 5 sentences: ");
        sentence = userInput.nextLine(); // User inputs a block of text


        /*
        This for loop goes through the input string in reverse order:
         
        i = sentence.length() - 1 // Start at the last character (since index starts at 0)
        i >= 0 // Keep looping until you reach the first character
        i-- // Move one character left (decrease index by 1 each time)
        
        Inside the loop, each character from the end of the sentence to the beginning of the 'reversedSentence' string.
        */

        // Loop through the sentence from the last character to the first
        for (i = sentence.length() - 1; i >= 0; i--) {
            reversedSentence += sentence.charAt(i); // Add each character to the result string in reverse order
        }

        // Output the reversed sentence
        System.out.println("Reversed: " + reversedSentence);
    }
}