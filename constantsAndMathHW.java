import java.util.Scanner;

public class constantsAndMathHW {
    public static void main(String[] args) {

        // Excercise 1

        System.out.println("Area of circle with radius 5 = " + Math.PI*5*5 + "cm squared");
        System.out.println("Math.PI = " + Math.PI);

        /*
        a) Output:
           Area of circle with radius 5 = 78.53981...cm squared
           Math.PI = 3.14159...

        b) PI is equal to 3.141592653589...

        c) If you are using a version of Java after version 8, the java.lang.Math import statement can be deleted
        */

        // Excercise 2

        // ---- Math.PI = 3.141592653589 ..... --
        System.out.printf("PI is: %f \n", Math.PI);

        // -----  Math.pow(base, exponent) ---------
        System.out.printf("2 to the power of 3 = %f \n", Math.pow(2,3));

        // ------ Math.abs(number) makes 'number' positive ----------------
        System.out.printf("Absolute value of -5 = %d \n", Math.abs(-5));
        System.out.printf("Absolute value of -5.5 = %f \n", Math.abs(-5.5));

        // -------Math.max(num1, num2) returns the bigger number ------
        System.out.printf("The max is = %d \n", Math.max(15, 10));
        System.out.printf("The max is = %f \n", Math.max(15.52, 15.55));

        // -------Math.min(num1, num2) returns the smaller number ------
        System.out.printf("The min is = %d \n", Math.min(15, 10));
        System.out.printf("The min is = %f \n", Math.min(15.52, 15.55));

        /*
        a) Output:
           PI is: 3.141592653589
           2 to the power of 3 = 16.0
           Absolute value of -5 = 5
           Absolute value of -5.5 = 5.5
           The max is = 15
           The max is = 15.55
           The min is = 10
           The min is = 15.52
        
        b) i = 6.283185...
           ii = 16.0
           iii = 15
           iv = 15
           v = 13
        */

         // Excercise 3

         Scanner userInput = new Scanner (System.in);
         double radius = 0.0;

         System.out.println("Please enter a radius value: ");
         radius = userInput.nextDouble();

         System.out.printf("Area of a circle with a radius of %.2f is equal to %.2f", radius, (Math.PI * Math.pow(radius, 2)));

         // Excercise 4

         int radius2 = 0;

         System.out.println("Please enter a radius value: ");
         radius2 = userInput.nextInt();

         System.out.printf("A square with a radius of %d has a surface area of %.3f squared cm and a volume of %.3f cubic cm", radius2, (4 * Math.PI * Math.pow(radius2, 2)), (4.0/3.0 * Math.PI * Math.pow(radius2, 3)));

         // Excercise 5
    }
}
