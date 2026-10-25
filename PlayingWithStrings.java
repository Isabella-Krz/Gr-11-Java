public class PlayingWithStrings {
    public static void main(String[] args) {
        // Variable initialization and declaration

        String message = "Gru is an evil mastermind turned super hero and his minions like bananas!";

        // Task 1
        System.out.println("Task 1: Length of message: " + message.length());

        // Task 2
        System.out.println("Task 2: Characters before \"super\": " + message.indexOf("super"));

        // Task 2
        System.out.println("Task 2: Characters after \"super\": " + (message.substring(38)).length());

        // Task 4
        System.out.println("Task 4: Index of \"minions\": " + message.indexOf("minions"));

        // Task 5
        
        // Tracks the start point of each word
        int start = 0;
        
        // Counts the amount of words
        int wordCount = 0;
        
        // Stores the word in the loop
        String word = "";
        
        // Use print instead of println so every second word will be printed after
        System.out.print("Task 5: Every second word: ");
        
        // Goes through every word in the sentence
        while (start < message.length()) {

            // The index of the next space after the word
            int end = message.indexOf(" ", start);
            
            // -1 when there's no more space (last word)
            if (end == -1) {
                // The rest of the string as the last word
                word = message.substring(start);
                
                // End the loop by setting start to the length of the string
                start = message.length();
            } else {
                // Word between start and the next space
                word = message.substring(start, end);
                
                // Moves start (cursor) to after the space
                start = end + 1;
            }
            
            // Increment the counter
            wordCount++;
            
            // % 2 checks if the word count is in an even position
            if (wordCount % 2 == 0) {
                // Prints the word with a new space in front of it
                System.out.print(word + " ");
            }
        }
    }
}