import java.util.Scanner;

public class GoJagsGo {
    public static void main(String[] args) {
        // Variable declaration and initialization

        // Initialize the scanner
        Scanner userInput = new Scanner (System.in); 

        String originalMessage = "go jags go";

        // User input variables
        String oldWord = "";
        String newWord = "";

        // Starting position of each word for the loop
        int start = 0;
        // New message that is replaced
        String newMessage = "";

        // User Input

        System.out.println("Welcome to search and replace.");
        System.out.println("Original message: " +  originalMessage);

        System.out.println("");

        System.out.print("Which word would you like to replace? ");
        oldWord = userInput.next(); // Replace go

        System.out.println("");

        System.out.print("Which word would you like to replace it with? ");
        newWord = userInput.next(); // Replace with yes

        System.out.println("");

        // Program execution

        // Loop through every word in the message
        while (start < originalMessage.length()) {
            int end = originalMessage.indexOf(" ", start);

            // -1 will happen when there are no more spaces, so when that happens, it will set end to the end of the message
            if (end == -1) {
                end = originalMessage.length();
            }

            // Get the current word
            String word = originalMessage.substring(start, end);

            // Check if the current word is the oldWord
            if (word.equals(oldWord)) {
                // Adds the new word to the message
                newMessage = newMessage + newWord;
            } else {
                // If it isn't the right word, the original word is just added back to the message (nothing changes)
                newMessage = newMessage + word;
            }

            // Adds a space unless it is the last word (uses .length() to check if it is the last word)
            if (end < originalMessage.length()) {
                newMessage += " ";
            }

            // Moves start to the character after the current word (adds one to the index number of the ending index number of the word meaning it moves the cursor from the current word over to next one)
            start = end + 1;
        }

        // System output
        
        // Prints out the new message
        System.out.print(newMessage);
    }
}