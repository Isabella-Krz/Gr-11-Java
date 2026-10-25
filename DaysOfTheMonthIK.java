/*
Student: Isabella K

Teacher: Carreiro

Period: 2

Description: This program will ask the user for a year and month of that year, and will output to the user the number of days in that month or output whether it is a leap year when "February" is inputted.
*/

import java.util.Scanner; // Import the scanner

public class DaysOfTheMonthIsabellaKrzepton {
    public static void main (String args[]) {
        // Variable declaration and initialization

        Scanner userInput = new Scanner (System.in); // Initializes the Scanner

        int year = 0;
        String month = "";

        int numOfDays = 0; // The number of days based off of the month

        boolean validMonth = false; // For the cases later, checks if the month is valid (from January - December). Starts off false so the later while loop runs

        // User Input

        // Checks for valid input for years
        // Starts with true, so it only breaks out of the loop if it does not run the else statement
        while (true) {
            System.out.println("Please enter a year: "); // Asks the user to enter a year
            if (userInput.hasNextInt()) { // .hasNextInt() checks if the input is an integer. If it is not it runs the else statement. I found .hasNextInt() at: https://www.w3schools.com/java/ref_scanner_hasnextint.asp
                year = userInput.nextInt();
                if (year > 0) { // Checks if the year is a postive number and not 0
                    break; // If yes, runs the next line
                } else {
                    System.out.print("Invalid entry. ");
                }
            } else {
                System.out.print("Invalid entry. "); // If the user inputs something other than an integer, than it is invalid
                userInput.next(); // Asks for input again
            }
        }

        // Program execution

        // If it is not a valid month, it loops, but if it is valid, it stops (if false, it loops, if true, it does not)
        while (!validMonth) {
            System.out.println("Please enter a month (eg. January): ");
            month = userInput.next();

            switch (month) { // Checks each month for the number of days in that month
                case "January":
                    numOfDays = 31;
                    validMonth = true;
                    break;
                case "February":
                    // % checks if it is a leap year by checking if the year is evenly divisible by 4
                    if (year % 400 == 0) {
                        System.out.println("It's a leap year!");
                        numOfDays = 29;
                    } else if (year % 4 == 0 && year % 100 != 0) {  // % checks if it is a leap year by checking the year is divisible by 4 and not divisible by 100
                        System.out.println("It's a leap year!");
                        numOfDays = 29;
                    } else {
                        System.out.println("It's not a leap year.");
                        numOfDays = 28;
                    }
                    validMonth = true;
                    break;
                case "March":
                    numOfDays = 31;
                    validMonth = true;
                    break;
                case "April":
                    numOfDays = 30;
                    validMonth = true;
                    break;
                case "May":
                    numOfDays = 31;
                    validMonth = true;
                    break;
                case "June":
                    numOfDays = 30;
                    validMonth = true;
                    break;
                case "July":
                    numOfDays = 31;
                    validMonth = true;
                    break;
                case "August":
                    numOfDays = 31;
                    validMonth = true;
                    break;
                case "September":
                    numOfDays = 30;
                    validMonth = true;
                    break;
                case "October":
                    numOfDays = 31;
                    validMonth = true;
                    break;
                case "November":
                    numOfDays = 30;
                    validMonth = true;
                    break;
                case "December":
                    numOfDays = 31;
                    validMonth = true;
                    break;
                default:
                    System.out.println("Invalid month.");
            }
        }

        // Program output

        System.out.printf("%s %d has %d days.", month, year, numOfDays); // Final output

    } // End of main method
} // End of class