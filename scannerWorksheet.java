import java.util.Scanner;

public class scannerWorksheet {
    public static void main(String[] args) {
        int num1 = 0;
        double num2 = 0.0;
        String word = "";
        String phrase = "";

        Scanner userInput = new Scanner (System.in);

        // Code from the worksheet here



        // Question 1

        System.out.print ("Please provide an input: ");
        num1 = userInput.nextInt(); //Enter the 55 when the program is run
        
        /* Observations: When the number is inputed, the output is:
        num 1 = 55
        num 2 = 0.0
        word = 
        phrase = 

        55 is kept as an int because .nextInt() always outputs, and 55 was origionally an int
        */

        // Question 2

        System.out.print ("Please provide an input: ");
        num2 = userInput.nextDouble(); //Enter the 55.5 when the program is run

        /* Observations: When the number is inputed, the output is:
        
        Keeps it as an int
        */

        // Question 3

        System.out.print ("Please provide an input: ");
        num2 = userInput.nextDouble(); //Enter the 55 when the program is run

        /* Observations: When the number is inputed, the output is:
       
        Turns it into an int
        */

        //Question 4

        System.out.print ("Please provide an input: ");
        word = userInput.next(); //Enter "bird is the word" when the program is run

        /* Observations: When the number is inputed, the output is:
        This part of the output:

        word = bird is the word

        bird is the words is kept as a string because .next() outputs a string when output
        */

        // Question 5

        System.out.print("Please provide an input: ");
        phrase = userInput.nextLine();

        /* Observations: When the number is inputed, the output is:
        Output:

        num 1 = 0
        num 2 = 0.0
        word = 
        phrase = bird is the word

        */

        // Question 6

        System.out.print("Please provide an input: ");
        word = userInput.next();
        //when you run the program enter "bird"
        System.out.print("Please provide an input: ");
        num1 = userInput.nextInt();
        //when you run the program enter 22

        /* Observations: When the number is inputed, the output is:
        Output:

        Please provide an input: bird
        Please provide an input: 22
        num 1 = 22
        num 2 = 0.0
        word = bird
        phrase = 

        .next() returns the next token taken by the scanner, and .nextInt() does the same but only for ints
        */

        //Question 7

        System.out.print("Please provide an input: ");
        word = userInput.nextLine();
        //when you run the program enter "bird"
        System.out.print("Please provide an input: ");
        num1 = userInput.nextInt();
        //when you run the program enter 2

        /* Observations: When the number is inputed, the output is:
        Output:

        Please provide an input: bird
        Please provide an input: 2
        num 1 = 2
        num 2 = 0.0
        word = bird
        phrase = 

        Same thing as before I guess?
        */

        //Question 8

        System.out.print("Please provide an input: ");
        word = userInput.next();
        //when you run the program enter "Bird is the word"
        System.out.print("Please provide an input: ");
        word = userInput.next();
        System.out.print("Please provide an input: ");
        phrase = userInput.nextLine();

        /* Observations: When inputed, the output is:
        Output:

        Please provide an input: bird is the word
        Please provide an input: Please provide an input: num 1 = 0
        num 2 = 0.0
        word = is
        phrase =  the word

        Weird spaces I guess because of the .next() instead of .nextline
        */






        // Worksheet code ends here

        System.out.println ("num 1 = " + num1);
        System.out.println ("num 2 = " + num2);
        System.out.println ("word = " + word);
        System.out.println ("phrase = " + phrase);
    }
}
