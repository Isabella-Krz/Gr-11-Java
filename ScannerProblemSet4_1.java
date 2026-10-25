/**
 * Below you will find comments with instructions to complete code in this instructional
 * program. You will need to slowly work though this line by line. There are pre written
 * lines of code to uncomment. Make sure you watch out for those. After this self-guided
 * mini-tutorial you should have a grasp of collecting basic user input.
 * 
 * Recall the following:
 * .nextLine(); <-- takes all input up to the enter key and returns it all as a String type
 * .next(); <-- takes input and returns everything up to the first space or enter key, whichever
 *              comes first, as a String.
 * .nextInt(); <-- takes input and returns everything up to the first space or enter key,
 *               whichever comes first, as an integer type.
 * .nextDouble(); <-- takes input and returns everything up to the first space or enter key,
 *                    whichever comes first, as a double type.
 */



// import the Scanner class
import java.util.Scanner;

class ScannerProblemSet4_1 {
    public static void main(String[] args) {
    
        //create a reference variable called userInput and instantiate it using the new keyword
        Scanner userInput = new Scanner (System.in);

        //create an integer variable called intNum
        int intNum = 0;

        //create a double variable called dblNum
        double dblNum = 0.0;

        //create a String variable called word
        String word = "";

        //create a String variable called sentence
        String sentence = "";

//---------------------------------------------------------------------

/* 

Run 1 works, the output being:
Please enter a sentence.
Java is fun. But it's more fun with the Scanner.
sentence contains: Java is fun. But it's more fun with the Scanner.

Run 2 also runs because the code can convert a number (an int) to a string, and concatenates (not adds) 1 to the end of the string:
When 2 is run, the output is:
Please enter a sentence.
2
21

*/

        System.out.println("Please enter a sentence.");

        // assign sentence to a scanner input that returns all the words you enter.
        // sentence = userInput.nextLine();


        //Run the code twice.
        //Run 1. Uncomment the next line and enter the sentence: "Java is fun. But it's more fun with the Scanner." Record if the print statement runs.
        // System.out.println("sentence contains: " + sentence);

        //Run 2. Enter a number and uncomment the next line of code. Does the print statement above run? What error does the next line produce?

        // System.out.println(sentence + 1);

//---------------------------------------------------------------------
        
/* 

Run 1 works. The output is:
Please enter a word.
Java
word contains: Java

Run 2 does run, but only shows the first word in the sentance. This is because .next() looks for the first space or enter key, and since there is a space after the first word, it only runs what is between the first character and the first space.
The output for this code is:
Please enter a word.
Learning Java takes time and practice.
word contains: Learning

*/

        System.out.println("Please enter a word.");

        //assign word to a scanner input that returns only one word.
        // word = userInput.next();

        //Run the code twice.
        //Run 1. Uncomment the next line of code and enter the word "Java" andRecord if the print statement runs.
        // System.out.println("word contains: " + word);

        //Run 2. Enter the sentence, "Learning Java takes time and practice." and uncomment the next line of code. Does the print statement run? What prints out? Why do you think that is?

        // System.out.println("word contains: " + word);


//----------------------------------------------------------------------
        
/* 

Run 1 runs properly when an integer is inputted.
When the integer 2 is run, the output is:
Please enter an integer.
2
intNum = 2

Run 2 does not run with a letter since a letter is a string type not a integer (thus the java.util.InputMismatchException).
The error message is: 
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at ScannerProblemSet4_1.main(ScannerProblemSet4_1.java:120)

*/

        System.out.println("Please enter an integer.");

        //assign intNum to a scanner input
        // intNum = userInput.nextInt();
        
        //run the code twice.
        //Run 1. Enter an integer properly. Record if the next print statement runs.
        //Run 2. Enter a letter when it asks for an integer. Record the error message.

        // System.out.println("intNum = " + intNum);
 
//----------------------------------------------------------------------
    
/* 

Run 1 runs the floating point number properly.
The output if 2.2 is inputted is:
Please enter a floating point number.
2.2
dblNum = 2.2

Run 2 does not run because a letter is a string type, not a double (thus the java.util.InputMismatchException).
The error message is:
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
        at ScannerProblemSet4_1.main(ScannerProblemSet4_1.java:153)

Run 3 runs when an integer is input, since the code converts the integer to a double by adding .0 to the end.
When 2 is input, the output is:
Please enter a floating point number.
2
dblNum = 2.0

*/

        System.out.println("Please enter a floating point number.");

        //assign dblNum to a scanner input
        // dblNum = userInput.nextDouble();
        
        //run the code three times.
        //Run 1. Enter a floating point number properly. Record if the next print statement runs.
        //Run 2. Enter a letter when it asks for a floating point. Record the error message.
        //Run 3. Enter an integer when it asks for a floating point. What is the output?

        // System.out.println("dblNum = " + dblNum);
    
    }
}