/*
Student: Isabella K

Teacher: Carrario

Period: 2

Description: This program print each trick series squence of the screen
*/

public class TrickySeries {
    public static void main(String[] args) {
        
        System.out.println("\nGroup Z - Example\n");

        for (int i = 0 ; i < 5 ; i++) {
            System.out.print((i*i) + " "); // First group Z series
        }

        System.out.println(); // Adds a between the serieses

        for (int i = 0 ; i < 25 ; i += 4) {
            System.out.print(i + " "); // Second group Z series
        }

        System.out.println();
        System.out.println("\nGroup E - Tricky Series\n");


        for (double i = 1.0; i <= 5.5; i += 0.5) {  // Adds 0.5 to i when it loops
            System.out.print(i + " "); // First group E series
        }

        System.out.println(); // Adds a between the serieses

        for (int i = 1; i <= 2048; i += i) {  // Adds the value of i to itself when it loops
            System.out.print((i) + " "); // Second group E series
        }

        System.out.println(); // Adds a between the serieses
        
        for (int i = 1; i <= 59049; i *= 3) {  // Multiplies i by 3 when it loops
            System.out.print((i) + " "); // Third group E series
        }

        System.out.println(); // Adds a between the serieses

        for (double i = 1000.0; i >= 0.01; i /= 10) {  // Divides i by 10 when it loops
            System.out.print((i) + " "); // Last group E series
        }

        System.out.println(); // Adds a between the serieses

        System.out.println("\nBonus\n");

        int numerator = 0;

        for (int i = 2; i <= 9; i++) {  // i is the denominator 
            numerator++; // Adds 1 to the numerator
            System.out.printf("%d/%d ", numerator, i);
        }

        System.out.println(); // Adds a between the serieses

        int factorial = 1; 

        for (int i = 1; i <= 9; i++) {  // Adds 1 to i when looped until the 9th loop (9!)
            factorial *= i; // Multiplies the factorial by i to get the next number. (ex- 1x2x3 on the third loop)
            System.out.print(factorial + " ");
        }

        System.out.println(); // Adds a between the serieses

        int num = 11; // The number of terms
        int firstNum = 0; // Starts with 0
        int secondNum = 1; // Starts with 1

        for (int i = 0; i < num; i++) {
            System.out.print(secondNum + " "); // The first 2 Fibonacci numbers
            secondNum = firstNum + secondNum; // The next Fibonacci number
            firstNum = secondNum - firstNum; // Continues the firstNum to the secondNum
        }


    } // End of main method
} // End of class
