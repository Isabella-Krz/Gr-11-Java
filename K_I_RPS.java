/*
Student: Isabella K

Teacher: Carrario

Period: 2

Description: This program is a Rock Paper Scissors Lizard Spock game. The first player to reach 5 wins wins the overall game. If that isn’t the case, the game continues until either the computer or the player has won by two.
*/

import java.util.Scanner;

public class Krzepton_Isabella_RPS {
    public static void main(String[] args) {
        // Variable initialization and declaration
        Scanner userInput = new Scanner(System.in); // Initialize the scanner

        String userName = "";

        int userSelection = 0; // The user's selection of rock, paper, scissors, lizard or spock.
        int randomNumComp = 0; // The computer's random number

        int userScore = 0;
        int compScore = 0;

        int userWins = 0;
        int compWins = 0;

        boolean playAgain = true; // For playing again
        String playAgainChoice = ""; // Asks the user if they want to play again later

        // User Input

        System.out.print("Please enter your name: ");
        userName = userInput.nextLine(); // The user inputs their name

        System.out.printf("\nWelcome %s to Rock, Paper, Scissors, Lizard, Spock! First one to 5 wins or has won by 2 wins, wins the overall game. Good luck!\n", userName); // Explaining the game

        // Main game loop

        //       True
        while (playAgain) { // While the player wants to play again, or it is the first game
            // Reset scores for each new game
            userScore = 0;
            compScore = 0;

            // First user selection prompt, checks for valid input
            System.out.printf("\nType 1 for rock, 2 for paper, 3 for scissors, 4 for lizard, and 5 for spock: ");
            userSelection = userInput.nextInt(); // The user inputs their selection

            if (userSelection >= 1 && userSelection <= 5) { // Checks if the selection is valid
                // Game loops until one player reaches 5 wins or wins by 2
                while (userWins <= 5 && compWins <= 5 && Math.abs(userWins - compWins) < 2) {

                    randomNumComp = (int)(Math.random() * 5 + 1); // The computer's random number between 1 and 5

                    if (userSelection == 1 && (randomNumComp == 3)) {
                        userScore++;
                        System.out.println("Rock crushes scissors. You get a point!\n");
                    } else if (userSelection == 1 && (randomNumComp == 4)) {
                        System.out.println("Rock crushes lizard. You get a point!\n");
                        userScore++;
                    } else if (userSelection == 2 && (randomNumComp == 1)) {
                        System.out.println("Paper covers rock. You get a point!\n");
                        userScore++;
                    } else if (userSelection == 2 && (randomNumComp == 5)) {
                        System.out.println("Paper disproves spock. You get a point!\n");
                        userScore++;
                    } else if (userSelection == 3 && (randomNumComp == 2)) {
                        System.out.println("Scissors cuts paper. You get a point!\n");
                        userScore++;
                    } else if (userSelection == 3 && (randomNumComp == 4)) {
                        System.out.println("Scissors decapitates lizard. You get a point!\n");
                        userScore++;
                    } else if (userSelection == 4 && (randomNumComp == 2)) {
                        System.out.println("Lizard eats paper. You get a point!\n");
                        userScore++;
                    } else if (userSelection == 4 && (randomNumComp == 5)) {
                        System.out.println("Lizard poisons spock. You get a point!\n");
                        userScore++;
                    } else if (userSelection == 5 && (randomNumComp == 1)) {
                        System.out.println("Spock Vaporizes rock. You get a point!\n");
                        userScore++;
                    } else if (userSelection == 5 && (randomNumComp == 3)) {
                        System.out.println("Spock smashes scissors. You get a point!\n");
                        userScore++;
                    } else if (randomNumComp == 1 && (userSelection == 3)) {
                        System.out.println("Sorry, rock crushes scissors. The computer gets a point!\n");
                        compScore++;
                    } else if (randomNumComp == 1 && (userSelection == 4)) {
                        System.out.println("Sorry, rock crushes lizard. The computer gets a point!\n");
                        compScore++;
                    } else if (randomNumComp == 2 && (userSelection == 1)) {
                        System.out.println("Sorry, paper covers rock. The computer gets a point!\n");
                        compScore++;
                    } else if (randomNumComp == 2 && (userSelection == 5)) {
                        System.out.println("Sorry, paper disproves spock. The computer gets a point!\n");
                        compScore++;
                    } else if (randomNumComp == 3 && (userSelection == 2)) {
                        System.out.println("Sorry, scissors cuts paper. The computer gets a point!\n");
                        compScore++;
                    } else if (randomNumComp == 3 && (userSelection == 4)) {
                        System.out.println("Sorry, scissors decapitates lizard. The computer gets a point!\n");
                        compScore++;
                    } else if (randomNumComp == 4 && (userSelection == 2)) {
                        System.out.println("Sorry, lizard eats paper. The computer gets a point!\n");
                        compScore++;
                    } else if (randomNumComp == 4 && (userSelection == 5)) {
                        System.out.println("Sorry, lizard poisons spock. The computer gets a point!\n");
                        compScore++;
                    } else if (randomNumComp == 5 && (userSelection == 1)) {
                        System.out.println("Sorry, spock Vaporizes rock. The computer gets a point!\n");
                        compScore++;
                    } else if (randomNumComp == 5 && (userSelection == 3)) {
                        System.out.println("Sorry, spock smashes scissors. The computer gets a point!\n");
                        compScore++;
                    } else if (userSelection == randomNumComp) {
                        System.out.println("It's a tie, no one gets a point!\n");
                    } else {
                        System.out.println("Invalid selection, please pick 1 for rock, 2 for paper, 3 for scissors, 4 for lizard, and 5 for spock. No one gets a point.\n");
                    }

                    // Checks for round winner
                    if (userScore == 3) {
                        System.out.println("You get a win!\n");
                        userWins++;
                    } else if (compScore == 3) {
                        System.out.println("Sorry, the computer gets a win!\n");
                        compWins++;
                    }

                    // Resets the scores after every win
                    if (userScore == 3 || compScore == 3) {
                        userScore = 0;
                        compScore = 0;
                    }

                    // The if statement makes sure it doesn't repeat after someone has won
                    if ((userWins <= 5 || compWins <= 5) && Math.abs(userWins - compWins) < 2) {
                        // Asks user for their selection after each round
                        System.out.printf("Type 1 for rock, 2 for paper, 3 for scissors, 4 for lizard, and 5 for spock: ");
                        userSelection = userInput.nextInt(); // The user inputs their selection again
                    }
                }

                // Win/ lose
                if (userWins > compWins) {
                    System.out.printf("\n%s, you won. Congratulations!", userName);
                    System.out.printf("\n%s, you won %d games to %d. ", userName, userWins, compWins); // Display the total score
                } else {
                    System.out.printf("\n%s, you lost. Better luck next time!", userName);
                    System.out.printf("\n%s, you lost %d games to %d. ", userName, userWins, compWins); // Display the total score
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number between 1 and 5.");
            }

            // Ask if the user wants to play again
            System.out.print("\nWould you like to play again (y/n): ");
            playAgainChoice = userInput.next(); // Use next() to get the input as a word
                    
            // I found the .equals() method online (at https://www.w3schools.com/java/ref_string_equals.asp) even though we didn't learn it in class since it works better with strings than ==

            if (playAgainChoice.equals("y")) { 
                playAgain = true;
                userWins = 0;  // Resets total wins
                compWins = 0;  // Resets total wins
            } else if (playAgainChoice.equals("n")) {
                playAgain = false;  // Does not play again
            } else {
                System.out.print("\nInvalid selection! Type y for yes or n for no: ");
                playAgainChoice = userInput.next(); // Use next() to get the input as a word
            }
        }
        System.out.println("Thank you for playing! Please play again soon!");
    }
}