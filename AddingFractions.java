import java.util.Scanner;

public class AddingFractions {
    public static void main(String[] args) {

        // Variable declaration and initialization

        int numerator1 = 0;
        int denominator1 = 0;
        int numerator2 = 0;
        int denominator2 = 0;

        Scanner userInput = new Scanner(System.in);

        // User input

        System.out.printf("What is the numerator of the first fraction? ");
        numerator1 = userInput.nextInt();

        System.out.printf("What is the denominator of the first fraction? ");
        denominator1 = userInput.nextInt();

        System.out.printf("What is the numerator of the second fraction? ");
        numerator2 = userInput.nextInt();

        System.out.printf("What is the denominator of the second fraction? ");
        denominator2 = userInput.nextInt();

        // Program output

        System.out.printf("The sum of %d/%d + %d/%d = %d/%d", numerator1, denominator1, numerator2, denominator2, (numerator1 * denominator2) + (denominator1 * numerator2), (denominator1 * denominator2));
    }
}
