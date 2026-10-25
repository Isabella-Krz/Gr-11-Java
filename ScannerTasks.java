/*
scannerTasks.java
Scanner Area Tasks

@Student: Isabella K
@Teacher: Carreiro

@Description: In exercise 1, the area is calculated when the user inputs a number for the length and width. In excerise 2, the area is found from the length and width of a farmer's field from the user in feet and displayed in acres.
*/

import java.util.Scanner;

public class scannerTasks {
    public static void main(String[] args) {

        //Variable declaration

        double length = 0.0;
        double width = 0.0;

        double area = length * width;

        double areaInAcres = length * width / 43560

        Scanner userInput = new Scanner (System.in);

        // Excercise 1 - Area of a room (commented out for exercise 2)

        // System.out.print("What is the length of your room? ");
        // length = userInput.nextDouble();

        // System.out.print("What is the width of your room? ");
        // width = userInput.nextDouble();

        // System.out.printf("The area of of your room is %f units squared", area);

        // Excercise 2 - Area of a feild

        System.out.print("What is the length of your field in feet? ");
        length = userInput.nextDouble();

        System.out.print("What is the width of your field in feet? ");
        width = userInput.nextDouble();

        System.out.printf("The area of your field is %f acres", areaInAcres);
    }
}